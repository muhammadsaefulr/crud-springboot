package com.example.live.user;

import jakarta.persistence.*;

    //Menginisialisasi Tabel Dan Menetapkan Nama Table
@Entity
@Table(name = "siswa")

public class User{
    
    // Membuat Id Menjadi Auto Incerement / Ter Isi Otomatis
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    // Data Kolom Lainya
    @Column(name = "nama")
    private String nama;

    @Column(name = "kelas")
    private String kelas;

    @Column(name = "alamat")
    private String alamat;

    // Mengambil Dan Menetapkan Data Siswa

    public Long getId() {
        return id;
    }

    public void setId(long id){
        this.id = id;
    }

    public String getName() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
      }

    public String getKelas(){
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat){
        this.alamat = alamat;
    }

}