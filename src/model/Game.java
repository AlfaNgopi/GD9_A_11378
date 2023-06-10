package model;

public class Game {
    private String gameName, genre, releaseDate, deskripsi, review;
    private int gameId, price;

    public Game(String gameName, String genre, String releaseDate, String deskripsi, String review, int gameId, int price) {
        this.gameName = gameName;
        this.genre = genre;
        this.releaseDate = releaseDate;
        this.deskripsi = deskripsi;
        this.review = review;
        this.gameId = gameId;
        this.price = price;
    }

    public Game(String string, String string0) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public int getGameId() {
        return gameId;
    }

    public void setGameId(int gameId) {
        this.gameId = gameId;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
    public String showGame(){
        return "Game ID    : " + this.gameId +
                "\nJudul Game   : "+this.gameName+
                "\nGenre    : "+this.genre+
                "\nRelease Date     : "+this.releaseDate+
                "\nPrice    : "+this.price+
                "\nDeskripsi    : "+this.deskripsi+
                "\nReview    : "+this.review+"\n";
    }
}
