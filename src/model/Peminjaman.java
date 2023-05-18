package model;

// Nama : Vincentius Kenton
// NPM : 210711307

// Nama : Alfa Nada Yulaswara
// NPM : 210711378


public class Peminjaman {
    private int Id;
    private String lama_pinjam, tanggal_peminjaman, kondisi_cacat;
    private Pustaka pustaka;
    private Mahasiswa mahasiswa;

    public Peminjaman(int Id, String lama_pinjam, String tanggal_peminjaman, String kondisi_cacat, Pustaka pustaka, Mahasiswa mahasiswa) {
        this.Id = Id;
        this.lama_pinjam = lama_pinjam;
        this.tanggal_peminjaman = tanggal_peminjaman;
        this.kondisi_cacat = kondisi_cacat;
        this.pustaka = pustaka;
        this.mahasiswa = mahasiswa;
    }

    public Peminjaman(String lama_pinjam, String tanggal_peminjaman, String kondisi_cacat, Pustaka pustaka, Mahasiswa mahasiswa) {
        this.lama_pinjam = lama_pinjam;
        this.tanggal_peminjaman = tanggal_peminjaman;
        this.kondisi_cacat = kondisi_cacat;
        this.pustaka = pustaka;
        this.mahasiswa = mahasiswa;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getLama_pinjam() {
        return lama_pinjam;
    }

    public void setLama_pinjam(String lama_pinjam) {
        this.lama_pinjam = lama_pinjam;
    }

    public String getTanggal_peminjaman() {
        return tanggal_peminjaman;
    }

    public void setTanggal_peminjaman(String tanggal_peminjaman) {
        this.tanggal_peminjaman = tanggal_peminjaman;
    }

    public String getKondisi_cacat() {
        return kondisi_cacat;
    }

    public void setKondisi_cacat(String kondisi_cacat) {
        this.kondisi_cacat = kondisi_cacat;
    }

    public Pustaka getPustaka() {
        return pustaka;
    }

    public void setPustaka(Pustaka pustaka) {
        this.pustaka = pustaka;
    }

    public Mahasiswa getMahasiswa() {
        return mahasiswa;
    }

    public void setMahasiswa(Mahasiswa mahasiswa) {
        this.mahasiswa = mahasiswa;
    }
    
    
    
}
