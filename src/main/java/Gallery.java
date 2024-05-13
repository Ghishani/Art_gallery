public class Gallery {
    //properties
    private String name;
    private double till;

    //constructor
    public Gallery(String name, double till){
        this.name = name;
        this.till = till;
    }

    public String getName(){
        return this.name;
    }
    public double getTill(){
        return this.till;
    }

}
