/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ASUS
 */
public class Dosen {
    private String nomerIndukDosen;
    private String nama;
    private String noHandphone;
    private String email;

    public Dosen(String nomerIndukDosen, String nama, String noHandphone, String email) {
        this.nomerIndukDosen = nomerIndukDosen;
        this.nama = nama;
        this.noHandphone = noHandphone;
        this.email = email;
    }

    public String getNomerIndukDosen() {
        return nomerIndukDosen;
    }

    public void setNomerIndukDosen(String nomerIndukDosen) {
        this.nomerIndukDosen = nomerIndukDosen;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNoHandphone() {
        return noHandphone;
    }

    public void setNoHandphone(String noHandphone) {
        this.noHandphone = noHandphone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public String showDataDosen(){
        return 
                this.nomerIndukDosen + " | "
                + this.nama + " | "
                + this.email + " | "
                + this.noHandphone;
    }
}
