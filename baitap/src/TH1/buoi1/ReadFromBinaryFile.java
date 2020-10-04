/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TH1.buoi1;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class ReadFromBinaryFile {
    public static ArrayList<Student> docFile(String path) {
        try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Object data = ois.readObject();
            ois.close();
            fis.close();
            return (ArrayList<Student>) data;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
