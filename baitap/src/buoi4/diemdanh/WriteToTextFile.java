/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi4.diemdanh;

import java.io.*;
import java.util.ArrayList;

public class WriteToTextFile {
    public static boolean ghiFile(ArrayList<String> dsc, String path) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            OutputStreamWriter osw = new OutputStreamWriter(fos);
            BufferedWriter bw = new BufferedWriter(osw);
            for (String string : dsc) {
                bw.write(string);
                bw.newLine();
            }
            bw.close();
            osw.close();
            fos.close();

        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
}
