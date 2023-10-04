/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.miniprojegirilenucsayidanenbuygunubulankod;

import java.util.Scanner;

/**
 *
 * @author Ahmet
 */
public class MiniProjeGirilenUcSayidanEnBuygunuBulanKod {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen birbirinden farklı 3 adet sayi giriniz");
        System.out.println("1. sayiyi giriniz: ");
        int sayi1 = scanner.nextInt();
        System.out.println("2. sayiyi giriniz: ");
        int sayi2 = scanner.nextInt();
        System.out.println("3. sayiyi giriniz: ");
        int sayi3 = scanner.nextInt();
        
        if(sayi1 > sayi2 && sayi1 > sayi3)
        {
            System.out.println("en buyuk sayi: "+ sayi1);
        }
        else if(sayi2 > sayi1 && sayi2 > sayi3)
        {
            System.out.println("en buyuk sayi: "+ sayi2);
        }
        else if(sayi3 > sayi1 && sayi3 > sayi2)
        {
            System.out.println("en buyuk sayi: "+ sayi3);
        }
        
        
        
        
    }
}
