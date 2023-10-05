/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.miniprojeswitchcase4islemyapanhesapmakinesi;

import java.util.Scanner;

/**
 *
 * @author Ahmet
 */
public class MiniProjeSwitchCase4IslemYapanHesapMakinesi {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("*****************");
        String islemler = "1. Toplama işlemi\n"
                          +"2. Çıkarma işlemi\n"
                          +"3. Bölme işlemi\n"
                          +"4. Çarpma işlemi\n";
        System.out.println(islemler);
        System.out.println("*****************");
        System.out.println("Lütfen İşlem Seçiniz.");
        
        String islem = scanner.nextLine();
        
        switch(islem)
        {
            case "1":
            {
                System.out.println("ilk sayı: ");
                int a = scanner.nextInt();
                System.out.println("ikinci sayı: ");
                int b = scanner.nextInt();
                System.out.println("Toplam: "+(a+b));
                break;
                
            }
            case "2":
            {
                System.out.println("ilk sayı: ");
                int a = scanner.nextInt();
                System.out.println("ikinci sayı: ");
                int b = scanner.nextInt();
                System.out.println("Fark: "+(a-b));
                break;
            }
            case "3":
            {
                System.out.println("ilk sayı: ");
                float a = scanner.nextFloat();
                System.out.println("ikinci sayı: ");
                float b = scanner.nextFloat();
                System.out.println("Bölüm: "+(a/b));
                break;
            }
            case "4":
            {
                System.out.println("ilk sayı: ");
                float a = scanner.nextFloat();
                System.out.println("ikinci sayı: ");
                float b = scanner.nextFloat();
                System.out.println("Çarpım: "+(a*b));
                break;

            }
            default:
            {
                System.out.println("lütfen geçerli işlem numarası giriniz");
                break;
            }
        }
    }
}
