/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.miniprojeucgendehipotenusuzunlugu;

import java.util.Scanner;

/**
 *
 * @author Ahmet
 */
public class MiniProjeUcgendeHipotenusUzunlugu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         double hipotenus;
        System.out.println("ucgenin dik kenar uzunluğunun ilkini giriniz: ");
        int u1 = scanner.nextInt();
        System.out.println("ucgenin dik kenar uzunluğunun ikincisini giriniz: ");
        int u2 = scanner.nextInt();
        
        hipotenus = Math.sqrt(u1 * u1 + u2 * u2);
        
        System.out.println("ucgenin hpotenüs uzunluğu: "+ hipotenus);
        
        
    }
}
