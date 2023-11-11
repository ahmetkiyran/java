/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oop.atmprojesi;

/**
 *
 * @author Ahmet
 */
public class Hesap {
   
    private String kullanici_adi;
    private String parola;
    private int bakiye;

    public Hesap(String kullanici_adi, String parola, int bakiye) {
        this.kullanici_adi = kullanici_adi;
        this.parola = parola;
        this.bakiye = bakiye;
    }

    /**
     * @return the kullanici_adi
     */
    public void paraYatir(int tutar)
    {
      bakiye += tutar;
        System.out.println("yeni bakiye: "+bakiye);
    }
    
    public void paraCek(int tutar)
    {
        if(bakiye- tutar < 0)
        {
            System.out.println("yetersiz bakiye");
        }
        else
        {
            bakiye -= tutar;
            System.out.println("yeni bakiyeniz: "+bakiye);
        }
    }
    
    public String getKullanici_adi() {
        return kullanici_adi;
    }

    /**
     * @param kullanici_adi the kullanici_adi to set
     */
    public void setKullanici_adi(String kullanici_adi) {
        this.kullanici_adi = kullanici_adi;
    }

    /**
     * @return the parola
     */
    public String getParola() {
        return parola;
    }

    /**
     * @param parola the parola to set
     */
    public void setParola(String parola) {
        this.parola = parola;
    }

    /**
     * @return the bakiye
     */
    public int getBakiye() {
        return bakiye;
    }

    /**
     * @param bakiye the bakiye to set
     */
    public void setBakiye(int bakiye) {
        this.bakiye = bakiye;
    }
    
    
    
}
