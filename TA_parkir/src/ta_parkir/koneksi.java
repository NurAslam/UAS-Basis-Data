/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ta_parkir;
import java.sql.*;
/**
 *
 * @author zurin
 */
public class koneksi {
    public Connection conn;
    public Statement st;
    public ResultSet rs;
    private String driverName = "com.mysql.jdbc.Driver";
    private String jdbc = "jdbc:mysql://";
    private String host = "localhost:";
    private String port = "3306/";
    private String database = "parkir";
    private String url = jdbc + host + port + database;
    private String username = "root";
    private String password = "";
    public Connection getKoneksi(String server, String db, String user,String passwd) throws SQLException {
        if (conn == null) {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                System.out.println("Class Driver Ditemukan");
                try {
                    conn = DriverManager.getConnection("jdbc:mysql://"+server+":3306/"+db,user,passwd);
                    System.out.println("Koneksi Database Sukses");
                } catch (SQLException se) {
                    System.out.println("Koneksi Database Gagal "+se);
                    System.exit(0);
                }
            } catch (ClassNotFoundException cnfe) {
                System.out.println("Class Driver tidak ditemukan, Terjadi kesalahan Pada : " + cnfe);
                System.exit(0);
            }
        }
        return conn;
    }
    public void koneksi()
    {   
        konek("localhost","parkir","root","");
    }
    public void konek(String server, String db, String user,String passwd){
        System.out.println("Keterangan");
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Driver JDBC tidak barhasil Load");
            e.printStackTrace();
            return;
        }
        System.out.println("Driver berhasil di Load");
        conn = null;
        try {
            conn = DriverManager.getConnection(
            "jdbc:mysql://"+server+":3306/"+db,user,passwd);
        } catch (SQLException e) {
            System.out.println("Tidak bisa koneksi ke database");
            e.printStackTrace();
            return;
        }
        if (conn != null)
            System.out.println("Berhasil Koneksi!");
        else
            System.out.println("Koneksi Gagal........ !");
        }
    public Connection getKoneksi() throws SQLException {
        if (conn == null) {
            try {
                Class.forName(driverName);
                System.out.println("Class Driver Ditemukan");
                try {
                    conn = DriverManager.getConnection(url, username, password);
                    System.out.println("Koneksi Database Sukses");
                } catch (SQLException se) {
                    System.out.println("Koneksi Database Gagal "+se);
                    System.exit(0);
                }
            } catch (ClassNotFoundException cnfe) {
                System.out.println("Class Driver tidak ditemukan, Terjadi kesalahan Pada : " + cnfe);
                System.exit(0);
            }
        }
        return conn;
    }
}    
    




