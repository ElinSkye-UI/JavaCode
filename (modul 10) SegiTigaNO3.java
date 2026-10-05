
package Modul10;  //folder untuk kelas ini


public class SegiTigaNO3 {  //memberika kelas ini akses public supaya dapat di akses dari kelas/package lain
    public static void main(String[] args) {  //kalimat kode pertama untuk semua kode di Java
        int alas, tinggi;  //data integrer untuk variabel alas dan tinggi
        double luasSeg;  //data double untuk variabel luas Segitiga
        
        alas = 35;  //value variabel alas
        tinggi = 3;  //value variabel tinggi
        luasSeg = 0.5 * alas * tinggi;  //rumus luas segitiga
        System.out.print("Hasil dari luas segitiga dengan alas : "+alas+" dan tinggi : "+tinggi+" adalah = " +luasSeg);
    }  //akhir dari main         //menampilkan hasil dari luas segitiga dengan tambahan penampilan var. alas dan tinggi
}  //akhir dari kelas ini
