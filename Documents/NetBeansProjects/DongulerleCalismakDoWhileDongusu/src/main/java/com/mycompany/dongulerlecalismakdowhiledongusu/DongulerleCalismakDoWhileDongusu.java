/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.dongulerlecalismakdowhiledongusu;

import java.util.Scanner;

/**
 *
 * @author Ahmet
 */
public class DongulerleCalismakDoWhileDongusu {

    public static void main(String[] args) {
        
        /*int i = 0;
        do{
            System.out.println("i = "+ i);
            i++;
        }while(i<5); */
        
         Scanner scanner = new Scanner(System.in);
         
         System.out.println("bir sayi giriniz:");
         int sayi = scanner.nextInt();
         
         int toplam = 0;
         
         do
         {
             toplam += sayi % 10;
             sayi = sayi/10;
         }  while(sayi>0);
         
         System.out.println("toplam: "+toplam);
    }
}
