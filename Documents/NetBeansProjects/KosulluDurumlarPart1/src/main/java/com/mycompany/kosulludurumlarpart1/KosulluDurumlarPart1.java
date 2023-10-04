/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.kosulludurumlarpart1;

import java.util.Scanner;

/**
 *
 * @author Ahmet
 */
public class KosulluDurumlarPart1 {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       
        System.out.println("yaşınızı giriniz: ");
        int yas = scanner.nextInt();
        
        if(yas >= 18)
        {
            System.out.println("Hosgeldiniz...");
            
        }
        else
        {
            System.out.println("Yasiniz buraya girmek icin uygun degildir.");
        }    
        
    }
}
