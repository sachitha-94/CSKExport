/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import db.DBConnection;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sachitha
 */
public class NewClass {

    public static void main(String args[]) {
        try {
            Connection conn = DBConnection.getInstance().getConnection();
            if (conn != null) {
                System.out.println("ok");
            } else {
                System.out.println("worng");
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(NewClass.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}