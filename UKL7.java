/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ukl7;

/**
 *
 * @author LOQ
 */
import java.util.Scanner;

public class UKL7 {

    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah jenis cookies: ");
        int n = input.nextInt();
        input.nextLine(); // membersihkan buffer

        // ArrayList untuk menyimpan data
        String[] nama = new String[n];
        int[] produksi = new int[n];
        int[] jual = new int[n];
        int[] jumlah = new int[n];
        int[] biaya = new int[n];
        int[] pendapatan = new int[n];
        int[] laba = new int[n];

        int totalLabaKeseluruhan = 0;
        int labaTertinggi = Integer.MIN_VALUE;
        String cookiesLabaTertinggi = "";

        // Input data per cookies
        for (int i = 0; i < n; i++) {
            System.out.println("\nCookies ke-" + (i + 1));

            System.out.print("Nama cookies: ");
            nama[i] = input.nextLine();

            System.out.print("Harga produksi per bungkus: ");
            produksi[i] = input.nextInt();

            System.out.print("Harga jual per bungkus: ");
            jual[i] = input.nextInt();

            System.out.print("Jumlah terjual: ");
            jumlah[i] = input.nextInt();
            input.nextLine(); // membersihkan buffer

            // Perhitungan
            biaya[i] = produksi[i] * jumlah[i];
            pendapatan[i] = jual[i] * jumlah[i];
            laba[i] = pendapatan[i] - biaya[i];

            totalLabaKeseluruhan += laba[i];

            // Mencari laba tertinggi
            if (laba[i] > labaTertinggi) {
                labaTertinggi = laba[i];
                cookiesLabaTertinggi = nama[i];
            }
        }

        // Output Tabel
        System.out.println("\n-----------------------------------------------------------");
        System.out.println("Nama Cookies | Total Biaya | Total Pendapatan | Laba/Rugi | Status");
        System.out.println("-----------------------------------------------------------");

        for (int i = 0; i < n; i++) {
            String status;
            if (laba[i] > 0) status = "Laba";
            else if (laba[i] < 0) status = "Rugi";
            else status = "Impas";

            System.out.printf("%s | Rp%,d | Rp%,d | Rp%,d | %s\n",
                    nama[i], biaya[i], pendapatan[i], laba[i], status);
        }

        System.out.println("-----------------------------------------------------------");
        System.out.printf("Total Laba/Rugi Keseluruhan: Rp%,d\n", totalLabaKeseluruhan);

        System.out.printf("Cookies dengan Laba Tertinggi: %s (Rp%,d)\n",
                cookiesLabaTertinggi, labaTertinggi);
    }
}
    

