package model;

public class Refund {
    private int id;
    private Pembelian pembelian;
    private String tanggal_refund;
    private int ballance;

    public Refund(int id, Pembelian pembelian, String tanggal_refund, int ballance) {
        this.id = id;
        this.pembelian = pembelian;
        this.tanggal_refund = tanggal_refund;
        this.ballance = ballance;
    }

    public Refund(Pembelian pembelian, String tanggal_refund, int ballance) {
        this.pembelian = pembelian;
        this.tanggal_refund = tanggal_refund;
        this.ballance = ballance;
    }

    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Pembelian getPembelian() {
        return pembelian;
    }

    public void setPembelian(Pembelian pembelian) {
        this.pembelian = pembelian;
    }

    public String getTanggal_refund() {
        return tanggal_refund;
    }

    public void setTanggal_refund(String tanggal_refund) {
        this.tanggal_refund = tanggal_refund;
    }
    
    public int getBallance() {
        return ballance;
    }

    public void setBallance(int ballance) {
        this.ballance = ballance;
    }
}
