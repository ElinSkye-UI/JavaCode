
package Modul10;  //folder untuk kelas ini


public class BeratIdeal {  //memberika kelas ini akses public supaya dapat di akses dari kelas/package lain
    public static void main(String[] args) {  //kalimat kode pertama untuk semua kode di Java
        int tinggiBadan, beratIdeal;  //data integer variabel tinggi badan dan berat ideal
        
        tinggiBadan = 170;  //value variabel tinggi badan
        beratIdeal = tinggiBadan - 110;  //rumus berat ideal sesuai soal
        
        System.out.print("Berat Ideal dari Tinggi Badan : "+tinggiBadan+" adalah : "+beratIdeal+" kg ");
    }  //akhir dari main              //menampilkan hasil dari rumus berat ideal yang sudah ditetapkan oleh soal dan tinggi badan yang disesuaikan
}  //akhir dari kelas ini
