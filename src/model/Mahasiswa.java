package model;

// Nama : Vincentius Kenton
// NPM : 210711307

// Nama : Alfa Nada Yulaswara
// NPM : 210711378


public class Mahasiswa {
    private int id;
    private String nama, npm, no_telepon;

    public Mahasiswa(int id, String nama, String npm, String no_telepon) {
        this.id = id;
        this.nama = nama;
        this.npm = npm;
        this.no_telepon = no_telepon;
    }

    public Mahasiswa(String nama, String npm, String no_telepon) {
        this.nama = nama;
        this.npm = npm;
        this.no_telepon = no_telepon;
    }
    
    
    
    @Override
    public String toString(){
        return nama;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNpm() {
        return npm;
    }

    public void setNpm(String npm) {
        this.npm = npm;
    }

    public String getNo_telepon() {
        return no_telepon;
    }

    public void setNo_telepon(String no_telepon) {
        this.no_telepon = no_telepon;
    }
    
    public String showDataMahasiswa(){
        return "ID Mahasiswa    : " + id +
                "\nNama     : " + nama +
                "\nNPM      : " + npm +
                "\nNomor Telepon    : " + no_telepon + "\n";
    }
    
}
