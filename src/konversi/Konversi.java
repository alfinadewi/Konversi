/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package konversi;

import java.util.Scanner;
import static konversi.detikKeHari.detikKeHari;
import static konversi.jamKeMenit.jamKeMenit;

/**
 *
 * @author admin
 */
public class Konversi {
    /**
     * 
     * @param args
     */
    public static void main(String[] args){
        
        System.out.println("Pilihan Konversi:\n"
                + " 1. Jam -> Menit\n"
                + " 2. Detik -> Hari, jam, menit, dan detik");
        
        System.out.println("\nMasukkan pilihan");
        try (Scanner options = new Scanner(System.in)) {
            if (!options.hasNextInt()) {
                System.out.println("Itu alfabet, anda salah!");
            } else {
                if (options.nextInt() == 1) {
                    System.out.println("Masukkan jam : ");
                    Scanner hours = new Scanner(System.in);
                    jamKeMenit(hours.nextInt());
                    //hourToMinutes(hours.nextInt());
                } else {
                    System.out.println("Masukkan detik : ");
                    try (Scanner seconds = new Scanner(System.in)) {
                        detikKeHari(seconds.nextLong());
                        //secondToDays(seconds.mextLong());
                    }
                }
            }
        }
    }
}
