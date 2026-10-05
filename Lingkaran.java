
package Modul10;  //folder untuk kelas ini


public class Lingkaran {  //memberika kelas ini akses public supaya dapat di akses dari kelas/package lain
    public static void main(String[] args) {  //kalimat kode pertama untuk semua kode di Java
        int jariJari;  //data integer jari jari lingkaran
        double phi, keliling, luas;  //data double phi,keliling, dan luas lingkaran
        
        jariJari = 21;  //value variabel jari jari
        phi = 22/7;  //value variabel phi yang digunakan
        keliling = 2 * phi * jariJari;  //rumus keliling lingkaran
        luas = phi * jariJari * jariJari;  //rumus luas lingkaran
        
        System.out.print("Hasil keliling dan luas lingkaran dari jari-jari : "+jariJari+" adalah : "+keliling+" cm dan "+luas+" cm^2");
    }  //akhir dari main               //menampilkan hasil dari luas dan keliling lingkaran dengan phi 22/7 jika diketahui jari jarinya
}  //akhir dari kelas
