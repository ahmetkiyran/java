/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.methodoverloading1;

/**
 *
 * @author Ahmet
 */
public class MethodOverLoading1 {
    public static void toplama(String a,String b)
    {
        System.out.println(a + " " +b);
    }
    public static void toplama(int a,int b)
    {
        System.out.println("toplamları: "+(a+b));
    }
public static void toplama(int a,int b,int c)
{
    System.out.println("toplamları: "+(a+b+c));
}
    public static void main(String[] args) {
        toplama(2,8,5);
        toplama(2,6);
        toplama("ahmet","kıyran");
        
    }
}
// ayı fonksiyonu başka başka şekillerde aynı anda çalıştırma işemine method overloading denir.