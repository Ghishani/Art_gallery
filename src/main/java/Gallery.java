import java.util.ArrayList;
import java.util.List;

public class Gallery {
    //properties
    private String name;
    private double till;
    private ArrayList<Artwork> stock;

    //constructors
    public Gallery(String name){
        this.name = name;
        this.stock = new ArrayList<>();
        this.till = 0;
    }
    public void sellArtwork(Customer customer, Artwork artwork){
        if(customer.canBuy(artwork) == true){
            customer.buyArtwork(artwork);
            this.stock.remove(artwork);
            setTill(this.till + artwork.getPrice());
        }
    }
    public double calculateArtworkValue(){
        double total = 0;
        for(Artwork artwork : this.stock) {
            total += artwork.getPrice();
        }
        return total;

    }
    public int artworkCount(){
        return this.stock.size();
    }
    public void addArtwork(Artwork artwork){
        this.stock.add(artwork);
    }

    //Getters and Setters
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    public double getTill(){
        return this.till;
    }

    public void setTill(double till) {
        this.till = till;
    }

    public ArrayList<Artwork> getStock(){
        return stock;
    }

    public void setStock(ArrayList<Artwork> artworks) {
        this.stock =artworks;
    }

}
