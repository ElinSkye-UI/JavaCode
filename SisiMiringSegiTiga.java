
package Modul10;  //folder untuk kelas ini

public class SisiMiringSegiTiga {  //memberika kelas ini akses public supaya dapat di akses dari kelas/package lain
    public static void main(String[] args) {  //kalimat kode pertama untuk semua kode di Java
        int alas, tinggi;  //data integer variabel alas dan tinggi
        double sisiMiring;  //data double variabel sisi miring
        
        alas = 8;  //value variabel alas
        tinggi = 10;  //value variabel tinggi
        sisiMiring = Math.sqrt ((tinggi * tinggi) - (alas * alas)); //rumus sisi miring menggunakan fungsi math.sqrt (akar kuadrat)
        
        System.out.print("Sisi Miring dari segitiga siku-siku dengan alas : "+alas+" dan tinggi : "+tinggi+" adalah : "+sisiMiring+" cm ");
    }  //akhir dari main             //menampilkan hasil dari rumus sisi miring segitiga dengan diketahuinya alas dan tingginya
} //akhir dari kelas ini
