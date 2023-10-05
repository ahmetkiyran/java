/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.miniprojegelismisnothesaplama;

import java.util.Scanner;

/**
 *
 * @author Ahmet
 */
public class MiniProjeGelismisNotHesaplama {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("*********************");
        System.out.println("Not hesaplama sistemine hoşgeldiniz");
        System.out.println("*********************");
        
        System.out.println("İlk vize notunuzu giriniz:");
        int vize1 = scanner.nextInt();
        System.out.println("ikinci vize notunuzu giriniz:");
        int vize2 = scanner.nextInt();
        System.out.println("final notunuzu giriniz:");
        int fnl = scanner.nextInt();
        
        System.out.println("dönem ortalmanızı giriniz:");
        float ort = scanner.nextFloat();
        
        
        int sonuc =(vize1*30)/100 
                + (vize2*30)/100 
                + (fnl*40)/100;
        
        if(sonuc >= 90)
        {
            System.out.println("AA ile geçtiniz tebrikler.");
            
        }
        else if(sonuc < 90 && sonuc >= 85)
        {
            System.out.println("BA ile geçtiniz tebrikler.");
        }
        else if(sonuc < 85 && sonuc >= 80 )
        {
            System.out.println("BB ile geçtniz tebrikler.");
        }
        else if(sonuc < 80 && sonuc >= 75)
        {
            System.out.println("CB ile geçtniz tebrikler.");
        }
        else if(sonuc < 75 && sonuc >= 70)
        {
            System.out.println("CC ile geçtniz tebrikler.");

        }
        else if(sonuc < 70 && sonuc >= 65)
        {
            System.out.println("DC ile geçtniz tebrikler.");
        }
        else if(sonuc < 65 )
        {
            System.out.println("DC ile geçtniz tebrikler.");
        }
        else if (ort < 2.5)
        {
            System.out.println("kaldınız!!!");
        }
    }
}
