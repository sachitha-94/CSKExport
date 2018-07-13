/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Sachitha
 */
public class Supplier {
    
    private String nic;
    private String name;
    private String address;
    private int tp;

    public Supplier() {
    }

    public Supplier(String nic, String name, String address, int tp) {
        this.nic = nic;
        this.name = name;
        this.address = address;
        this.tp = tp;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getTp() {
        return tp;
    }

    public void setTp(int tp) {
        this.tp = tp;
    }
    
    
}
