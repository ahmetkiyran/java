/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oop.atmprojesi;

/**
 *
 * @author Ahmet
 */
public class ATM {
    public void calis(Hesap hesap){
        Login login = new Login();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("bankamıza hoşgeldiniz...");
        System.out.println("*****************************");
        System.out.println("kullaıcı girişi");
        System.out.println("*****************************");
        
        int giris_hakki = 3;
        while(true)
        {
            if(login.login(hesap))
            {
                System.out.println("giriş başarılı");
                break;
            }
            else
            {
                System.out.println("giriş başarısız");
                giris_hakki -= 1;
                System.out.println("kalan giriş hakkı"+giris_hakki);
            }
            if(giris_hakki == 0)
            {
                System.out.println("giriş hakkınız bitti.");
                
                return;
            }
        }
        
        System.out.println("**************************");
        String islemler = "1.bakiye görüntüle\n"
                           +"2.para yatırma\n"
                           +"3.para çekme\n"
                           +"çıkış için q ya basınız...";
        System.out.println(islemler);
        System.out.println("***************************");
        
        
        
        while(true){
            System.out.println("işlemi seçiniz.");
            String islem = scanner.nextLine();
            
            if(islem.equals("q"))
            {
                break;
            }
            else if(islem.equals("1"))
            {
                System.out.println("bakiyeniz:"+hesap.getBakiye());
            }
            else if(islem.equals("2"))
                    {
                        int tutar = scanner.nextInt();
                        scanner.nextLine();
                        hesap.paraYatir(tutar);
                    }
            else if(islem.equals("3"))
            {
                System.out.println("çekmek istediğiniz tutarı yazınız: ");
                int tutar = scanner.nextInt();
                scanner.nextLine();
                hesap.paraCek(tutar);
            }
            else
            {
                System.out.println("geçersiz işlem");
            }
            
        }
    }
}
