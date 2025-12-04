/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ukl1;

/**
 *
 * @author LOQ
 */
import java.util.Scanner;
public class UKL1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan sebuah bilangan: ");
        int angka = input.nextInt();
        
        if (angka <= 0) {
            System.out.println("keterangan : ini bilangan negatif");
            return;
        }

        boolean prima = true;

        if (angka <= 1) {
            prima = false;
        } else {
            
            for (int i = 2; i <= angka / 2; i++) {
                if (angka % i == 0) {
                    prima = false;
                    break;
                }
            }
        }
  
        if (prima) {
            System.out.println(angka + " adalah bilangan prima");
        } else {
            System.out.println(angka + " bukan bilangan prima");
        }
         
         if (angka >= 100) {
            System.out.println("keterangan : angka lebih dari 100");
        } else if (angka >= 100) {
            System.out.println("keterangan : angka lebih dari 100"); 
        } else {
            System.out.println("keterangan : angka pada rentang 100 ");
        }
         
         if (angka >= 1000){
             System.out.println("keterangan : angka ini terlalu besar");
         }
    }
}
    

