package Models;

public class Chair extends Product{

    private Boolean wheel;

    public Chair() {
    }

    public Chair(Integer stock, String name, Double price, Boolean wheel) {
        super(stock, name, price);
        this.wheel = wheel;
    }

    public Boolean getWheel() {
        return wheel;
    }

    public void setWheel(Boolean wheel) {
        this.wheel = wheel;
    }

    @Override
    public String toString() {
        return "Sillas{" +
                "stock=" + super.getStock() +
                ", name='" + super.getName() + '\'' +
                ", price=" + super.getPrice() +
                ", wheel=" + wheel +
                '}';
    }
}
