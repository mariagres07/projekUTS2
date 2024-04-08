package UTS;

public class mergeQuick {
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
