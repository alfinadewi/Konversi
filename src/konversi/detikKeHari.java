/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package konversi;

/**
 *
 * @author admin
 */
public class detikKeHari {
    public static void detikKeHari(long detik) {
        //hari
        int hari = (int) (detik / (60 * 60 * 24));
        //jam
        detik %= (60 * 60 * 24);
        int jam = (int) (detik / (60 * 60));
        //menit
        detik %= (60 * 60);
        int menit = (int) (detik / 60);
        //detik
        detik %= 60;
        System.out.println(hari + " Hari, " + jam + "jam , " + menit + " menit, " + detik + " detik");
    }
}
