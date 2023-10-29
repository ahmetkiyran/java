/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.classmetodlari;

/**
 *
 * @author Ahmet
 */
public class Test {
    public static void main(String[] args){
       Araba araba1 = new Araba();
        
        araba1.setModel("Renault");
        System.out.println("Arabanın modeli: "+ araba1.getModel());
        araba1.setKapilar(-4);
        System.out.println("Arabanın kapı sayısı"+araba1.getKapilar());
        araba1.setRenk("kırmızı");
        System.out.println("arabanın rengi: "+araba1.getRenk());
        araba1.setTekerlekler(4);
        System.out.println("arabanın kapı sayısı:"+araba1.getTekerlekler());
      
      
      
        
    }
}
