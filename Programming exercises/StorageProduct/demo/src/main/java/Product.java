
public class Product {
   
    private String name;
    private double price;
    private int quantity;

    public Product() {
    }

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public double totalValueInStock(){
        return price*quantity;
    }

    public void addProducts(int quantityAdd){
        if(quantity >= 0){
            quantity += quantityAdd;
        }
        else{
            System.out.println("Quantity less than 0.");
        } 
    }
    public void removeProducts(int quantityRemoved){
        if(quantity >= quantityRemoved){
            quantity -= quantityRemoved;
        }
        else{
            System.out.println("Unable to remove. Quantity removed greater than quantity in stock or zero stock.");
        }
    }
}
