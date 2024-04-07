package com.mycompany.uts;

import com.mycompany.uts.Mahasiswa;
import java.util.Scanner;

public class MainUts {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int nilai;
        int[] mahasiswa;
        int jumlahMhs;
//        double uts1, uts2, uas;
        int pilih = 0;

        System.out.println("Data nilai mahasiswa tahun 2022/2023 angkatan 22");
        do {
            System.out.println("Menu utama : ");
            System.out.println("1. Tampilkan daftar nilai");
            System.out.println("2. Tambahkan data nilai");
            System.out.println("Masukkan pilihan = ");
            int pilihan = in.nextInt();
            if (pilih == 1) {
//                Mahasiswa.TampilkanNilaiMahasiswa();

            } else if (pilih == 2) {
                System.out.print("Masukkan jumlah Mahasiswa     : ");
                jumlahMhs = in.nextInt();

                for (int i = 0; i < jumlahMhs; i++) {
                    System.out.println("Mahasiswa ke-" + (i + 1));
                    System.out.println("");
                }
//                Mahasiswa.tambahNilai();
            }
        } while (pilih < 1 && pilih > 2);

    }

}
