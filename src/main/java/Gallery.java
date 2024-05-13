import java.util.ArrayList;
import java.util.List;

public class Gallery {
    //properties
    private String name;
    private int till;
    private List<Artwork> stock;

    //constructor
    public Gallery(String name, int till){
        this.name = name;
        this.till = till;
        this.stock = new ArrayList<>();
    }

    public String getName(){
        return this.name;
    }

    public double getTill(){
        return this.till;
    }

    public void setTill(int amount) {
        this.till = amount;
    }

    public List<Artwork> getStock(){
        return stock;
    }

    public void addToStock(Artwork artwork) {
        stock.add(artwork);
    }



}
