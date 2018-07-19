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
import model.Supplier;

/**
 *
 * @author Sachitha
 */
public class SupplierController {

    public static int addSupplier(Supplier supplier) throws ClassNotFoundException, SQLException {

        Connection conn = DBConnection.getInstance().getConnection();
        PreparedStatement stm = conn.prepareStatement("INSERT INTO tab_supplier(nic,name,address,tp) values(?,?,?,?)");
        stm.setObject(1, supplier.getNic());
        stm.setObject(2, supplier.getName());
        stm.setObject(3, supplier.getAddress());
        stm.setObject(4, supplier.getTp());

        return stm.executeUpdate();

    }

    public static int editSuplier(Supplier supplier) throws ClassNotFoundException, SQLException {

        Connection conn = DBConnection.getInstance().getConnection();
        PreparedStatement stm = conn.prepareStatement("UPDATE tab_supplier SET name=?,address=?,tp=? where nic=?");
        stm.setObject(1, supplier.getName());
        stm.setObject(2, supplier.getAddress());
        stm.setObject(3, supplier.getTp());
        stm.setObject(4, supplier.getNic());

        return stm.executeUpdate();

    }

    public static int removeSupplier(String nic) throws ClassNotFoundException, SQLException {
        Connection conn = DBConnection.getInstance().getConnection();
        PreparedStatement stm = conn.prepareStatement("DELETE FROM tab_supplier where nic=?");
        stm.setObject(1, nic);
        return stm.executeUpdate();

    }

    public static Supplier getSupplierFromNIC(String nic) throws ClassNotFoundException, SQLException {

        Connection conn = DBConnection.getInstance().getConnection();
        PreparedStatement stm = conn.prepareStatement("SELECT * FROM tab_supplier where nic=?");
        stm.setObject(1, nic);
        ResultSet rst = stm.executeQuery();
        if (rst.next()) {
            Supplier supplier = new Supplier(nic, rst.getString("name"), rst.getString("address"), rst.getInt("tp"));

            return supplier;

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

    public static ArrayList<Supplier> getAllSupplier() throws ClassNotFoundException, SQLException {

        Connection conn = DBConnection.getInstance().getConnection();
        Statement stm = conn.createStatement();
        String sql = "SELECT * FROM tab_supplier ";
        ResultSet rst = stm.executeQuery(sql);
        ArrayList<Supplier> suppliers = new ArrayList<>();
        while (rst.next()) {
            Supplier supplier = new Supplier(rst.getString("nic"), rst.getString("name"), rst.getString("address"), rst.getInt("tp"));
            suppliers.add(supplier);

        }
        return suppliers;
    }

}
