import java.util.ArrayList;
import java.util.List;
import java.lang.Integer;
public class Cart {
    List<Product> cartItems=new ArrayList<Product>();
    List<Product> userItems=new ArrayList<Product>();

    public void addProductToCartByPID(int pid) {
        Product product = getProductByProductID(pid);
        addToCart(product);
        product.setStock(product.getStock()+1);
    }

    public void addInBoxByPID(int pid) {
        Product product = getProductByProductID(pid);
        buyProduct(product);
        int count=1;
        product.setStock(count);
        count++;
    }
    private Product getProductByProductID(int pid) {
        Product product = null;
        List<Product> products = new Products().getProducts();
        for (Product prod: products) {
            if (prod.getPid() == pid) {
                product = prod;
                break;
            }
        }
        return product;
    }

    private void addToCart(Product product) {
        cartItems.add(product);
    }
    private void buyProduct(Product product) {
        userItems.add(product);
    }

    public void removeProductByPID(int pid) {
        Product prod = getProductByProductID(pid);
        cartItems.remove(prod);
    }

    void printUserItems() {
        for(Product prod: userItems) {
            System.out.println(prod.getName()+" "+prod.getStock()+" ");

        }
    }

    void printCartItems() {
        for (Product prod: cartItems) {
            System.out.println(prod.getName()+" "+prod.getStock()+" ");
        }
    }
}
