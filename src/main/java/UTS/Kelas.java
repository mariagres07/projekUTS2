package UTS;

import java.util.Scanner;

public class Kelas {

    public static Mahasiswa[] daftarMahasiswa;//aku ga tau ini untuk apa
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
        double uh;
        double uts;
        double uas;
        String nama;
        String nim;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Silahkan Masukkan Data Mahasiswa Anda:----------------------------------------------------------");

        for (int i = 0; i < daftarMahasiswa.length; i++) {
            System.out.println();
            System.out.println("Mahasiswa ke - " + (i + 1) + " : ");
            System.out.print("Masukkan Nama Mahasiswa : ");
            if (i > 0) {
                nama = scanner.nextLine();
                nama = scanner.nextLine();
            } else {
                nama = scanner.nextLine();
            }
            //add buffer
            System.out.print("Masukkan NIM            : ");
            nim = scanner.next();
            do {
                System.out.print("Masukkan Nilai UH       : ");
                uh = scanner.nextDouble();

            } while (uh < 0 || uh > 100);
            do {
                System.out.print("Masukkan Nilai UTS      : ");
                uts = scanner.nextDouble();
            } while (uts < 0 || uts > 100);
            do {
                System.out.print("Masukkan Nilai UAS      : ");
                uas = scanner.nextDouble();
            } while (uas < 0 || uas > 100);

            double nilaiTotal = ((30 * uh) / 100) + ((30 * uts) / 100) + ((40 * uas) / 100);

            daftarMahasiswa[i] = new Mahasiswa(nama, nim, uh, uts, uas, nilaiTotal);

        }
    }

    public static void TampilkanNilaiMahasiswa() {

        Scanner scanner = new Scanner(System.in);
        int pilihin;
        int pilih;
        do {
            System.out.println("1. Merge Sort");
            System.out.println("2. Quick Sort");
            pilihin = scanner.nextInt();

            if (pilihin == 1) {
                do {
                    System.out.println("1. Ascending");
                    System.out.println("2. Descending");
                    System.out.println("Masukkan pilihan = ");
                    pilih = scanner.nextInt();
                    if (pilih == 1) {
                        System.out.println("No\t\tNama\t\tNim\t\tUH\t\tUTS\t\tUAS\t\tNilai Total");
                        for (int i = 0; i < daftarMahasiswa.length; i++) {
                            System.out.printf("%-5s%-20s%-15s%-8.2f%-8.2f%-8.2f%-8.2f%n", (i + 1), daftarMahasiswa[i].getNama(),
                                    daftarMahasiswa[i].getNim(), daftarMahasiswa[i].getNilaiUh(), daftarMahasiswa[i].getNilaiUts(),
                                    daftarMahasiswa[i].getNilaiUas(), daftarMahasiswa[i].getNilaiTotal());
                        }

                    } else if (pilih == 2) {
                        System.out.println("No\t\tNama\t\tNim\t\tUH\t\tUTS\t\tUAS\t\tNilai Total");
                        for (int i = 0; i < daftarMahasiswa.length; i++) {
                            System.out.printf("%-5s%-20s%-15s%-8.2f%-8.2f%-8.2f%-8.2f%n", (i + 1), daftarMahasiswa[i].getNama(),
                                    daftarMahasiswa[i].getNim(), daftarMahasiswa[i].getNilaiUh(), daftarMahasiswa[i].getNilaiUts(),
                                    daftarMahasiswa[i].getNilaiUas(), daftarMahasiswa[i].getNilaiTotal());
                        }
                    }
                } while (pilih != 3);
            } else if (pilihin == 2) {
                do {
                    System.out.println("1. Ascending");
                    System.out.println("2. Descending");
                    System.out.println("Masukkan pilihan = ");
                    pilih = scanner.nextInt();
                    if (pilih == 1) {
                        System.out.println("No\t\tNama\t\tNim\t\tUH\t\tUTS\t\tUAS\t\tNilai Total");
                        for (int i = 0; i < daftarMahasiswa.length; i++) {
                            System.out.printf("%-5s%-20s%-15s%-8.2f%-8.2f%-8.2f%-8.2f%n", (i + 1), daftarMahasiswa[i].getNama(),
                                    daftarMahasiswa[i].getNim(), daftarMahasiswa[i].getNilaiUh(), daftarMahasiswa[i].getNilaiUts(),
                                    daftarMahasiswa[i].getNilaiUas(), daftarMahasiswa[i].getNilaiTotal());
                        }

                    } else if (pilih == 2) {
                        System.out.println("No\t\tNama\t\tNim\t\tUH\t\tUTS\t\tUAS\t\tNilai Total");
                        for (int i = 0; i < daftarMahasiswa.length; i++) {
                            System.out.printf("%-5s%-20s%-15s%-8.2f%-8.2f%-8.2f%-8.2f%n", (i + 1), daftarMahasiswa[i].getNama(),
                                    daftarMahasiswa[i].getNim(), daftarMahasiswa[i].getNilaiUh(), daftarMahasiswa[i].getNilaiUts(),
                                    daftarMahasiswa[i].getNilaiUas(), daftarMahasiswa[i].getNilaiTotal());
                        }
                    }
                } while (pilih != 3);
            }
        } while (pilihin != 3);

        //opsi nilai terurut dari besar ke terkecil, kecil ke terbesar?
    }

    // ascending
    // descending
    // perulangan input data
}
