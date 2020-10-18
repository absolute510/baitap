/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TH1.buoi3.bai2;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class DocTuTextFile {
    public static ArrayList<GiaoVien> docFile(String path) {
        ArrayList<GiaoVien> ds = new ArrayList<GiaoVien>();
        try {
            FileInputStream fis = new FileInputStream(path);
            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader br = new BufferedReader(isr);
            String line = br.readLine();
            while (line != null) {
                GiaoVien t = new GiaoVien();
                if (line.length() > 0) {
                    //System.out.println(line);
                    String[] result = line.split("\\$");
                    //System.out.println(Arrays.toString(result));
                    t.setHoTen(result[0]);
                    t.setNamSinh(result[1]);
                    t.setNamSinh(result[2]);
                    t.setLuongCB(Integer.parseInt(result[3]));
                    t.setThuong(Integer.parseInt(result[4]));
                    t.setPhat(Integer.parseInt(result[5]));
                    t.setLuong(Integer.parseInt(result[6]));

                    ds.add(t);
                }
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
