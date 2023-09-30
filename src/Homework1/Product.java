package Homework1;

public class Product extends Category {


    private double price;

    private double rating;

    public Product(String nameProduct, double price, double rating) {
        super(nameProduct);
        this.nameProduct = nameProduct;
        this.price = price;
        this.rating = rating;
    }

    public Product(String name) {
        super(name);
    }

    public Product(String nameProduct, double price) {
        super(nameProduct);
        this.nameProduct = nameProduct;
        this.price = price;
    }

    public String getName() {
        return nameProduct;
    }

    public void setName(String name) {
        this.nameProduct = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price >= 0 && price <= 1000) {
            this.rating = price;
        } else {
            System.out.println("Это слишком дорогая цена, напишите другую ");
        }
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        if (rating >= 0 && rating <= 5) {
            this.rating = rating;
        } else {
            System.out.println("Такого рейтинга нет, попробуйте еще раз ");
        }
    }


}
