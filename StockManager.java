/*
 * @version 1.0
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StockManager {
    private static final Scanner sc = new Scanner(System.in);
    private static int select = 0;

    public static void main(String[] args) {
        int limit = 10;
        List<Product> product = new ArrayList<>(limit);
        product.add(new Product("potatoes", 3, 2.0));
        while (select != 4) {
            try {
                System.out.println("-----> Select your option:\n1 => Add a new product" +
                        "\n2 => Search for a product\n" +
                        "3 => Modify stock and price\n" +
                        "4 => Exit \n" +
                        ">>");
                select = Integer.parseInt(sc.nextLine());
                switch (select) {
                    case 1:
                        System.out.println("Enter the name");
                        String name = sc.nextLine();
                        System.out.println("Enter the stock");
                        int stock = Integer.parseInt(sc.nextLine());
                        System.out.println("Enter the price");
                        double price = Double.parseDouble(sc.nextLine());
                        product.add(new Product(name, stock, price));
                        System.out.println("Done");
                        break;
                    case 2:
                        System.out.println("Enter the name");
                        String request = sc.nextLine();
                        for (Product aProduct : product) {
                            if (request.equals(aProduct.information)) {
                                System.out.println("Price > " + aProduct.price);
                                System.out.println("Stock > " + aProduct.stock);
                            }
                        }
                        break;
                    case 3:
                        System.out.println("Enter the name");
                        String modifiedField = sc.nextLine();
                        // arrow functions with similar function as for each loop in line 42
                        product.stream().filter(aProduct -> modifiedField.equals(aProduct.information)).forEach(aProduct -> {
                            System.out.println("Old price: " + aProduct.price);
                            System.out.println("Old stock: " + aProduct.stock);
                            System.out.println("Enter new price > ");
                            aProduct.price = Double.parseDouble(sc.nextLine());
                            System.out.println("Enter new stock > ");
                            aProduct.stock = Integer.parseInt(sc.nextLine());
                        });
                        System.out.println("Done");
                        break;
                    case 4:
                        System.out.println("Thanks, bye");
                        break;
                    default:
                        System.out.println("Error, choose 1 - 4");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Choose a number listed below! \n");
            }

        }

    }

}
