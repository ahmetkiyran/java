/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.switchcaseyapilari;

import java.util.Scanner;

/**
 *
 * @author Ahmet
 */
public class SwitchCaseYapilari {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen yapacağınız işlemi numara kullanarak seçiniz.");
        int islem = scanner.nextInt();
        
        switch(islem)
        {
            case 1:
            {
                System.out.println("1. işlemi seçtiniz");
                break;
            }
            case 2:
            {
                System.out.println("2. işlemi seçtiniz");
                break;
            }
            case 3:
            {
                System.out.println("3. işlemi seçtiniz");
                break;
            }
            default:
            {
                System.out.println("hatalı işlem girdiniz tekrar deneyiniz.");
                break;
            }
                    
                    
            // eğer break kullanmasaydık diğer işlemleri de seçerdi.
        }
            
        
        
    }
}
