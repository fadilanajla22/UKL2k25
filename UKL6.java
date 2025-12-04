/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ukl6;

/**
 *
 * @author LOQ
 */
import java.util.Scanner;

public class UKL6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nama peminjam: ");
        String nama = input.nextLine();

        System.out.print("Judul buku: ");
        String judul = input.nextLine();

        System.out.print("Kategori buku (A/B/C): ");
        char kategori = input.next().toUpperCase().charAt(0);

        System.out.print("Lama peminjaman (hari): ");
        int hari = input.nextInt();


        int tarifPerHari = 0;

        if (kategori == 'A') {
            tarifPerHari = 2000;
        } else if (kategori == 'B') {
            tarifPerHari = 1500;
        } else if (kategori == 'C') {
            tarifPerHari = 1000;
        } else {
            System.out.println("Kategori tidak valid!");
            return;
        }

        int biayaAwal = hari * tarifPerHari;

        int denda = 0;
        if (hari > 7) {
            int terlambat = hari - 7;
            denda = terlambat * 500;
        }

        int totalBiaya = biayaAwal + denda;

        System.out.println("\n===== HASIL PEMINJAMAN =====");
        System.out.println("Nama Peminjam      : " + nama);
        System.out.println("Judul Buku         : " + judul);
        System.out.println("Kategori Buku      : " + kategori);
        System.out.println("Lama Peminjaman    : " + hari + " hari");
        System.out.println("Biaya Peminjaman   : Rp " + biayaAwal);
        System.out.println("Denda Keterlambatan: Rp " + denda);
        System.out.println("Total Biaya Akhir  : Rp " + totalBiaya);
    }
}
    

