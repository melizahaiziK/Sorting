package Praktikum5;
public class Dosen {
    String Kode;
    String nama;
    int usia;
    boolean jenisKelamin;

    Dosen(){
    }

    Dosen (String kd, String name, int age, boolean jk){
        Kode = kd;
        nama = name;
        usia = age;
        jenisKelamin = jk;
    }
    void tampil(){
        System.out.println("Nama: " + nama);
        System.out.println("Kode: " + Kode);
        System.out.println("Usia: " + usia);
        System.out.println("Jenis Kelamin: " + (jenisKelamin ? "Laki-laki" : "Perempuan"));
    }
}
