/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ukl2;

/**
 *
 * @author LOQ
 */
import java.util.Scanner;
public class UKL2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah uang: ");
        int uang = input.nextInt();
        
        if (uang > 10000000) {
            System.out.println("keterangan : uang anda terlalu besar");
        } else {
            int[] pecahan = {100000, 50000, 20000, 10000, 5000, 2000, 1000};
        for (int p : pecahan) {
            int lembar = uang / p;
            if (lembar > 0) {
                System.out.println(lembar + " Lembar " + p);
            
            if (lembar > 10000000) {
                System.out.println("keterangan : uang anda terlalu besar");
                uang = uang % p;
                  
                    }
                }
            } 
        }
        
    }
}

