package com.mycompany.uts;

import java.util.Scanner;

public class Kelas {

    Mahasiswa[] daftarMahasiswa;

    public Kelas(Mahasiswa[] daftarMahasiswa) {
        this.daftarMahasiswa = daftarMahasiswa;
    }

    public Mahasiswa[] getDaftarMahasiswa() {
        return daftarMahasiswa;
    }

    public void addPesertaDidik(Scanner scanner) {

        System.out.println("Masukkan banyak mahasiswa = ");
        int banyakMhs = scanner.nextInt();
        System.out.println("Silahkan Masukkan Data Mahasiswa Anda:----------------------------------------------------------");
        System.out.println("");
        for (int i = 0; i < banyakMhs; i++) {
            System.out.println("");
            System.out.println("Mahasiswa ke - " + (i + 1) + " : ");
            System.out.print("Masukkan Nama Mahasiswa : ");
            String Nama = scanner.nextLine();
            System.out.print("Masukkan Nim  : ");
            String Nim = scanner.nextLine();
            System.out.print("Masukkan nilai  : ");
            int nilai = scanner.nextInt();

            System.out.println("");
            scanner.nextLine();
            daftarMahasiswa[i] = new Mahasiswa(Nama, Nim, nilai);

        }
    }

}
