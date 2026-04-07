package Praktikum5;
import java.util.Scanner;
public class DosenDemo {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       DataDosen list = new DataDosen();

       int pilihan;
       do {
        System.out.println("\n=== MENU DATA DOSEN ===");
            System.out.println("1. Tambah Data Dosen");
            System.out.println("2. Tampilkan Data");
            System.out.println("3. Sorting Usia ASC");
            System.out.println("4. Sorting Usia DSC");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    if (list.idx < 10){
                        System.out.print("Nama: ");
                        String nama = sc.nextLine();

                        System.out.print("Kode: ");
                        String kode = sc.nextLine();

                        System.out.print("Usia: ");
                        int usia = sc.nextInt();

                        System.out.print("Jenis Kelamin (L/P): ");
                        char jk = sc.next().charAt(0);
                        sc.nextLine();

                        boolean jenisKelamin = (jk == 'L' || jk == 'l');
                        Dosen dosen = new Dosen(kode, nama, usia, jenisKelamin);
                        list.tambah(dosen);
                    } else {
                        System.out.println("Data sudah penuh (maksimal 10)!");
                    }
                    break;
                    case 2:
                        list.tampil();
                        break;
                    case 3:
                        list.SortingASC();
                        System.out.println("Data berhasil diurutkan (ASC)");
                        list.tampil();
                        break;
                    case 4:
                        list.SortingDSC();
                        System.out.println("Data berhasil diurutkan (DSC)");
                        list.tampil();
                        break;
                    case 0:
                        break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
       }while (pilihan !=0); 
    }
}
