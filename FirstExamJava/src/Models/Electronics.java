package Models;

public class Electronics extends Product {
    private String manufacturer;

    public Electronics() {
    }

    public Electronics(Integer stock, String name, Double price, String manufacturer) {
        super(stock, name, price);
        this.manufacturer = manufacturer;
    }
}
