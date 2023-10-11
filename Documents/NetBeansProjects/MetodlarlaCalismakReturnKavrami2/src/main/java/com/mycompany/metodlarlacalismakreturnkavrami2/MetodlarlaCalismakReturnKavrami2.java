/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.metodlarlacalismakreturnkavrami2;

/**
 *
 * @author Ahmet
 */
public class MetodlarlaCalismakReturnKavrami2 {
public static int ikiilecarp(int a)
{
    return a*2;
}
public static int dortiletopla(int a)
{
    return a+4;
}
public static int sekizilecarp(int a)
{
    return a*8;
}
    public static void main(String[] args) {
        System.out.println("sonuc: "+sekizilecarp(dortiletopla(ikiilecarp(7))));
        // iç içe yazarak birbirinin içine girebiliriz fonskiyonların
        // return kavramı geriye değer döndürür o yüzden tip kullarak yazmalıyız.
    }
}
