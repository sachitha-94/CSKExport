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
public class Payment {

    private int pid;
    private String cid;
    private String type;
    private double grossWeight;
    private double wetWeight;
    private double reduceWeight;
    private double amount;
    private Date date;

    public Payment() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public double getGrossWeight() {
        return grossWeight;
    }

    public void setGrossWeight(double grossWeight) {
        this.grossWeight = grossWeight;
    }

    public double getWetWeight() {
        return wetWeight;
    }

    public void setWetWeight(double wetWeight) {
        this.wetWeight = wetWeight;
    }

    public double getReduceWeight() {
        return reduceWeight;
    }

    public void setReduceWeight(double reduceWeight) {
        this.reduceWeight = reduceWeight;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

}
