public class Customer {

    //properties
    private String name;
    private double wallet;

    //constructor
    public Customer (String name, double wallet){
        this.name = name;
        this.wallet = wallet;
    }
    public String getName(){
        return this.name;
    }
    public double getWallet(){
        return this.wallet;
    }
}