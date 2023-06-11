package model;

public class Refund {
    private int id;
    private Game game;
    private User user;
    private String tanggal_refund;
    private int ballance;

    public Refund(int id, Game game, User user, String tanggal_refund, int ballance) {
        this.id = id;
        this.game = game;
        this.user = user;
        this.tanggal_refund = tanggal_refund;
        this.ballance = ballance;
    }

    public Refund(Game game, User user, String tanggal_refund, int ballance) {
        this.game = game;
        this.user = user;
        this.tanggal_refund = tanggal_refund;
        this.ballance = ballance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
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
