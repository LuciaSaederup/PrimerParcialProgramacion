package Models;

public class Notebook extends Electronics {
    public Integer memoryGb;
    public Notebook() {
    }

    public Notebook(Integer stock, String name, Double price, String manufacturer, Integer memoryGb) {
        super(stock, name, price, manufacturer);
        this.memoryGb = memoryGb;

    }

    public Integer getMemoryGb() {
        return memoryGb;
    }

    public void setMemoryGb(Integer memoryGb) {
        this.memoryGb = memoryGb;
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "stock=" + super.getStock() +
                ", name='" + super.getName() + '\'' +
                ", price=" + super.getPrice() +
                ", memoryGb=" + memoryGb +
                '}';
    }
}
