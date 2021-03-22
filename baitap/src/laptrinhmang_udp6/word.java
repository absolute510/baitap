/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laptrinhmang_udp6;

/**
 *
 * @author ic3burG
 */
public class word {

    private String VN;
    private String EN;

    public word(String VN, String EN) {
        this.VN = VN;
        this.EN = EN;
    }
    public word() {
    }

    public String getVN() {
        return VN;
    }

    public String getEN() {
        return EN;
    }

    public void setVN(String VN) {
        this.VN = VN;
    }

    public void setEN(String EN) {
        this.EN = EN;
    }

    @Override
    public String toString() {
        return "word{" + "VN=" + VN + ", EN=" + EN + '}';
    }
}
