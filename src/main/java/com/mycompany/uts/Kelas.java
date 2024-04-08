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
        System.out.println();
        for (int i = 0; i < banyakMhs; i++) {
            System.out.println();
            System.out.println("Mahasiswa ke - " + (i + 1) + " : ");
            System.out.print("Masukkan Nama Mahasiswa : ");//buffer target
            String Nama = scanner.nextLine();
            System.out.print("Masukkan Nim  : ");//buffer target
            String Nim = scanner.nextLine();
            System.out.print("Masukkan nilai  : ");//buffer target
            int nilai = scanner.nextInt();

            System.out.println();
            scanner.nextLine();
            daftarMahasiswa[i] = new Mahasiswa(Nama, Nim, nilai);
            //perlukah ditambahkan exception handling didalamnya??
            //jadi kita bisa mencegah typo dan salah input yang tidak sesuai dengan yang diharapkan
            //sama buffer karena input error
        }
    }
//apakah ini sudah benar??// ini method pengurutan mergesort
    public void MergeSortNilaiMahasiswaAscending(Mahasiswa[] daftarMahasiswa) {
        int length = daftarMahasiswa.length;
        if (length <= 1) {
            return;//base case
        }
        int middle = length / 2;

        //membuat dua sub array (dividing step)
        Mahasiswa[] leftArray = new Mahasiswa[middle];
        Mahasiswa[] rightArray = new Mahasiswa[length - middle];//array tetap terbagi 2 meski ganjil

        int i = 0;//untuk left array
        int j = 0;//untuk right array

        for (; i < length; i++) {
            if (i < middle) {//(memindahkan array indeks ke-0 sampai ke (middle-1) ke arraykiri
                leftArray[i] = daftarMahasiswa[i];
            } else {//(memindahkan array indeks ke-middle sampai ke - length ke arraykiri
                rightArray[j] = daftarMahasiswa[i];
                j++;
            }
        }
        MergeSortNilaiMahasiswaAscending(leftArray);//rekursif untuk membagi lagi arraykiri menjadi 2 hingga elemennya hanya bersisa 1
        MergeSortNilaiMahasiswaAscending(rightArray);//rekursif untuk membagi lagi arraykanan menjadi 2 hingga elemennya hanya bersisa 1
        MergeNilaiMahasiswa(leftArray, rightArray, daftarMahasiswa);
    }

    public void MergeNilaiMahasiswa(Mahasiswa[] LeftArray, Mahasiswa[] RightArray, Mahasiswa[] daftarMahasiswa) {
        int i = 0, l = 0, r = 0; //indeks-indeks

        //mengecek kondisi untuk menggabungkan dan mengurutkan
        while (l < LeftArray.length && r < RightArray.length) {
            if (LeftArray[l].getNilaiUts() > RightArray[r].getNilaiUts()) {//membandingkan kiri dan kanan
                daftarMahasiswa[i] = LeftArray[l];// jika angka kiri lebih kecil maka akan dimasukkan pada array asli indeks ke-i
                i++;//indeks array asli selanjutnya
                l++;//indeks array kiri selanjutnya
            } else {
                daftarMahasiswa[i] = RightArray[r];
                i++;//indeks array asli selanjutnya
                r++;//indeks array kanan selanjutnya
            }
        }
        while (l < LeftArray.length) {
            daftarMahasiswa[i] = LeftArray[l];
            i++;//indeks array asli selanjutnya
            l++;//indeks array kiri selanjutnya
        }
        while (r < RightArray.length) {
            daftarMahasiswa[i] = RightArray[r];
            i++;//indeks array asli selanjutnya
            r++;//indeks array kanan selanjutnya
        }
    }
}
