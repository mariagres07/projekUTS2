package UTS;

import java.util.Scanner;

public class MainUts {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int jumlahMhs;
        int pilihan;

        System.out.println("Daftar nilai siswa");
        do {
            System.out.println();
            System.out.println("Menu Utama : ");
            System.out.println("1. Tambahkan Data Nilai");
            System.out.println("2. Tampilkan Daftar Nilai");
            System.out.println("3. Keluar");

            System.out.print("Masukkan Pilihan = ");
            pilihan = in.nextInt();
            System.out.println();

            if (pilihan == 1) {
                System.out.print("Masukkan jumlah Mahasiswa     : ");
                jumlahMhs = in.nextInt();
                Mahasiswa[] daftarMahasiswa = new Mahasiswa[jumlahMhs];
                Kelas kelas = new Kelas(daftarMahasiswa);//objek baru isinya mulai lagi dari awal?
                //apakah bisa bertambah length?
                // bikin method new arr?? untuk menambah?
                Kelas.addPesertaDidik();
            } else if (pilihan == 2) {
                Kelas kelas = new Kelas(); //Buat objek Kelas
                kelas.TampilkanNilaiMahasiswa();

                mergeQuick merge = new mergeQuick(); // Buat objek mergeQuick
                Mahasiswa[] daftarMahasiswa = kelas.daftarMahasiswa;

                // Memanggil metode MergeSort ascending
                merge.MergeSortNilaiMahasiswaAscending(daftarMahasiswa);
                // Tampilkan hasil setelah pengurutan
                kelas.TampilkanNilaiMahasiswa();

                // Memanggil metode MergeSort descending
                merge.MergeSortNilaiMahasiswaDescending(daftarMahasiswa);
                // Tampilkan hasil setelah pengurutan
                kelas.TampilkanNilaiMahasiswa();

                // Memanggil metode QuickSort ascending
                int[] utsArrayAscending = new int[daftarMahasiswa.length];
                for (int i = 0; i < daftarMahasiswa.length; i++) {
                    utsArrayAscending[i] = daftarMahasiswa[i].getNilaiUts();
                }
                mergeQuick.QuickNilaiMahasiswaAscending(utsArrayAscending, 0, utsArrayAscending.length - 1);
                // Tampilkan hasil setelah pengurutan
                for (int i = 0; i < daftarMahasiswa.length; i++) {
                    System.out.println(utsArrayAscending[i]);
                }

                // Memanggil metode QuickSort descending
                int[] utsArrayDescending = new int[daftarMahasiswa.length];
                for (int i = 0; i < daftarMahasiswa.length; i++) {
                    utsArrayDescending[i] = daftarMahasiswa[i].getNilaiUts();
                }
                mergeQuick.QuickNilaiMahasiswaDescending(utsArrayDescending, 0, utsArrayDescending.length - 1);
                // Tampilkan hasil setelah pengurutan
                for (int i = 0; i < daftarMahasiswa.length; i++) {
                    System.out.println(utsArrayDescending[i]);
                }
            }
        } while (pilihan != 3);
    }
}
