/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package validation;

import javax.swing.JTextField;

/**
 *
 * @author max
 */
public class CheckNumber {

    public static void checktelephone(JTextField telephoneText) {
        String tpNo = telephoneText.getText();
        int position = telephoneText.getCaretPosition();
        if (tpNo.length() > 0) {
            if (tpNo.matches("[0-9]+") == false) {

                tpNo = tpNo.substring(0, position - 1);
                telephoneText.setText(tpNo);
                telephoneText.setCaretPosition(position - 1);
            }

            if (tpNo.length() > 10) {
                tpNo = tpNo.substring(0, position - 1);
                telephoneText.setText(tpNo);
                telephoneText.setCaretPosition(position - 1);
            }

        }
    }

    public static void checkInt(JTextField telephoneText) {
        String tpNo = telephoneText.getText();
        int position = telephoneText.getCaretPosition();
        if (tpNo.length() > 0) {
            if (tpNo.matches("[0-9]+") == false) {

                tpNo = tpNo.substring(0, position - 1);
                telephoneText.setText(tpNo);
                telephoneText.setCaretPosition(position - 1);
            }

        }
    }
    
     public static void checkDecimal(JTextField telephoneText) {
        String tpNo = telephoneText.getText();
        int position = telephoneText.getCaretPosition();
        if (tpNo.length() > 0) {
            if (tpNo.matches("[0-9.]+") == false) {

                tpNo = tpNo.substring(0, position - 1);
                telephoneText.setText(tpNo);
                telephoneText.setCaretPosition(position - 1);
            }

        }
    }

}
