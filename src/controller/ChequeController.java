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
import model.Cheque;
import model.CinnamonType;

/**
 *
 * @author Sachitha
 */
public class ChequeController {

    public static int addCheque(Cheque cheque) throws ClassNotFoundException, SQLException {

        Connection conn = DBConnection.getInstance().getConnection();
        PreparedStatement stm = conn.prepareStatement("INSERT INTO tab_cheque (cheqNo,pid,nic,bankName,issueDate) values(?,?,?,?,now())");
        System.out.println(cheque.getPid());
        stm.setObject(1, cheque.getCheqNo());
        stm.setObject(2, cheque.getPid());
        stm.setObject(3, cheque.getNic());
        stm.setObject(4, cheque.getBankName());

        return stm.executeUpdate();

    }

    public static int editCheque(CinnamonType cinnamonType) throws ClassNotFoundException, SQLException {

        Connection conn = DBConnection.getInstance().getConnection();
        PreparedStatement stm = conn.prepareStatement("UPDATE tab_cheque SET cheqNo=?,nic=? ,issueDate=? where cid=?");
        stm.setObject(1, cinnamonType.getType());
        stm.setObject(2, cinnamonType.getPrice());
        stm.setObject(3, cinnamonType.getCid());

        return stm.executeUpdate();

    }

 
}
