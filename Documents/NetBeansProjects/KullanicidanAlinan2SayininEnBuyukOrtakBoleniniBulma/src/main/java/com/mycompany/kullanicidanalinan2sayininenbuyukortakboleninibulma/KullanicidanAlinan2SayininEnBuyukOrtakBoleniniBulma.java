/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.kullanicidanalinan2sayininenbuyukortakboleninibulma;

import java.util.Scanner;

/**
 *
 * @author Ahmet
 */
public class KullanicidanAlinan2SayininEnBuyukOrtakBoleniniBulma {
public static int ebob(int s1, int s2)
{
    int ebob = 1;
    for(int i = 1; i<= s1 && i<=s2 ; i++)
    {
     if( s1 % i == 0 && s2 % i == 0)
     {
         ebob = i;
     }
    }
    return ebob;
}
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("birinci sayiyi giriniz: ");
        int s1 = scanner.nextInt();
        
        System.out.println("ikinci sayiyi giriniz: ");
        int s2 = scanner.nextInt();
        
        System.out.println("iki sayının ebobu: " + ebob(s1,s2));

    }
}
