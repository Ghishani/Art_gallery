import java.util.ArrayList;
import java.util.List;

public class Customer {

    //properties
    private String name;
    private double wallet;
    private ArrayList<Artwork> artCollection;

    //constructor
    public Customer (String name, double wallet){
        this.name = name;
        this.wallet = wallet;
        this.artCollection = new ArrayList<>();
    }
    public boolean canBuy(Artwork artwork){
        if (artwork.getPrice() <= this.wallet){
            return true;
        }
        return false;
    }
    public void buyArtwork(Artwork artwork){
        this.wallet -= artwork.getPrice();
        this.artCollection.add(artwork);
    }
    public int getArtworkCount(){
        return this.artCollection.size();
    }

    //Getters and setters
    public String getName(){

        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWallet(){

        return this.wallet;
    }

    public void setWallet(double wallet) {
        this.wallet = wallet;
    }

}