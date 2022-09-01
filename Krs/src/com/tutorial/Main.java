package com.tutorial;

//Data Mahasiswa
class mahasiswa{
    //data member
    String nim;
    String nama;
    String jurusan;

    //membuat data dari class matkul dan waktu
    matkul matakuliah;
    waktu waktukuliah;
    
    //constructor
    mahasiswa(String nim, String nama, String jurusan){
        this.nim = nim;
        this.nama = nama;
        this.jurusan = jurusan;

    }
    //membuat method untuk memasukan matkul
    void pilihanMatkul(matkul matakuliah){
        this.matakuliah = matakuliah;
    }
    //membuat method untuk memasuk waktu kuliah
    void pilihanWaktu(waktu waktukuliah){
        this.waktukuliah = waktukuliah;
    }
    //method yang ditampilkan di program
    void tampilkan(){
        System.out.println("\n");
        System.out.println(" ***** KRS MAHASISWA *****  ");
        System.out.println("NIM     : " +this.nim);
        System.out.println("Nama    : " +this.nama);
        System.out.println("Jurusan : " +this.jurusan);
        this.matakuliah.tampilkan();
        this.waktukuliah.tampilkan();
    }
}

//Data Mata Kuliah
class matkul{
    //data member
    String nama;
    String dosen;
    //constructor
    matkul(String nama, String dosen){
        this.nama = nama;
        this.dosen = dosen;
    }
    //method menampilkan di program
    void tampilkan(){
        System.out.println("Matkul  : " +this.nama + " , Dosen  : " +this.dosen);
    }

}

//Data Waktu Kuliah
class waktu{
    //data member
    String jam;
    //constructor
    waktu(String jam){
        this.jam = jam;
    }
    //method menampilkan di program
    void tampilkan(){
        System.out.println("Waktu   : " +this.jam);
    }

}

public class Main {
    public static void main(String[] args) {
        //membuat object mahasiswa
        mahasiswa mahasiswa1 = new mahasiswa("A12.2005.01846", "Barinda", "Teknik Informatika");
        mahasiswa mahasiswa2 = new mahasiswa("A12.2005.01789", "Agustina", "Teknik Informatika");
        mahasiswa mahasiswa3 = new mahasiswa("A12.2005.01999", "Enzy", "Teknik Informatika");
        mahasiswa mahasiswa4 = new mahasiswa("A12.2005.01876", "Binar", "Teknik Informatika");
        mahasiswa mahasiswa5 = new mahasiswa("A12.2005.01345", "Cizia", "Teknik Informatika");

        //membuat object matkul
        matkul dataMining = new matkul("Data Mining", "Bambang");
        matkul AI = new matkul("AI", "Oni");
        matkul Programming = new matkul("Prorgamming", "Sugiyanto");

        //membuat object waktu kuliah 
        waktu pagi = new waktu("Pagi");
        waktu siang = new waktu("Siang");
        waktu sore = new waktu("Sore");

        //mahasiswa 1
        mahasiswa1.pilihanMatkul(dataMining);
        mahasiswa1.pilihanWaktu(pagi);
        mahasiswa1.tampilkan();
     
        //mahasiswa 2
        mahasiswa2.pilihanMatkul(Programming);
        mahasiswa2.pilihanWaktu(siang);
        mahasiswa2.tampilkan();

        //mahasiswa 3
        mahasiswa3.pilihanMatkul(AI);
        mahasiswa3.pilihanWaktu(sore);
        mahasiswa3.tampilkan();
        
        //mahasiswa 4
        mahasiswa4.pilihanMatkul(dataMining);
        mahasiswa4.pilihanWaktu(pagi);
        mahasiswa4.tampilkan();

        //mahasiswa 5
        mahasiswa5.pilihanMatkul(AI);
        mahasiswa5.pilihanWaktu(siang);
        mahasiswa5.tampilkan();
    }
}
