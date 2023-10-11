/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.metodlaragirisfaktoriyel;

import java.util.Scanner;

/**
 *
 * @author Ahmet
 */
public class MetodlaraGirisFaktoriyel {
public static void faktoriyel()
{
    Scanner scanner = new Scanner(System.in);
    System.out.println("bir sayi giriniz: ");
    int sayi = scanner.nextInt();
    
    int faktoriyel = 1;
    
    while(sayi>0)
    {
        faktoriyel *= sayi;
        sayi--;
    }
    System.out.println("sonuc: "+faktoriyel);
    
}
    public static void main(String[] args) {
        faktoriyel();
    }
}
