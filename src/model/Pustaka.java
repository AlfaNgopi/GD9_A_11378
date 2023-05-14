/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
// Nama : Vincentius Kenton
// NPM : 210711307

// Nama : Alfa Nada Yulaswara
// NPM : 210711378

public class Pustaka {
    private String id_pustaka, judul, jenis, tahunTerbit, penerbit;
    private int edisi, volume;

    public Pustaka(String idPustaka, String judul, String jenis, String tahunTerbit, String penerbit, int edisi, int volume) {
        this.id_pustaka = idPustaka;
        this.judul = judul;
        this.jenis = jenis;
        this.tahunTerbit = tahunTerbit;
        this.penerbit = penerbit;
        this.edisi = edisi;
        this.volume = volume;
    }

    public String getIdPustaka() {
        return id_pustaka;
    }

    public void setIdPustaka(String idPustaka) {
        this.id_pustaka = idPustaka;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public String getTahunTerbit() {
        return tahunTerbit;
    }

    public void setTahunTerbit(String tahunTerbit) {
        this.tahunTerbit = tahunTerbit;
    }

    public String getPenerbit() {
        return penerbit;
    }

    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }

    public int getEdisi() {
        return edisi;
    }

    public void setEdisi(int edisi) {
        this.edisi = edisi;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
    
    

    
    
    public String showDataMajalah(){
        return 
                "ID Pustaka      : " +this.id_pustaka +
                "\nJudul               : " + this.judul +
                
                "\nTahun Terbit   : "+ this.tahunTerbit +
                "\nPenerbit          : "+ this.penerbit + 
                "\nVolume                : "+ this.volume +
                "\n";
    }
    
    public String showDataBuku(){
        return 
                "ID Pustaka      : " +this.id_pustaka +
                "\nJudul               : " + this.judul +
                
                "\nTahun Terbit   : "+ this.tahunTerbit +
                "\nPenerbit          : "+ this.penerbit + 
                "\nEdisi                : "+ this.edisi +
                "\n";
                
    }
}
