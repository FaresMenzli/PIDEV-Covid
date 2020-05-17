/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esprit.Service;

import com.esprit.utils.DataBase;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MKadmin
 */
public class ServiceQuestion {
    private Connection con = DataBase.getInstance().getConnection();
    private Statement ste;
     public ServiceQuestion() {
        try {
            ste = con.createStatement();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
     
    public String  afficheQuestion() {
        String Qu = null ;
       try {
           ResultSet rs = ste.executeQuery("select * from Question where Q_id=1 ;")  ;
          while (rs.next()){
            Qu = rs.getString(2);}
       } catch (SQLException ex) {
           System.out.println(ex);}
         return Qu ;
}
public String  afficheQuestion2() {
        String Qu = null ;
       try {
           ResultSet rs = ste.executeQuery("select * from Question where Q_id=2 ;")  ;
          while (rs.next()){
            Qu = rs.getString(2);}
       } catch (SQLException ex) {
           System.out.println(ex);}
         return Qu ;
}
public String  afficheQuestion3() {
        String Qu = null ;
       try {
           ResultSet rs = ste.executeQuery("select * from Question where Q_id=2 ;")  ;
          while (rs.next()){
            Qu = rs.getString(2);}
       } catch (SQLException ex) {
           System.out.println(ex);}
         return Qu ;
}
}
