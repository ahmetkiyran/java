/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.miniprojebedenkitleendeksiaraliklaragoredurumbelirleme;

import java.util.Scanner;

/**
 *
 * @author Ahmet
 */
public class MiniProjeBedenKitleEndeksiAraliklaraGoreDurumBelirleme {

    public static void main(String[] args) {
         
      Scanner scanner = new Scanner(System.in);
      float indeks;
      System.out.println("lütfen kilonuzu giriniz: ");
      float kilo = scanner.nextFloat();
      
      System.out.println("lütfen boyunuzu metre cinsinden giriniz: ");
      float boy = scanner.nextFloat();
      
      indeks = kilo/(boy*boy);
      
        System.out.println("vücut kitle indeksiniz: "+ indeks);
        
        if(indeks < 18.5)
        {
            System.out.println("boy kilo endeksine göre zayıfsınız");
        }
        else if(indeks >= 18.5 && indeks < 25)
        {
            System.out.println("boy kilo endeksine göre normalsiniz");
        }
        else if(indeks >= 25 && indeks < 30)
        {
            System.out.println("boy kilo endeksine göre fazla kiloya sahipsiniz");
        }
        else
        {
            System.out.println("boy kilo endeksine göre obezsiniz bir an önce doktorunuza başvurunuz.");
        }
    }
}
