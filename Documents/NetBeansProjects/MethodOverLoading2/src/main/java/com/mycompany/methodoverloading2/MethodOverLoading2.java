/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.methodoverloading2;

/**
 *
 * @author Ahmet
 */
public class MethodOverLoading2 {
public static void skorhesapla(String isim,int puan)
{
    System.out.println(isim +" kullanıcının "+ puan + " puanı var");
}
public static void skorhesapla(int puan)
{
    System.out.println("isimsiz oyuncunun "+ puan +" puanı var");
}
public static void skorhesapla(String isim)
{
    System.out.println(isim+ " adlı oyuncunun hiç puanı yok ");
}
    public static void main(String[] args) {
       skorhesapla("Ahmet",990);
        skorhesapla(567);
        skorhesapla("Oğuzhan");
    }
}
