import java.util.List;
import java.util.Scanner;

public class UI {

    Cart cart = new Cart();
    Cart user = new Cart();

    private int ch = 0;

    public UI () {
        Scanner sc = new Scanner(System.in);
        String in=sc.next();
        if(in.equals("user")) {
            menuUser();
        }
        else if(in.equals("admin"))
        {
            menu();
        }
    }

    public void startScreen () {
        System.out.println("1. Display Store Products");
        System.out.println("2. Display Cart");
        System.out.println("0. Exit");
    }

    public void startScreenUser (){
        System.out.println("1. Display Store Products");
        System.out.println("2. Displey User Box");
        System.out.println("0. Exit");
    }

    public void storeProductsMenu() {
        System.out.println("1. Add to Cart");
        System.out.println("2. Remove From Cart");
        System.out.println("0. Exit");
    }

    public void userProducts() {
        System.out.println("1. Buy a product");
        System.out.println("0. Exit");
    }

    public void menuUser () {
        do {
            startScreenUser();
            getUserInput();

            switch (ch) {
                case 1:
                {displayStoreProducts();
                    userProducts();
                    getUserInput();
                    innerChoice2();
                    break;}

                case 2:
                {
                    showUserBox();
                    break;

                }
                case 0:
                {
                    System.exit(0);
                    break;
                }
            }

        }while(ch!=0);
    }
    public void menu () {
        do {
            startScreen();
            getUserInput();

            switch (ch) {
                case 1:
                {displayStoreProducts();
                    storeProductsMenu();
                    getUserInput();
                    innerChoice1();
                    break;}
                case 2:
                {showCart();
                    break;}
                case 0:
                {System.exit(0);
                    break;}
                default:

                    break;
            }
        } while (ch != 0);
    }

    private void innerChoice1() {
        switch (ch) {
            case 1:
            { addProductToCart();
                showCart();
                break;}
            case 2:
            {removeProductFromCart();
                displayStoreProducts();
                break;}
            default:

                break;
        }
    }

    private  void innerChoice2() {
        switch (ch) {
            case 1:
            {
                addToBox();
                showCart();
                break;}

                default:
                break;
        }
    }
    private int getUserInput() throws NumberFormatException {
        Scanner in = new Scanner (System.in);
        ch = Integer.parseInt(in.nextLine());
        return ch;
    }

    private void displayStoreProducts() {
        List<Product> products = new Products().getProducts();
        for (Product prod: products) {
            System.out.println(
                    prod.getPid() + "- " +
                            prod.getName() + " " +
                            prod.getPrice() + " " +
                            prod.getStock()
            );
        }
    }

    private void addProductToCart() {
        int pid = getUserInput();
        cart.addProductToCartByPID(pid);
    }

    private void addToBox() {
        int pid = getUserInput();
        user.addInBoxByPID(pid);
    }

    private void showCart() {
        cart.printCartItems();
    }

    private void showUserBox() {
        user.printUserItems();
    }

    private void removeProductFromCart() {
        int pid = getUserInput();
        cart.removeProductByPID(pid);
    }
}