/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP.De1;

import java.io.Serializable;

public class user implements Serializable{
    private String Name;
    private String Birth;
    private String Address;
    private String Sex;

    public user() {
    }

    public user(String Name, String Birth, String Address, String Sex) {
        this.Name = Name;
        this.Birth = Birth;
        this.Address = Address;
        this.Sex = Sex;
    }

    public String getName() {
        return Name;
    }

    public String getBirth() {
        return Birth;
    }

    public String getAddress() {
        return Address;
    }

    public String getSex() {
        return Sex;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setBirth(String Birth) {
        this.Birth = Birth;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public void setSex(String Sex) {
        this.Sex = Sex;
    }

    @Override
    public String toString() {
        return "user{" + "Name=" + Name + ", Birth=" + Birth + ", Address=" + Address + ", Sex=" + Sex + '}';
    }
}
