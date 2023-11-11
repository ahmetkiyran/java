/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oop.atmprojesi;

/**
 *
 * @author Ahmet
 */
public class main {
    
    ATM atm = new ATM();
    Hesap hesap = new Hesap("ahmet","747594",2000.0);
    atm.calis(hesap);
    
    System.out.println("programdan çıkılıyor...");
}
