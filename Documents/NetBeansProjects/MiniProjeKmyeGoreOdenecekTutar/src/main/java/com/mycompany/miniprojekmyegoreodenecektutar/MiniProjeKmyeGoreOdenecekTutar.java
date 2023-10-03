/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.miniprojekmyegoreodenecektutar;

import java.util.Scanner;

/**
 *
 * @author Ahmet
 */
public class MiniProjeKmyeGoreOdenecekTutar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        float tutar;
        
        System.out.println("aracınız km başına ne kadar yakıyor: ");
        float tl = scanner.nextFloat();
        System.out.println("aracınız ile kaç km yol gittiniz: ");
        float yol = scanner.nextFloat();
        
        tutar = tl*yol;
        
        System.out.println("gittiğiniz yol için harcadığınız ücret miktarı: "+ tutar);
              
        
        
    }
}
