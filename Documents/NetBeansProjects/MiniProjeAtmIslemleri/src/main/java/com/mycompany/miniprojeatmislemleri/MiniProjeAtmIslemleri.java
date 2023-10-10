/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.miniprojeatmislemleri;

import java.util.Scanner;

/**
 *
 * @author Ahmet
 */
public class MiniProjeAtmIslemleri {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int bakiye = 1000;
        
        String islemler = "1.İşlem : Bakiye Öğrenme\n"
                        + "2.İşlem : Para çekme\n"
                        + "3.İşlem : Para yatırma\n"
                        + "Çıkış için q'a basın";
        
        System.out.println("*************************");
        System.out.println(islemler);
        System.out.println("*************************");
        
        
        while(true)
        {
            System.out.println("işlem seçiniz:");
            String islem = scanner.nextLine();
            
            if(islem.equals("q"))
            {
                System.out.println("programdan çıkılıyor...");
                break;
            }
            else if(islem.equals("1"))
            {
                System.out.println("hesabınızın bakiyesi: "+bakiye);
                break;
            }
            else if(islem.equals("2"))
            {
                System.out.println("çekmek istediğiniz tutarı giriniz: ");
                int tutar = scanner.nextInt();
                if(tutar <= bakiye)
                {
                    System.out.println("lutfen paranızı alınız.");
                    System.out.println("kalan para: "+(bakiye - tutar));
                }
                else
                {
                    System.out.println("yetersiz bakiye lütfen kartınızı alınız.");
                }
                break;
            }
            else if(islem.equals("3"))
            {
                System.out.println("paranızı ekranda gösterildiği gibi para çekme kısmına koyunuz ve miktarı giriniz");
                int ek = scanner.nextInt();
                System.out.println("para yatırma işleminiz başarılı hesap özetiniz: "+ (bakiye + ek));
                break;
            }
            else
            {
                System.out.println("geçersiz işlem!!!"); 
            }
            
            
        }
        
        
    }
}
