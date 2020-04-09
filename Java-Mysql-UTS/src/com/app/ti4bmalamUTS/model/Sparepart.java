/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.ti4bmalamUTS.model;

/**
 *
 * @author denis
 */
public class Sparepart {
    private String IdPart;
    private String NamaPart;
    private String MerkPart;
    private String Harga;
    private String Jumlah;
public Sparepart(){
    
}
public Sparepart(String idDosen, String nama, String alamat, String email, String telepon) {
        this.IdPart = IdPart;
        this.NamaPart = NamaPart;
        this.MerkPart = MerkPart;
        this.Harga = Harga;
        this.Jumlah = Jumlah;
    }

    public String getIdPart() {
        return IdPart;
    }

    public void setIdPart(String IdPart) {
        this.IdPart = IdPart;
    }

    public String getNamaPart() {
        return NamaPart;
    }

    public void setNamaPart(String NamaPart) {
        this.NamaPart = NamaPart;
    }

    public String getMerkPart() {
        return MerkPart;
    }

    public void setMerkPart(String MerkPart) {
        this.MerkPart = MerkPart;
    }

    public String getHarga() {
        return Harga;
    }

    public void setHarga(String Harga) {
        this.Harga = Harga;
    }

    public String getJumlah() {
        return Jumlah;
    }

    public void setJumlah(String Jumlah) {
        this.Jumlah = Jumlah;
    }

    
    
}
