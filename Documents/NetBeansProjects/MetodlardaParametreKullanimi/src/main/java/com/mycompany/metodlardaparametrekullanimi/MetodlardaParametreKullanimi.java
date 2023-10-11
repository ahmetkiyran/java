/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.metodlardaparametrekullanimi;

/**
 *
 * @author Ahmet
 */
public class MetodlardaParametreKullanimi {
public static void toplam(int a,int b,int c)
{
    System.out.println("toplamları "+(a+b+c));
}
public static void selam(String isim)
{
    System.out.println("selamlar "+isim);
}
    public static void main(String[] args) {
        selam("Melike");
        toplam(6,8,10);
    }
}
