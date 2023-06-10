package model;

public class Pembelian {
    private int id;
    private String tanggal;
    private User user;
    private Game game;

    public Pembelian(int id, String tanggal, User user, Game game) {
        this.id = id;
        this.tanggal = tanggal;
        this.user = user;
        this.game = game;
    }

    public Pembelian(String tanggal, User user, Game game) {
        this.tanggal = tanggal;
        this.user = user;
        this.game = game;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }
}
