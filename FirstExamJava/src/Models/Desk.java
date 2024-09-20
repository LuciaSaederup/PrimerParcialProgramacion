package Models;

public class Desk extends Product{

    public Double height;
    public Double width;

    public Desk() {
    }

    public Desk(Integer stock, String name, Double price, Double height, Double width) {
        super(stock, name, price);
        this.height = height;
        this.width = width;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Desk{" +
                "stock=" + super.getStock() +
                ", name='" + super.getName() + '\'' +
                ", price=" + super.getPrice() +
                ", height=" + height +
                ", width=" + width +
                '}';
    }
}
