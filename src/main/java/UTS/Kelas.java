package UTS;

import UTS.Mahasiswa;
import java.util.Scanner;

public class Kelas {
    Mahasiswa [] daftarMahasiswa;

    public Kelas(Mahasiswa[] daftarMahasiswa) {
        this.daftarMahasiswa = daftarMahasiswa;
    }

    public Mahasiswa[] getDaftarMahasiswa() {
        return daftarMahasiswa;
    }
    
    public void addPesertaDidik(Scanner scanner) {
        System.out.println("Silahkan Masukkan Data Mahasiswa Anda:----------------------------------------------------------");
        System.out.println("");
        for (int i = 0; i < daftarMahasiswa.length; i++) {
            System.out.println("");
            System.out.println("Mahasiswa ke - " + (i + 1) + " : ");
            System.out.print("Masukkan Nama Mahasiswa : ");
            String Nama = scanner.nextLine();
            System.out.print("Masukkan N  : ");
            String Nim = scanner.nextLine();
            System.out.println("Status :");
            System.out.println("1. Menikah");
            System.out.println("2. Belum Menikah");
            System.out.print("Masukkan angka Pilihan Anda : ");
            int Status = scanner.nextInt();
            System.out.print("Masukkan Jumlah Anak  : ");
            int JumlahAnak = scanner.nextInt();
            System.out.print("Masukkan Golongan     : ");
            int Golongan = scanner.nextInt();
            System.out.println("");
            scanner.nextLine();
            daftarMahasiswa[i] = new Mahasiswa(Nama, Nim, ilaiUts);
            daftarPegawai[i].hitungGajiPokok();
        }
    }
    
    
}
