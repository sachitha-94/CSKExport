/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import db.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Payment;

/**
 *
 * @author Sachitha
 */
public class PaymentController {

    public static int addPayment(Payment payment) throws ClassNotFoundException, SQLException {

        Connection conn = DBConnection.getInstance().getConnection();
        PreparedStatement stm = conn.prepareStatement("INSERT INTO tab_payment(pid,cid,grossWeight,wetWeight,reduceWeight,amount,date) VALUES(?,?,?,?,?,?,now())");
        stm.setObject(1, payment.getPid());
        stm.setObject(2, payment.getCid());
        stm.setObject(3, payment.getGrossWeight());
        stm.setObject(4, payment.getWetWeight());
        stm.setObject(5, payment.getReduceWeight());
        stm.setObject(6, payment.getAmount());

        return stm.executeUpdate();
    }

    
    public static int addPaymentToTemp(Payment payment) throws ClassNotFoundException, SQLException {

        Connection conn = DBConnection.getInstance().getConnection();
        PreparedStatement stm = conn.prepareStatement("INSERT INTO tab_temp_payment(cid,grossWeight,wetWeight,reduceWeight,amount,date) VALUES(?,?,?,?,?,now())");
        stm.setObject(1, payment.getCid());
        stm.setObject(2, payment.getGrossWeight());
        stm.setObject(3, payment.getWetWeight());
        stm.setObject(4, payment.getReduceWeight());
        stm.setObject(5, payment.getAmount());

        return stm.executeUpdate();
    }
//    public static double getTotalInDAy(String date) throws ClassNotFoundException, SQLException {
//        Connection conn = DBConnection.getInstance().getConnection();
//        Statement stm = conn.createStatement();
//        String sql = "SELECT SUM(amount) FROM payment WHERE date='" + date + "' ";
//        ResultSet rst = stm.executeQuery(sql);
//        if (rst.next()) {
//
//            return rst.getDouble("SUM(amount)");
//
//        } else {
//            return 0;
//        }
//
//    }

    public static ArrayList<Payment> getAllTempOrders() throws ClassNotFoundException, SQLException {
        Connection conn = DBConnection.getInstance().getConnection();
        PreparedStatement stm = conn.prepareStatement("select * from tab_temp_payment");
        
        ResultSet rst = stm.executeQuery();
        ArrayList<Payment> list = new ArrayList();
        while (rst.next()) {
            Payment payment = new Payment();
            payment.setCid(rst.getString("cid"));
            payment.setGrossWeight(rst.getDouble("grossWeight"));
            payment.setWetWeight(rst.getDouble("wetWeight"));
            payment.setReduceWeight(rst.getDouble("reduceWeight"));
            payment.setAmount(rst.getDouble("amount"));
            list.add(payment);

        }
        return list;
    }

}
