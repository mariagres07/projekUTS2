package com.mycompany.uts;

public class Mahasiswa {

    String nama;
    String nim;
    double nilaiUts;

    public Mahasiswa(String nama, String nim, double nilaiUts) {
        this.nama = nama;
        this.nim = nim;
        this.nilaiUts = nilaiUts;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public double getNilaiUts() {
        return nilaiUts;
    }

    public void setNilaiUts(double nilaiUts) {
        this.nilaiUts = nilaiUts;
    }

}
