/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laptrinhmang_tcp3;

/**
 *
 * @author ic3burG
 */
public class Word {
    private String VN;
    private String EN;

    public Word() {
    }

    public Word(String VN, String EN) {
        this.VN = VN;
        this.EN = EN;
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
        return "Word{" + "VN=" + VN + ", EN=" + EN + '}';
    }
}
