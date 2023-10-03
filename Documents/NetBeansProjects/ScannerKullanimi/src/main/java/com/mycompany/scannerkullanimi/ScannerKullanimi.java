/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.scannerkullanimi;

import java.util.Scanner;

/**
 *
 * @author Ahmet
 */
public class ScannerKullanimi {

    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
        /* System.out.println("lütfen yaşınızı giriniz: ");
        int yaş = scanner.nextInt();
        
        System.out.println("yaşınız: "+yaş);*/
        
        /*System.out.println("lütfen double tipinde bir sayi giriniz :");
        double sayi = scanner.nextDouble();
        System.out.println("girmiş olduğunuz sayi: "+ sayi);*/
        
       /* System.out.println("bir metin giriniz: ");
        String metin = scanner.nextLine();
        System.out.println("girdiğiniz metin: "+ metin);*/
       
       
       System.out.println("bir sayi giriniz: ");
       
       if(scanner.hasNextInt())
       {
       int sayi = scanner.nextInt();
       System.out.println("sayi: "+ sayi);
       }
       else
       {
           System.out.println("lutfen bir sayi giriniz!");
       }    
        
        
    }
}
