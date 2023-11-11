/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oop.atmprojesi;

import java.util.Scanner;

/**
 *
 * @author Ahmet
 */
public class login {
    public  boolean login(Hesap hesap)
    {
        Scanner scanner =new Scanner(System.in);
        
        String kullanici_adi;
        String parola;
        
        System.out.println("kullanıcı adı: ");
        kullanici_adi = scanner.nextLine();
        
        System.out.println("parola: ");
        parola = scanner.nextLine();
        
        if(hesap.getKullanici_adi().equals(kullanici_adi) && hesap.getParola().equals(parola))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
