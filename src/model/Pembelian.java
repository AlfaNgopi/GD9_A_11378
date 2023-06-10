package model;

public class Pembelian {
    private int id;
    private String tanggal;
    private User user;
    private Game game;
    private int ballance;
    

    public Pembelian(int id, String tanggal, User user, Game game, int ballance) {
        this.id = id;
        this.tanggal = tanggal;
        this.user = user;
        this.game = game;
        this.ballance = ballance;
    }

    public Pembelian(String tanggal, User user, Game game, int ballance) {
        this.tanggal = tanggal;
        this.user = user;
        this.game = game;
        this.ballance = ballance;
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

    public int getBallance() {
        return ballance;
    }

    public void setBallance(int ballance) {
        this.ballance = ballance;
    }
    
    
}
