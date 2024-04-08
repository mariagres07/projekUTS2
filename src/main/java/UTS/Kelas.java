package UTS;

import java.util.Scanner;

public class Kelas {

    public static Mahasiswa [] daftarMahasiswa;//aku ga tau ini untuk apa
        //ini untuk array data mahasiswa si
    // nanti ketika mergesort dijalankan\
    // bakal memanggil array mahasiswa
    //melakukan switch urutan/indeks data ketika nilai seorang mahasiswa lebih tinggi atau lebih kecil daripada
    //anggota kelas lainnya
    //untuk memanggil juga bisa si tapi gausah static langsung public bisa kah? jadi ga perlu static
    //untuk method yang memerlukan atribut objek itu


    //error di array nya, line 49

    public Kelas(Mahasiswa[] daftarMahasiswa) {//m. constructor
        this.daftarMahasiswa = daftarMahasiswa;//wait kalau ini dipisah dengan setter gimana?
    }

    public static void addPesertaDidik() {//m. input
        Scanner scanner = new Scanner(System.in);
        /*System.out.println("Masukkan banyak mahasiswa = ");
        int banyakMhs = scanner.nextInt();*/
        // ini kuhapus ya karena untuk banyakMhs kita pakai length aja ya?

        System.out.println("Silahkan Masukkan Data Mahasiswa Anda:----------------------------------------------------------");
        System.out.println();
        for (int i = 0; i < daftarMahasiswa.length; i++) {
            System.out.println();
            System.out.println("Mahasiswa ke - " + (i + 1) + " : ");
            System.out.print("Masukkan Nama Mahasiswa : ");
            String nama = scanner.nextLine();
            System.out.print("Masukkan Nim  : ");
            String Nim = scanner.nextLine();
            System.out.print("Masukkan nilai uh  : ");
            int uh = scanner.nextInt();
            System.out.print("Masukkan nilai uts  : ");
            int uts = scanner.nextInt();
            System.out.print("Masukkan nilai uas  : ");
            int uas = scanner.nextInt();

            System.out.println();
            scanner.nextLine();
            daftarMahasiswa[i] = new Mahasiswa(nama, Nim, uh, uts, uas);

        }
    }

}
