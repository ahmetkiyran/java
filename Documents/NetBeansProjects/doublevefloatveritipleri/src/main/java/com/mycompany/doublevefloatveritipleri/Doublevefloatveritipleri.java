/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.doublevefloatveritipleri;

/**
 *
 * @author Ahmet
 */
public class Doublevefloatveritipleri {

    public static void main(String[] args) {
       /*double a = 5.25;
       double b = 4.0;
       double c = 4d;  // 4 degerini double cins,nden tanımlamak istediğimizi belirtir.
       double d= 4.23;
       
        System.out.println(c);*/
       
       /*float a = (float)5.0;
       float b= 5f;
       float c = 5.2f;*/
        // otomatik dönüştürme : int->float->double
        // double 64 bit-8byte
        //float 32bit-4byte
       /*int a = 22/7;
       float b = 22f / 7f;
       double c = 22d / 7d;
       
        System.out.println("a: "+a);
        System.out.println("b: "+b);
        System.out.println("c: "+c);*/ // double daha fazla yer kapladığı için ondalıklı sayılarda kullanılması daha mantıklı.
        
       /* double i = 3.52;
        float j= (float)i; // okuma soldan sağa doğru olur.*/
       
       double sayi1 = 70.25;
       double sayi2 = 60d;
       double sayi3 = 80.2;
       
        System.out.println("ortalama: " + (sayi1+sayi2+sayi3)/3);
       
       /* soldan sağa doğru okuma gerçekleştiği için 
        double/int oluyo ve sonuç yine double oluyo.
        */
    }
}
