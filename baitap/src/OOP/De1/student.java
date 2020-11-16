/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP.De1;

import java.util.Date;

/**
 *
 * @author ic3burG
 */
public class student extends user{
    private String ID;
    private Float Math;
    private Float Physics;
    private Float Chemistry;

    public student() {
        super();
    }

    public student(String ID, Float Math, Float Physics, Float Chemistry, String Name, String Birth, String Address, String Sex) {
        super(Name, Birth, Address, Sex);
        this.ID = ID;
        this.Math = Math;
        this.Physics = Physics;
        this.Chemistry = Chemistry;
    }

    public String getID() {
        return ID;
    }

    public Float getMath() {
        return Math;
    }

    public Float getPhysics() {
        return Physics;
    }

    public Float getChemistry() {
        return Chemistry;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setMath(Float Math) {
        this.Math = Math;
    }

    public void setPhysics(Float Physics) {
        this.Physics = Physics;
    }

    public void setChemistry(Float Chemistry) {
        this.Chemistry = Chemistry;
    }

    @Override
    public String toString() {
        return "student{"+ super.toString() + "ID=" + ID + ", Math=" + Math + ", Physics=" + Physics + ", Chemistry=" + Chemistry + '}';
    }
}
