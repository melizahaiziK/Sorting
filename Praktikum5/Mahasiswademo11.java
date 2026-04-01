package Praktikum5;

import java.util.Scanner;

public class Mahasiswademo11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlah = sc.nextInt();
        sc.nextLine();
        MahasiswaBerprestasi11 list = new MahasiswaBerprestasi11(jumlah);

        for (int i = 0; i < jumlah; i++) {
            System.out.println("Data Mahasiswa ke-" + (i + 1));

            System.out.print("Nama  : ");
            String nama = sc.nextLine();

            System.out.print("NIM   : ");
            String nim = sc.nextLine();

            System.out.print("Kelas : ");
            String kelas = sc.nextLine();

            System.out.print("IPK   : ");
            double ipk = Double.parseDouble(sc.nextLine());

            Mahasiswa11 m = new Mahasiswa11(nim, nama, kelas, ipk);
            list.tambah(m);
            System.out.println();
        }
        System.out.println("Data yang sudah terurut menggunakan INSERTION SORT (ASC)");
        list.insertionSort();
        list.tampil();
    }
}