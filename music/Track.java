package music;

public class Track{
    //(1) Attribute
    private String artist;
    private String title;

    //(2) Konstruktor
    public Track(String artist, String title){
        setAllDetails(artist, title);
    }

    //(3) Methoden
    public String getArtist() {
        return artist;
    }
    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAllDetails(String artist, String title){
        setArtist(artist);
        setTitle(title);
        //this.artist = artist;
        //this.title = title;
    }
}