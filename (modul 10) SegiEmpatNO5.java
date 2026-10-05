
package Modul10;  //folder untuk kelas ini


public class SegiEmpatNO5 {  //memberika kelas ini akses public supaya dapat di akses dari kelas/package lain
    public static void main(String[] args) {  //kalimat kode pertama untuk semua kode di Java
        int panjang, lebar;  //data integer untuk variabel panjang dan lebar
        double luas, keliling;  //data double untuk variabel luas dan keliling
        
        panjang = 15;  //value variabel panjang
        lebar = 10;  //value variabel lebar
        luas = panjang * lebar;  //rumus variabel luas
        keliling = 2 * (panjang + lebar);  //rumus variabel keliling
        
        System.out.print("Hasil keliling dan luas dari panjang : "+panjang+" dan dari lebar : "+lebar+" adalah : "+keliling+" cm dan "+luas+" cm^2 ");
    }  //akhir dari main           //menampilkan hasil dari luas dan keliling segi empat jika diketahui panjang dan lebarnya
}  //akhir dari kelas ini
