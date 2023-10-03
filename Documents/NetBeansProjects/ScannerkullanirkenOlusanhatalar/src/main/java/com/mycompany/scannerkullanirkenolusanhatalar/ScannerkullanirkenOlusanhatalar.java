/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.scannerkullanirkenolusanhatalar;

import java.util.Scanner;

/**
 *
 * @author Ahmet
 */
public class ScannerkullanirkenOlusanhatalar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        /*int yas = scanner.nextInt();
        scanner.nextLine();
        String isim = scanner.nextLine();
        // nextIbt,double,short,long gibi değikenleri aldıktan sonra line 
        //almaya calışırsak direkt sayısal veriyi alıyo ve geri kalan kısmı yok sayıyo
        // iki yol var
        // ya line ı daha üstte kullanmak
        // ya da araya dummy scanner atamak
        System.out.println("yas: "+ yas);
        System.out.println("isim: "+ isim);*/
        
        int yas1 = scanner.nextInt();
        int yas2 = scanner.nextInt();
        int yas3 = scanner.nextInt();
        
        System.out.println("yas1: "+ yas1 + " yas2: "+ yas2 + " yas3: "+yas3);
        
        // burada da hem space e basıp hem de enter a basıp iki şekilde de diğer 
        // verilerin okunmasını sağlayabiliriz.
    }
}
