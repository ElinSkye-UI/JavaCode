
package Modul10;  //folder untuk kelas ini


public class VolumeKotak {  //memberika kelas ini akses public supaya dapat di akses dari kelas/package lain
    public static void main(String[] args) {  //kalimat kode pertama untuk semua kode di Java
        int panjang, lebar, tinggi;  //data integer variabel panjang, lebar, dan tinggi kotak
        double volume;  //data double variabel volume kotak
        
        panjang = 10;  //value variabel panjang
        lebar = 15;  //value variabel lebar
        tinggi = 5;  //value variabel tinggi
        volume = panjang * lebar * tinggi;  //rumus volume kotak
        
        System.out.print("Volume dari panjang : "+panjang+" lebar : "+lebar+" tinggi : "+tinggi+" adalah : "+volume+" cm^3");
    }  //akhir dari main           //menampilkan hasil dari rumus volume kotak yang panjang lebar dan tingginya sudah diketahui
}  //akhir dari kelas ini
