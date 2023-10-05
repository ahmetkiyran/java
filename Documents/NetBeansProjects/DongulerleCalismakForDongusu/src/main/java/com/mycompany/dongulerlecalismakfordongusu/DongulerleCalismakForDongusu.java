/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.dongulerlecalismakfordongusu;

import java.util.Scanner;

/**
 *
 * @author Ahmet
 */
public class DongulerleCalismakForDongusu {

    public static void main(String[] args) {
          
        /*
        for(başlatma;koşul;artırma veya azaltma işlemleri)
        {
        
        
        
        
        }
        
        */
        
        /*int i;
        
        for(i=0;i<5;i++)
        {
            System.out.println("merhaba");
        }*/
        
        /*for(int i = 0;i<5;i++)
        {
            System.out.println("merhaba");
        }*/
        
        /*for(int i = 10;i>=0;i--)
        {
            System.out.println("merhaba");
        }*/

      /*int i=0; // i yi döngü dışında da kullanıp direkt yazabiliriz.
      for(;i<5;i++)
      {
          System.out.println("java öğreniyorum");
      }*/
      
      /*int i=0;
      int j=10;
      
      for(;i<10 && j>0;i++,j--)
      {
          System.out.println("i= "+ i);
          System.out.println("j= "+ j);
      }*/
      
     /*for(int i=2 ; i<100 ; i*=2)
      {
          System.out.println("i = "+ i);
      }*/
     
      Scanner scanner =new Scanner(System.in);
      
        System.out.println("faktoriyelini almak istediğiniz sayıyı giriniz: ");
        int n = scanner.nextInt();
        
        int faktor=1;
        
        for(int i=1 ; i<=n ; i++)
        {
            faktor *=i;
        }
        
        System.out.println("faktoriyel sonucunuz: "+ faktor);
       
              

    }
}
