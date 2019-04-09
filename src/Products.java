import java.util.ArrayList;
import  java.util.List;
import java.util.Scanner;

public class Products {

    private final List<Product> products = new ArrayList<Product>();

    public Products()
    {
        this.initStoreItems();
    }

    public List<Product> getProducts() {
        return products;
    }
    int count=0;
    public void initStoreItems() {
        String [] productNames = {"Lux Soap", "Fair n Lovely", "MTR"};
        Double [] productPrice = {40.00d, 60.00d, 30.00d};
        Integer [] stock = {10, 6, 10};

        for (int i=0; i < productNames.length; i++) {
            this.products.add(new Product(i+1, productNames[i], productPrice[i], stock[i]));
        }

        count=productNames.length;
    }

    public void addOtherOject() {
        Scanner in = new Scanner(System.in);
        String productName = in.next();
        Double productPrice = in.nextDouble();
        Integer stock = in.nextInt();
        this.products.add(new Product(count+1,productName,productPrice, stock));

    }


}
