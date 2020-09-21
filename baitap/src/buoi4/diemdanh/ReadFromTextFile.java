/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi4.diemdanh;

import java.io.*;
import java.util.ArrayList;

public class ReadFromTextFile {
     public static ArrayList<String> docFile(String path) {
        ArrayList<String> ds = new ArrayList<String>();
        try {
            FileInputStream fis = new FileInputStream(path);
            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader br = new BufferedReader(isr);
            String line = br.readLine();
            while (line != null) {
                if (line.length() > 0)
                    ds.add(line);
                line = br.readLine();
            }
            br.close();
            isr.close();
            fis.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return ds;
    }
}
