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
import model.Cheque;
import model.CinnamonType;
import model.Reducer;

/**
 *
 * @author Sachitha
 */
public class ReducerController {

    public static int addReducer(Reducer reducer) throws ClassNotFoundException, SQLException {

        Connection conn = DBConnection.getInstance().getConnection();
        PreparedStatement stm = conn.prepareStatement("INSERT INTO tab_reducer (rangevalue,amount) values(?,?,?)");
        stm.setObject(1, reducer.getRangeValue());
        stm.setObject(2, reducer.getAmount());
        return stm.executeUpdate();

    }

    public static int editReducerAmount(Reducer reducer) throws ClassNotFoundException, SQLException {

        Connection conn = DBConnection.getInstance().getConnection();
        PreparedStatement stm = conn.prepareStatement("UPDATE tab_reducer SET amount=? where rid=?");
        stm.setObject(1, reducer.getAmount());
        stm.setObject(2, reducer.getRid());
        return stm.executeUpdate();

    }

    public static Reducer getAmountFromRID(String rid) throws ClassNotFoundException, SQLException {

        Connection conn = DBConnection.getInstance().getConnection();
        PreparedStatement stm = conn.prepareStatement("SELECT * FROM tab_reducer where rid=?");
        stm.setObject(1, rid);
        ResultSet rst = stm.executeQuery();
        if (rst.next()) {
            Reducer reducer = new Reducer();
            reducer.setAmount(rst.getDouble("amount"));
            reducer.setRangeValue(rst.getString("rangevalue"));
            
            return reducer;

        } else {
            return null;
        }
    }
}
