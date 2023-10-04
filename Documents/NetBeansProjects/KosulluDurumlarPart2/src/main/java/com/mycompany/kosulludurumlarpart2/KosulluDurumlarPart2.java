/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.kosulludurumlarpart2;

import java.util.Scanner;

/**
 *
 * @author Ahmet
 */
public class KosulluDurumlarPart2 {

    public static void main(String[] args) {
        
        
        Scanner scanner = new Scanner( System.in);
        
        System.out.println("Notunuzu giriniz: ");
        
        int not = scanner.nextInt();
        
        if(not >= 85)
        {
            System.out.println("harf notunuz AA tebrikler");
        }
        else if(not >=70 && not < 85 )
        {
            System.out.println("harf notunuz BB tebrikler");
        }
        else if(not >= 50 && not < 70)
        {
            System.out.println("harf notunuz CC tebrikler");
            
        }
        else
        {
            System.out.println("aldığınız notun harf değeri dersten kaldığınızı gösteriyor. daha cok çalışın");
        }
        
        
        
        
        
        
        
        
        
    }
}
