import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the product quantity: ");
        int quantity = scanner.nextInt();
        Products[] products = new Products[quantity];
        createArray(scanner, products);

        TotalPrice(products);

        FindProduct(scanner, products);


    }

    private static void TotalPrice(Products[] products) {
        long sum = 0;
        for (Products product : products) {
            sum += product.getPrice();
        }

        System.out.println("The total price of the products is: " + sum);
    }

    private static void FindProduct(Scanner scanner, Products[] products) {
        System.out.print("Enter the name of the product you want to find: ");
        String nameProduct = scanner.nextLine();
        boolean flag = false;
        int index = 0;
        for (int i = 0; i < products.length; i++) {
            if (nameProduct.equals(products[i].getName())) {
                flag = true;
                index = i;
                break;
            }
        }
        if (flag) {
            System.out.println(products[index].toString());
        } else {
            System.out.println("There are no products in the list");
        }

    }
    public static void createArray(Scanner scanner, Products[] products) {

        for (int i = 0; i < products.length; i++) {
            System.out.print("Enter ID Product: ");
            int id = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Enter Name Product: ");
            String name = scanner.nextLine();
            System.out.print("Enter Prices Product: ");
            int price = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Enter Type Product: ");
            String type = scanner.nextLine();
            products[i] = new Products(id, name, price, type);
        }
    }
}
