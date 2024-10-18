import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter product data: ");

        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Price: ");
        double price = sc.nextDouble();

        System.out.print("Quantity in stock: ");
        int quantity = sc.nextInt();
        System.out.println();

        Product product = new Product(name, price, quantity);

        System.out.println("Product data: "+product.getName()+", $"+product.getPrice()+", "+product.getQuantity()+" units, Total: "+product.totalValueInStock());
        System.out.println();

        System.out.println("Enter the number of the product to be added in stock: ");
        int quantityAdd = sc.nextInt();
        product.addProducts(quantityAdd);
        System.out.println();

        System.out.println("Updated data: "+product.getName()+", $"+product.getPrice()+", " + product.getQuantity()+" units, Total: "+product.totalValueInStock());
        System.out.println();

        System.out.println("Enter the number of the product to be removed from stock: ");
        int quantityRemoved = sc.nextInt();
        product.removeProducts(quantityRemoved);
        System.out.println();
        
        System.out.println("Updated data: "+product.getName()+", $"+product.getPrice()+", "+product.getQuantity()+" units, Total: "+product.totalValueInStock());

        sc.close();
    }
}