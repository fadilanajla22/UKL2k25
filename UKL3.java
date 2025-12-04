/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ukl3;

/**
 *
 * @author LOQ
 */
import java.util.Random;
import java.util.Scanner;
public class UKL3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        while (true) {
            int bil1 = random.nextInt(20) + 1; // bilangan acak 1–20
            int bil2 = random.nextInt(19) + 1; // bilangan acak 1–20
            char operator;

            // Memilih operator secara acak: 0 = *, 1 = /, 2 = %
            int pilih = random.nextInt(3);

            if (pilih == 0) {
                operator = '*';
            } else if (pilih == 1) {
                operator = '/';
            } else {
                operator = '%';
            }

            // Menghitung jawaban sebenarnya
            int jawabanBenar = 0;

            switch (operator) {
                case '*':
                    jawabanBenar = bil1 * bil2;
                    break;
                case '/':
                    jawabanBenar = bil1 / bil2;
                    break;
                case '%':
                    jawabanBenar = bil1 % bil2;
                    break;
            }

            // Menampilkan soal
            System.out.print("Berapa hasil dari: " + bil1 + " " + operator + " " + bil2 + " = ");
            int jawabanUser = input.nextInt();

            // Mengecek jawaban
            if (jawabanUser == jawabanBenar) {
                System.out.println("Benar! 🎉");
            } else {
                System.out.println("Salah! Jawaban yang benar adalah: " + jawabanBenar);
            }

            // Tanya apakah lanjut
            System.out.print("Lanjut kuis? (ya/tidak): ");
            String lanjut = input.next();

            if (lanjut.equalsIgnoreCase("tidak")) {
                System.out.println("Kuis selesai. Terima kasih!");
                break;
            }
        }
    }
}
    
 
