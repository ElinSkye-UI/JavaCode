
package Modul10;  //folder untuk kelas ini


public class KonversiKg {   //memberika kelas ini akses public supaya dapat di akses dari kelas/package lain
    public static void main(String[] args) {  //kalimat kode pertama untuk semua kode di Java
        double pon, Kg;  //data double untuk variabel pon dan kg
        
        pon = 55.5;  //value variabel pon
        Kg = 0.454 * pon;  //rumus variabel kg
        
        System.out.print(pon +"pon = "+Kg);  //menampilkan hasil dari konversi pon
    }  //akhir dari main
}  //akhir dari kelas ini
