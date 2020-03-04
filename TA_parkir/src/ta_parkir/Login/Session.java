/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ta_parkir.Login;

/**
 *
 * @author Assalam
 */
public class Session {
private static String userID, Nama, StatusLogin;

    public static String getUserID() {
        return userID;
    }

    public static void setUserID(String userID) {
        Session.userID = userID;
    }

    public static String getNama() {
        return Nama;
    }

    public static void setNama(String Nama) {
        Session.Nama = Nama;
    }

    public static String getStatusLogin() {
        return StatusLogin;
    }

    public static void setStatusLogin(String StatusLogin) {
        Session.StatusLogin = StatusLogin;
    }
 
 
}
