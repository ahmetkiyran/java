/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.idman_programi_part1;

/**
 *
 * @author Ahmet
 */
public class Idman {
    private int burpee_sayisi;
    private int pushup_sayisi;
    private int situp_sayisi;
    private int squat_sayisi;

    public Idman(int burpee_sayisi, int pushup_sayisi, int situp_sayisi, int squat_sayisi) {
        this.burpee_sayisi = burpee_sayisi;
        this.pushup_sayisi = pushup_sayisi;
        this.situp_sayisi = situp_sayisi;
        this.squat_sayisi = squat_sayisi;
    }

    /**
     * @return the burpee_sayisi
     */
    public int getBurpee_sayisi() {
        return burpee_sayisi;
    }

    /**
     * @param burpee_sayisi the burpee_sayisi to set
     */
    public void setBurpee_sayisi(int burpee_sayisi) {
        this.burpee_sayisi = burpee_sayisi;
    }

    /**
     * @return the pushup_sayisi
     */
    public int getPushup_sayisi() {
        return pushup_sayisi;
    }

    /**
     * @param pushup_sayisi the pushup_sayisi to set
     */
    public void setPushup_sayisi(int pushup_sayisi) {
        this.pushup_sayisi = pushup_sayisi;
    }

    /**
     * @return the situp_sayisi
     */
    public int getSitup_sayisi() {
        return situp_sayisi;
    }

    /**
     * @param situp_sayisi the situp_sayisi to set
     */
    public void setSitup_sayisi(int situp_sayisi) {
        this.situp_sayisi = situp_sayisi;
    }

    /**
     * @return the squat_sayisi
     */
    public int getSquat_sayisi() {
        return squat_sayisi;
    }

    /**
     * @param squat_sayisi the squat_sayisi to set
     */
    public void setSquat_sayisi(int squat_sayisi) {
        this.squat_sayisi = squat_sayisi;
    }
    public void hareketYap(String hareketTuru,int sayi)
    {
        if(hareketTuru.equals("Burpee"))
        {
            burpeeYap(sayi);
            
        }
        else if(hareketTuru.equals("Pushup"))
        {
            pushupYap(sayi);
        }
        else if(hareketTuru.equals("Situp"))
        {
            situpYap(sayi);
        }
        else if(hareketTuru.equals("Squat"))
        {
            squatYap(sayi);
        }
        else
        {
            System.out.println("geçersiz hareket");
        }
    }
    public void burpeeYap(int sayi)
    {
        if(burpee_sayisi == 0)
        {
            System.out.println("yapacak burpee kalmadı ");
        }
        if(burpee_sayisi - sayi < 0)
        {
            System.out.println("hedeflediğin burpee sayısını geçtin ");
            burpee_sayisi = 0;
            System.out.println("kalan burpee:"+burpee_sayisi);
        }
        else
        {
            burpee_sayisi -= sayi;
            System.out.println("kalan burpee sayisi: "+burpee_sayisi);
        }
    }
     public void pushupYap(int sayi)
    {
        if(pushup_sayisi == 0)
        {
            System.out.println("yapacak pushup kalmadı ");
        }
        if(pushup_sayisi - sayi < 0)
        {
            System.out.println("hedeflediğin pushup sayısını geçtin ");
            pushup_sayisi = 0;
            System.out.println("kalan pushup:"+pushup_sayisi);
        }
        else
        {
            pushup_sayisi -= sayi;
            System.out.println("kalan pushup sayisi: "+pushup_sayisi);
        }
    }
      public void situpYap(int sayi)
    {
        if(situp_sayisi == 0)
        {
            System.out.println("yapacak situp kalmadı ");
        }
        if(situp_sayisi - sayi < 0)
        {
            System.out.println("hedeflediğin situp sayısını geçtin ");
            situp_sayisi = 0;
            System.out.println("kalan situp:"+situp_sayisi);
        }
        else
        {
            situp_sayisi -= sayi;
            System.out.println("kalan situp sayisi: "+situp_sayisi);
        }
    }
       public void squatYap(int sayi)
    {
        if(squat_sayisi == 0)
        {
            System.out.println("yapacak squat kalmadı ");
        }
        if(squat_sayisi - sayi < 0)
        {
            System.out.println("hedeflediğin squat sayısını geçtin ");
            squat_sayisi = 0;
            System.out.println("kalan squat:"+squat_sayisi);
        }
        else
        {
            squat_sayisi -= sayi;
            System.out.println("kalan squat sayisi: "+squat_sayisi);
        }
    }
       public boolean idmanbittiMi()
       {
           return (burpee_sayisi == 0) && (pushup_sayisi == 0) && (situp_sayisi == 0) && (squat_sayisi== 0);
       }
}
