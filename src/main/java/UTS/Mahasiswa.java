package UTS;

public class Mahasiswa {

    String nama;
    String nim;
    double nilaiUts;
    double nilaiUas;
    double nilaiUh;
    double nilaiTotal;

    public Mahasiswa(String nama, String nim, double nilaiUh, double nilaiUts, double nilaiUas, double nilaiTotal) {
        this.nama = nama;
        this.nim = nim;
        this.nilaiUh = nilaiUh;
        this.nilaiUts = nilaiUts;
        this.nilaiUas = nilaiUas;
        this.nilaiTotal = nilaiTotal;
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

    public void setNilaiUts(double nilaiUts) {
        this.nilaiUts = nilaiUts;
    }

    public double getNilaiUts() {
        return nilaiUts;
    }

    public void setNilaiUh(double nilaiUh) {
        this.nilaiUh = nilaiUh;
    }

    public double getNilaiUh() {
        return nilaiUh;
    }

    public void setNilaiUas(double nilaiUas) {
        this.nilaiUas = nilaiUas;
    }

    public double getNilaiUas() {
        return nilaiUas;
    }

    public void setNilaiTotal(double nilaiTotal) {
        this.nilaiTotal = nilaiTotal;
    }

    public double getNilaiTotal() {
        return nilaiTotal;
    }

}
