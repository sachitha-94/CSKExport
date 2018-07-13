/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author Sachitha
 */
public class Cheque {
    private String cheqNo;
    private String nic;
    private String bankName;
    private Date issueDate;

    public Cheque() {
    }

    public Cheque(String cheqNo, String nic, String bankName, Date issueDate) {
        this.cheqNo = cheqNo;
        this.nic = nic;
        this.bankName = bankName;
        this.issueDate = issueDate;
    }

    public String getCheqNo() {
        return cheqNo;
    }

    public void setCheqNo(String cheqNo) {
        this.cheqNo = cheqNo;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public Date getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(Date issueDate) {
        this.issueDate = issueDate;
    }
    
}
