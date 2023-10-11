/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.miniprojefaizuygulamasi;

import java.util.Scanner;

/**
 *
 * @author Ahmet
 */
public class MiniProjeFaizUygulamasi {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("**********************");
        System.out.println("Bankamıza hoşgeldiniz...");
        System.out.println("**********************");
      
        System.out.println("Anaparanızı giriniz: ");
        int ap = scanner.nextInt();
        
        System.out.println("paranızı kaç yıl faizde tutmak istiyorsunuz: ");
        int yıl = scanner.nextInt();
        
        double faiz ;
        
        faiz = ap+(ap*yıl*(6/100));
        
        System.out.println("bankamızda "+ yıl + " yıl bekleyen " + ap + " lira paranızın %6 faiz oranıyla değerlenmiş toplam miktarı: " + faiz);
      
    }
}
