import java.util.ArrayList;
import java.util.List;

public class Customer {

    //properties
    private String name;
    private double wallet;
    private List<Artwork> artCollection;

    //constructor
    public Customer (String name, double wallet){
        this.name = name;
        this.wallet = wallet;
        this.artCollection = new ArrayList<>();
    }
    public String getName(){

        return this.name;
    }
    public double getWallet(){

        return this.wallet;
    }
    public void buyArtwork(Artwork artwork){
        artCollection.add(artwork);
        wallet -=artwork.getPrice();
    }
}