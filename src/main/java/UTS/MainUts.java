package UTS;

import java.util.Scanner;

public class MainUts {

    public static void main(String[] args) {//ini yang membuat atribut di kelas lain haru static ka?
        Scanner in = new Scanner(System.in);
        int nilaiFinal;//ini belum  dibikin rumusnya Kelas kelassdlc;//ini juga nggak perlu(?)//iya si kalau kelasnya cuma satu harusnya engga
        int jumlahMhs;
        int pilihan = 0;

        System.out.println("Daftar nilai siswa");
        do {
            System.out.println("Menu utama : ");
            System.out.println("1. Tampilkan daftar nilai");
            System.out.println("2. Tambahkan data nilai");
            System.out.println("Masukkan pilihan = ");
            pilihan = in.nextInt();
            if (pilihan == 1) {
//                Mahasiswa.TampilkanNilaiMahasiswa();

            } else if (pilihan == 2) {
                System.out.print("Masukkan jumlah Mahasiswa     : ");
                jumlahMhs = in.nextInt();

                Kelas.daftarMahasiswa = new Mahasiswa[jumlahMhs];
                Kelas.addPesertaDidik();
                //int[] mahasiswa = new int[jumlahMhs];//ini apa?
                //yang ini kan sudah ada di class kelas jadi kubintang dulu yak
                /*for (int i = 0; i < mahasiswa.length; i++) {
                    System.out.println("Mahasiswa ke-" + (i + 1));
                    System.out.println();
                }*/
                //ini kenapa
//wait
            }
        } while (pilihan <= 0 && pilihan > 2);//ini salah katanya
//masih salah katanya, btw laptop ku habis batre ;)
        //kamu copy aja codingannya ya
        //takutnya besok aku nggak sempat buka laptop


        //masak masak untuk lebaran//weeehhhh nastar ga si
        //opor, rendang, kupat ga si// sirup ga si, eh tapi biasanya sirup di tempatku panas
        //atau aku send code nya ke grup aja?
    }
    //sini kah?
//iya, main mu tadi gimana?
    //btw, di sini bisa call wkwkkw
    // aku tekan tadi
}
//lah tadi kutekan call kah///coba di commit and push dulu mar // eh kok disini ?? :"""""
//okok