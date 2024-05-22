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

    //Getters and Setters
    public String getTitle(){

        return this.title;
    }

    public String getArtist(){

        return this.artist;
    }

    public double getPrice(){

        return this.price;
    }
}
