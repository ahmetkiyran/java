/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.constructor.part1;

/**
 *
 * @author Ahmet
 */
public class Account {
    private String hesapNo;
    private double bakiye;
    private String isim;
    
    private String email;
    
    private String telefonNo;
    
    public Account(){
        System.out.println("kendi yazdığımız constructor...");
    }
    public Account(String hesapNo,double bakiye,String isim,String email,String telefonNo){
        this.hesapNo = hesapNo;
        this.bakiye = bakiye;
        this.isim = isim;
        this.email = email;
        this.telefonNo = telefonNo;
        
    }
    public void parrayatir(double miktar)
    {
        bakiye += miktar;
        System.out.println("yenibakiye = "+bakiye);
    }
    public void paracekme(double miktar)
    {
        if(miktar > 1500)
        {
            System.out.println("bir günde 1500 tl den fazla çekemezsiniz");
        }
        if(bakiye - miktar < 0)
        {
            System.out.println("yeterli bakiye yok. bakiye: "+bakiye);
        }
        else
        {
            bakiye -= miktar;
            System.out.println("yeni bakiye: "+bakiye);
        }
            
    }

    /**
     * @return the hesapNo
     */
    public String getHesapNo() {
        return hesapNo;
    }

    /**
     * @param hesapNo the hesapNo to set
     */
    public void setHesapNo(String hesapNo) {
        this.hesapNo = hesapNo;
    }

    /**
     * @return the bakiye
     */
    public double getBakiye() {
        return bakiye;
    }

    /**
     * @param bakiye the bakiye to set
     */
    public void setBakiye(double bakiye) {
        this.bakiye = bakiye;
    }

    /**
     * @return the isim
     */
    public String getIsim() {
        return isim;
    }

    /**
     * @param isim the isim to set
     */
    public void setIsim(String isim) {
        this.isim = isim;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the telefonNo
     */
    public String getTelefonNo() {
        return telefonNo;
    }

    /**
     * @param telefonNo the telefonNo to set
     */
    public void setTelefonNo(String telefonNo) {
        this.telefonNo = telefonNo;
    }
}
