/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.miniprojekullanicigirisprogrami;

import java.util.Scanner;

/**
 *
 * @author Ahmet
 */
public class MiniProjeKullaniciGirisProgrami {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int giris_hakki = 3;
        String sys_kullanici_adi = "Ahmet";
        String sys_parola = "12345";
        
        System.out.println("***********************");
        System.out.println("kullancı girişine hoşgeldiniz");
        System.out.println("***********************");
        
        while(true)
        {
            System.out.println("Kullanıcı adı: ");
            String kullanici =scanner.nextLine();
            System.out.println("Parola: ");
            String parola = scanner.nextLine();
            
            if(kullanici.equals(sys_kullanici_adi) && parola.equals(sys_parola))
            {
                System.out.println("hoşgeldiniz...");
                break;
            }
            else if(kullanici.equals(sys_kullanici_adi) && !parola.equals(sys_parola))
            {
                System.out.println("yanlış parola");
                giris_hakki-=1;
                
            }
             else if(!kullanici.equals(sys_kullanici_adi) && parola.equals(sys_parola))
             {
                 System.out.println("kullanıcı adı yanlış");
                 giris_hakki-=1;
             }
            else
             {
                 System.out.println("kullanıcı adınız ve parola yanlış");
                 giris_hakki-=1;
             }
            
            if(giris_hakki==0)
            {
                System.out.println("giriş hakkınız bitti tekrar bekleriz");
                break;
            }
               
                
                  
        }
    }
}
