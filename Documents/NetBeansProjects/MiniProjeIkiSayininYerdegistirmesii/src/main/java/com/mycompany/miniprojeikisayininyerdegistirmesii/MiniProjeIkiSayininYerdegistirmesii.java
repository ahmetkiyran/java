/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.miniprojeikisayininyerdegistirmesii;

import java.util.Scanner;

/**
 *
 * @author Ahmet
 */
public class MiniProjeIkiSayininYerdegistirmesii {

    public static void main(String[] args) {
       Scanner scaner = new Scanner(System.in);
       int bos;
        System.out.println("ilk sayıyı giriniz: ");
        int sayi1 = scaner.nextInt();
        System.out.println("ikinci sayıyı giriniz: ");
        int sayi2 = scaner.nextInt();
        
        bos = sayi1;
        sayi1 = sayi2;
        sayi2 = bos;
        
        System.out.println("birinci sayı: "+ sayi1 + " ikinci sayi: "+ sayi2);
    }
}
