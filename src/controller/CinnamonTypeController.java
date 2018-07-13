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
import java.sql.Statement;
import java.util.ArrayList;
import model.CinnamonType;
import model.Supplier;

/**
 *
 * @author Sachitha
 */
public class CinnamonTypeController {

    public static int addType(CinnamonType cinnamonType) throws ClassNotFoundException, SQLException {

        Connection conn = DBConnection.getInstance().getConnection();
        PreparedStatement stm = conn.prepareStatement("INSERT INTO tab_cinnamontype (cid,type,price) values(?,?,?)");
        stm.setObject(1, cinnamonType.getCid());
        stm.setObject(2, cinnamonType.getType());
        stm.setObject(3, cinnamonType.getPrice());

        return stm.executeUpdate();

    }

    public static int editType(CinnamonType cinnamonType) throws ClassNotFoundException, SQLException {

        Connection conn = DBConnection.getInstance().getConnection();
        PreparedStatement stm = conn.prepareStatement("UPDATE tab_cinnamontype SET type=?,price=? where cid=?");
        stm.setObject(1, cinnamonType.getType());
        stm.setObject(2, cinnamonType.getPrice());
        stm.setObject(3, cinnamonType.getCid());

        return stm.executeUpdate();

    }

    public static int removeType(String cid) throws ClassNotFoundException, SQLException {
        Connection conn = DBConnection.getInstance().getConnection();
        PreparedStatement stm = conn.prepareStatement("DELETE FROM tab_cinnamontype where cid=?");
        stm.setObject(1, cid);
        return stm.executeUpdate();

    }

    public static CinnamonType getCinnamonFromCID(String cid) throws ClassNotFoundException, SQLException {

        Connection conn = DBConnection.getInstance().getConnection();
        PreparedStatement stm = conn.prepareStatement("SELECT * FROM tab_cinnamontype where cid=?");
        stm.setObject(1, cid);
        ResultSet rst = stm.executeQuery();
        if (rst.next()) {
            CinnamonType cinnamonType = new CinnamonType(cid, rst.getString("type"), rst.getDouble("price"));

            return cinnamonType;

        } else {
            return null;
        }

    }

//    public static String checkEmplyeeUsingEid(String eid) throws ClassNotFoundException, SQLException {
//
//        Connection conn = DBConnection.getInstance().getConnection();
//        Statement stm = conn.createStatement();
//        String sql = "SELECT eid FROM employee where eid='" + eid + "'";
//        ResultSet rst = stm.executeQuery(sql);
//        if (rst.next()) {
//            return rst.getString("eid");
//        } else {
//            return null;
//        }
//
//    }
//    public static Employee searchEmplyeeUsingName(String name) throws ClassNotFoundException, SQLException {
//
//        Connection conn = DBConnection.getInstance().getConnection();
//        Statement stm = conn.createStatement();
//        String sql = "SELECT * FROM employee where name='" + name + "'";
//        ResultSet rst = stm.executeQuery(sql);
//        if (rst.next()) {
//            Employee employee = new Employee(rst.getString("eid"), name, rst.getString("addres"), rst.getString("tpNo"));
//
//            return employee;
//
//        } else {
//            return null;
//        }
//
//    }
//    public static String getNameUsingEid(String eid) throws ClassNotFoundException, SQLException {
//
//        Connection conn = DBConnection.getInstance().getConnection();
//        Statement stm = conn.createStatement();
//        String sql = "SELECT name FROM employee where eid='" + eid + "'";
//        ResultSet rst = stm.executeQuery(sql);
//        if (rst.next()) {
//
//            return rst.getString("name");
//
//        } else {
//            return null;
//        }
//
//    }
    public static ArrayList<CinnamonType> getAllCinnamon() throws ClassNotFoundException, SQLException {

        Connection conn = DBConnection.getInstance().getConnection();
        Statement stm = conn.createStatement();
        String sql = "SELECT * FROM tab_cinnamontype ";
        ResultSet rst = stm.executeQuery(sql);
        ArrayList<CinnamonType> cinnamonTypes = new ArrayList<>();
        while (rst.next()) {
            CinnamonType cinnamonType = new CinnamonType(rst.getString("nic"), rst.getString("type"), rst.getDouble("price"));
            cinnamonTypes.add(cinnamonType);

        }
        return cinnamonTypes;
    }

}
