/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.miniprojevuctkitleindeksihesaplama;

import java.util.Scanner;

/**
 *
 * @author Ahmet
 */
public class MiniProjeVuctKitleIndeksiHesaplama {

    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      float indeks;
      System.out.println("lütfen kilonuzu giriniz: ");
      float kilo = scanner.nextFloat();
      
      System.out.println("lütfen boyunuzu metre cinsinden giriniz: ");
      float boy = scanner.nextFloat();
      
      indeks = kilo/(boy*boy);
      
        System.out.println("vücut kitle indeksiniz: "+ indeks);
             
      
      
             
      
      
    }
}
