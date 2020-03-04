/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ta_parkir.Login;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import ta_parkir.koneksi;
import ta_parkir.Login.Session;

/**
 *
 * @author Assalam
 */
public class Login {

    private Connection koneksi;
    private PreparedStatement psmt;
    private ResultSet dataUser;
    private String query, userData, password, pesan;

    public Login() {
        koneksi connection = new koneksi();
        try {
            koneksi = connection.getKoneksi();
        } catch (SQLException e) {
        }
    }
    public Connection getKoneksi() {
        return koneksi;
    }

    public void setKoneksi(Connection koneksi) {
        this.koneksi = koneksi;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public String getUserData() {
        return userData;
    }

    public void setUserData(String userData) {
        this.userData = userData;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPesan() {
        return pesan;
    }

    public void setPesan(String pesan) {
        this.pesan = pesan;
    }
    public String cekLogin(String userID, String password)
    {
        query = "SELECT * FROM admin WHERE id_user=? AND password=md5(?)";
        try{
            psmt = koneksi.prepareStatement(query);
            psmt.setString(1, userID);
            psmt.setString(2, password);
            dataUser = psmt.executeQuery();
            
            if(dataUser.next()){
                Session.setUserID(userID);
                Session.setNama(dataUser.getString("nama"));
                Session.setStatusLogin("AKTIF");
                
                query = "INSERT INTO log)login(id_user) Values(?)";
                try{
                    psmt = koneksi.prepareStatement(query);
                    psmt.setString(1, userID);
                    psmt.executeUpdate();
                    psmt.close();
                }catch(Exception e){
                    pesan = "Gagal Simpan Log Login";
                }
            }else{
                pesan = "Gagal Login";
            }
        }catch(Exception e){
            pesan = "Gagal Login, Query ERROR";
        }
        return pesan;
    }
    
    public void Logout (String UserID){
        query = "UPDATE log_login SET waktu_logout=CURRENT_TIMESTAMP WHERE id_user = ? ORDER BY id DESC LIMIT 1";
        try{
            psmt = koneksi.prepareStatement(query);
            psmt.setString(1, UserID);
            psmt.executeUpdate();
            psmt.close();
            
            //Memutus Koneksi database
            koneksi.close();
            
            //hapus Session
            Session.setUserID(null);
            Session.setNama(null);
            Session.setStatusLogin(null);
        }catch (Exception e){
            
        }
    }
}
