public class Artwork {
    //properties
    private String title;
    private double price;
    //constructor

    public Artwork (String title, double price){
        this.title = title;
        this.price = price;
    }
    public String getTitle(){
        return this.title;
    }
    public double getPrice(){
        return this.price;
    }
}
