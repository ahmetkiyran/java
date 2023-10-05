/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.breakvecontinuekullanimi;

import java.util.Scanner;

/**
 *
 * @author Ahmet
 */
public class BreakVeContinueKullanimi {

    public static void main(String[] args) {
       // BREAK KULLANIMI 
       /*int i = 0;
       
       while(i<20)
       {
           if(i== 10)
           {
               break;
           }
           System.out.println("i = "+i);
           i++;
       }*/
       
      /* Scanner scanner = new Scanner(System.in);
       
       while(true)
       {
           int islem = scanner.nextInt();
           
           if(islem == -2)
           {
               System.out.println("döngüden çıkıldı");
               break;
           }
           System.out.println("işlem = "+islem);
       }*/
      
      
       // CONTİNUE KULLANIMI
       
       
       /*for(int i = 0;i < 10; i++)
       {
           if(i==3 || i==5)
           {
               continue;
           }
           System.out.println("i = "+ i);
       }*/
        
        int i = 0;
        
        while(i<10)
        {
            
            if(i==3 || i== 5)
            {
                i++; // buradaki i++ yı kullanmazsak i üç olduğunda duruyo ve artırıma da gtmediği için öylece kalıyo.
                continue;
            }
            System.out.println("i = "+ i);
            i++;
        }
        
    }
}
