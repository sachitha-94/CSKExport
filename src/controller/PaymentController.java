/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import db.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.Payment;

/**
 *
 * @author Sachitha
 */
public class PaymentController {

    public static int addPayment(Payment payment) throws ClassNotFoundException, SQLException {

        Connection conn = DBConnection.getInstance().getConnection();
        PreparedStatement stm = conn.prepareStatement("INSERT INTO tab_payment(cid,grossWeight,wetWeight,reduceWeight,amount,cheqNo,date) VALUES(?,?,?,?,?,?,now())");
        stm.setObject(1, payment.getCid());
        stm.setObject(2, payment.getGrossWeight());
        stm.setObject(3, payment.getWetWeight());
        stm.setObject(4, payment.getReduceWeight());
        stm.setObject(5, payment.getAmount());
        stm.setObject(6, payment.getCheqNo());

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

//    public static ArrayList<Payment> getFoodCountInDay(String date) throws ClassNotFoundException, SQLException {
//        Connection conn = DBConnection.getInstance().getConnection();
//        Statement stm = conn.createStatement();
//        String sql = " select fid, sum(quntity) from payment where date='" + date + "' group by fid";
//        ResultSet rst = stm.executeQuery(sql);
//        ArrayList<Payment> list = new ArrayList();
//        while (rst.next()) {
//            Payment payment = new Payment();
//            payment.setFid(rst.getString("fid"));
//            payment.setQuntity(rst.getInt("sum(quntity)"));
//            list.add(payment);
//
//        }
//        return list;
//    }

}
