/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.miniprojemethodoverloadinkullanarakgelismishesapmakinesi;

import java.util.Scanner;

/**
 *
 * @author Ahmet
 */
public class MiniProjeMethodOverloadinKullanarakGelismisHesapMakinesi {
public static int cikarma(int a,int b)
{
    return a-b;
}
public static double bolme(int a,int b)
{
    return ((double)a/b);
}
public static int toplama (int a,int b)
{
    return a+b;
}
public static int toplama(int a, int b,int c)
{
    return a+b+c;
}
public static int carpma(int a,int b)
{
    return a*b;
}
public static int carpma(int a,int b,int c)
{
    return a*b*c;
}
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String islemler = "1. toplama\n"
                     + "2. çıkarma\n"
                     + "3. çarpma\n"
                     + "4. bölme\n";
        
        System.out.println("*******************");
        System.out.println(islemler);
        System.out.println("*******************");
        
        while(true)
        {
            System.out.println("islemi seçiniz: ");
            String islem = scanner.nextLine();
            
               if(islem.equals("q"))
               {
                   System.out.println("programdan çıkılıyor...");
                   break;
               }
               else if(islem.equals("1"))
               {
                   System.out.println("kaç değer toplayacaksınız (2 veya 3)");
                   int kacsayi = scanner.nextInt();
                   
                   if(kacsayi == 2)
                   {
                       System.out.println("a");
                       int a = scanner.nextInt();
                       System.out.println("b");
                       int b = scanner.nextInt();
                       scanner.nextLine();
                       System.out.println("girilen sayilarin toplamları: "+ toplama(a,b));
                   }
                   else if(kacsayi == 3)
                   {
                       System.out.println("a");
                       int a = scanner.nextInt();
                       System.out.println("b");
                       int b = scanner.nextInt();
                       System.out.println("c");
                       int c = scanner.nextInt();
                       scanner.nextLine();
                       System.out.println("girilen sayilarin toplamları: "+ toplama(a,b,c));
                   }
                   else
                   {
                       System.out.println("uygun metod bulunamadı");
                   }
               }
               else if(islem.equals("2"))
               {
                   System.out.println("a");
                   int a = scanner.nextInt();
                   System.out.println("b");
                   int b = scanner.nextInt();
                   scanner.nextLine();
                   System.out.println("girilen sayilarin farkı: "+ cikarma(a,b));
               }
               else if(islem.equals("3"))
               {
                   System.out.println("kaç sayı çarpmak istiyorsunuz (2 veya üç)");
                   int kacsayi = scanner.nextInt();
                   
                   if(kacsayi == 2)
                   {
                       System.out.println("a");
                       int a = scanner.nextInt();
                       System.out.println("b");
                       int b = scanner.nextInt();
                       scanner.nextLine();
                       System.out.println("girilen sayilarin çarpımları: "+ carpma(a,b));
                   }
                   else if(kacsayi == 3)
                   {
                       System.out.println("a");
                       int a = scanner.nextInt();
                       System.out.println("b");
                       int b = scanner.nextInt();
                       System.out.println("c");
                       int c = scanner.nextInt();
                       scanner.nextLine();
                       System.out.println("girilen sayilarin çarpımları: "+ carpma(a,b,c));
                   }
                   else
                   {
                       System.out.println("uygun metod bulunamadı");
                   }
                       
               }
               else if(islem.equals("4"))
               {
                   System.out.println("a");
                   int a = scanner.nextInt();
                   System.out.println("b");
                   int b = scanner.nextInt();
                   scanner.nextLine();
                   
                   System.out.println("girilen sayıların bolum sonucu: "+ bolme(a,b));
               }
               else
               {
                   System.out.println("yanlış numara girdiniz tekrar deneyiniz...");
               }
        }
    }
}
