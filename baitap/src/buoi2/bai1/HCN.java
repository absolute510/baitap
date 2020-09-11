/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi2.bai1;

public class HCN {
    private double chieudai;
    private double chieurong;

    public double getChieudai() {
        return chieudai;
    }

    public void setChieudai(double chieudai) {
        this.chieudai = chieudai;
    }

    public double getChieurong() {
        return chieurong;
    }

    public void setChieurong(double chieurong) {
        this.chieurong = chieurong;
    }

    public double dientich(){
        return this.chieudai*this.chieurong;
    }

    public double chuvi(){
        return (this.chieurong+this.chieudai)*2;
    }

    @Override
    public String toString(){
        return "Chiều dài: "+this.chieudai+"\nChiều rộng: "+this.chieurong+"\nChu vi: "+chuvi()+"\nDiện tích: "+dientich();
    }
}
