/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.metodlarlacalismakreturnkavrami3;

/**
 *
 * @author Ahmet
 */
public class MetodlarlaCalismakReturnKavrami3 {
public static int carp(int a)
{
    System.out.println("çıktı alınıyor...");
    return a*8;
   // System.out.println("bitti..."); burada kod hata verir çünkü en son çalışan kod return dur.
}
    public static void main(String[] args) {
        // burada metodun içinde en son çalışan kodun return olduğunu kanıtlamak için bu kodu yazdım.
        System.out.println("sonuc: " +carp(8));
    }
}
