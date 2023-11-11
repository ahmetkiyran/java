/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.idman_programi_part1;

import java.util.Scanner;

/**
 *
 * @author Ahmet
 */
public class main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("idman programına hoşgeoldiniz...");
        
        String idmanlar = "geçerli hareketler...\n"
                          +"burpee\n"
                          +"pushup\n"
                          +"situp\n"
                          +"squat";
        System.out.println(idmanlar);
        
        System.out.println("bir idman oluşturun...");
        System.out.println("burpee sayısı: ");
        int burpee = scanner.nextInt();
        System.out.println("pushup sayısı: ");
        int pushup= scanner.nextInt();
        System.out.println("situp sayısı: ");
        int situp = scanner.nextInt();
        System.out.println("squat sayısı: ");
        int squat = scanner.nextInt();
        scanner.nextLine();
        
        Idman idman = new Idman(burpee,pushup,situp,squat);
        
        System.out.println("idmanınız başlıyor...");
        
        while(idman.idmanbittiMi()== false)
        {
            System.out.println("hareket türü");
            String tur = scanner.nextLine();
            
            System.out.println("bu hareketten kaç tane yapacaksınız");
            int sayi = scanner.nextInt();
            scanner.nextLine();
           
            idman.hareketYap(tur, sayi);
            
            
        }
    }
}
