public class Artwork {
    //properties
    private String title;
    private String artist;
    private double price;

    //constructor

    public Artwork (String title, String artist, double price){
        this.title = title;
        this.artist = artist;
        this.price = price;
    }
    public String getTitle(){

        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist(){
        return this.artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public double getPrice(){

        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
