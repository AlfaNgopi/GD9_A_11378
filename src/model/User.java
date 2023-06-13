package model;
import exception.InputKosongException;

public class User {
    private int user_id, wallet;
    private String nama, password, library;

    public User(int user_id, int wallet, String nama, String password, String library) {
        this.user_id = user_id;
        this.wallet = wallet;
        this.nama = nama;
        this.password = password;
        this.library = library;
    }

    public User(int wallet, String nama, String password, String library) throws InputKosongException {
        
        if ("".equals(nama) || "".equals(password)) {
            throw new InputKosongException();
        }else {
            this.wallet = wallet;
            this.nama = nama;
            this.password = password;
            this.library = library;
        }
        
        
        
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getWallet() {
        return wallet;
    }

    public void setWallet(int wallet) {
        this.wallet = wallet;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLibrary() {
        return library;
    }

    public void setLibrary(String library) {
        this.library = library;
    }
    
    public String showUser(){
        return "User ID     : "+this.user_id+
                "\nNama     : "+this.nama+
                "\nPassword     : "+this.password+
                "\nWallet       : "+this.wallet+
                "\nLibrary      : "+this.library+"\n";
    }
}
