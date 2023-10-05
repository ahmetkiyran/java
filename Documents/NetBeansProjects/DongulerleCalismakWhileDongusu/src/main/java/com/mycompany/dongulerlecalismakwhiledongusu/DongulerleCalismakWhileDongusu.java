/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.dongulerlecalismakwhiledongusu;

import java.util.Scanner;

/**
 *
 * @author Ahmet
 */
public class DongulerleCalismakWhileDongusu {

    public static void main(String[] args) {
        
      /*int i = 10;
      while(i>0)
              {
                  System.out.println("merhaba"); 
                  i--;
              }*/
      
      /*int i = 10;
      
      while(i<100)
      {
          System.out.println("i = "+i);
          i += 7;
      }*/
      
      Scanner scanner = new Scanner(System.in);
      
        System.out.println("faktoriyelini almak istediğiniz sayıyı giriniz: ");
        int n = scanner.nextInt();
        
        int faktor = 1;
        int i =1;
        
        while(n>=i)
        {
            faktor *= n;
            n--;
        }
        
        System.out.println("faktoriyel sonucunuz: "+ faktor);
        
        
    }
}
