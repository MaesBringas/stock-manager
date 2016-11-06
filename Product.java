/*
 * -->> Product class
 * Exercise7.java
 * @authors mahl && mebs
 * @version 1.0
 */


public class Product {
    int stock;
    double price;
    String information;

    public Product() {
    }

    public Product(String information, int stock, double prize) {

        this.information = information;
        this.stock = stock;
        this.price = prize;

    }

}
