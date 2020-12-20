/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studikasuskonversi;

import java.util.Scanner;

/**
 *
 * @author Puja
 */
public class Konversi {
    public static void main(String[] args){
        System.out.println("Pilihan Konversi:\n"
        + " 1. Jam -> Menit\n"
        + " 2. Detik ->, jam, menit, dandetik");
        System.out.println("\nMasukan pilihan");
        try (Scanner options = new Scanner(System.in)){
            if (!options.hasNextInt()){
            System.out.println("itu alfabet, anda salah!");    
            } else{
                if (options.nextInt() == 1){
                    System.out.println("Masukan jam :");
                    Scanner hours = new Scanner(System.in);
                    jamKeMenit(hours.nextLong());
                } else {
                    System.out.println("Masukan detik :");
                    try (Scanner seconds = new Scanner(System.in)){
                    detikKeHari(seconds.nextLong());    
                    }
                }
            }
        } 
    }
    public static void jamKeMenit(Long jam){
        long menit = jam * 60;
        System.out.println("Menit: " + menit);
    }
    public static void detikKeHari(Long detik){
        
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
        System.out.println(hari + "Hari, " + jam + "jam, " + menit + "menit, " + detik + "detik, ");
    }
}
