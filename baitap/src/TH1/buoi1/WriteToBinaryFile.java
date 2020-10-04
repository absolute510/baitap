/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TH1.buoi1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class WriteToBinaryFile {
    public static boolean ghiFile(ArrayList<Student> dssv, String path) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(dssv);
            oos.close();
            fos.close();

        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
}
