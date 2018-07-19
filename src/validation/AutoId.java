/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package validation;

import db.DBConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.NumberFormat;

/**
 *
 * @author ASUS
 */
public class AutoId {
    
  public static String getNextId(String tableName, String columnName, String prefix) throws ClassNotFoundException,SQLException {
        String sql = "select " + columnName + " from " + tableName + "  order by 1 desc limit 1";
        Connection connection =DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        if (rst.next()) {
            int index = 0;
            String currentId = rst.getString(1);

            for (int i = 0; i < currentId.length(); i++) {
                char ch = currentId.charAt(i);
                if (Character.isDigit(ch)) {
                    index = i;
                    break;
                } 
            }
            int num = Integer.parseInt(currentId.substring(index));
            num++;
            NumberFormat numberFormat = NumberFormat.getNumberInstance();

            numberFormat.setMinimumIntegerDigits(3);
            String formattedNum = numberFormat.format(num);

            String nextId = prefix + formattedNum;
            return nextId;
        } else {
            return prefix + "001";
        }

    }
}
