package Homework1;

public class Basket {

    private Product[] sold;

    public Basket(Product[] sold) {
        this.sold = sold;
    }

    public Basket() {
    }

    public Product[] getSold() {
        return sold;
    }

    public void setSold(Product[] sold) {
        this.sold = sold;
    }
}
