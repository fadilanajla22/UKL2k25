/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ukl5;

/**
 *
 * @author LOQ
 */
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class UKL5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        
        ArrayList<Integer> lemparKomputer = new ArrayList<>();
        ArrayList<Integer> lemparPemain = new ArrayList<>();
        
        int menangKomputer = 0;
        int menangPemain = 0;
        
        System.out.println("=== Permainan Lempar Dadu ===");
        
        while (menangKomputer < 5 && menangPemain < 5) {
            
            System.out.println("Tekan tombol apa saja untuk melempar dadu pemain: ");
            input.next();
            
            int daduKomputer = random.nextInt(6) + 1;
            int daduPemain = random.nextInt(6) +1;
            
            lemparKomputer.add(daduKomputer);
            lemparPemain.add(daduPemain);

            System.out.println("Nilai dadu komputer: " + daduKomputer);
            System.out.println("Nilai dadu pemain  : " + daduPemain);

            if (daduPemain > daduKomputer) {
                menangPemain++;
                System.out.println("Pemain menang di ronde ini!\n");
            } else if (daduKomputer > daduPemain) {
                menangKomputer++;
                System.out.println("Komputer menang di ronde ini!\n");
            } else {
                System.out.println("Seri!\n");
            }
        }

        System.out.println("=== Permainan Selesai ===");

        if (menangPemain > menangKomputer) {
            System.out.println("Pemenangnya adalah: PEMAIN");
        } else {
            System.out.println("Pemenangnya adalah: KOMPUTER");
        }

        System.out.println("\n--- Rekap Riwayat Lemparan ---");

        System.out.println("Riwayat lemparan komputer: " + lemparKomputer);
        System.out.println("Riwayat lemparan pemain  : " + lemparPemain);

        System.out.println("\nTotal kemenangan komputer: " + menangKomputer);
        System.out.println("Total kemenangan pemain  : " + menangPemain);
    }
}
        
    

