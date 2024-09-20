package Models;

public class Printer extends Electronics {
    public Integer printsForMinute;

    public Printer(Integer stock, String name, Double price, String manufacturer, Integer printsForMinute) {
        super(stock, name, price, manufacturer);
        this.printsForMinute = printsForMinute;
    }

    public Printer() {
    }

    public Integer getPrintsForMinute() {
        return printsForMinute;
    }

    public void setPrintsForMinute(Integer printsForMinute) {
        this.printsForMinute = printsForMinute;
    }

    @Override
    public String toString() {
        return "Printer{" +
                "stock=" + super.getStock() +
                ", name='" + super.getName() + '\'' +
                ", price=" + super.getPrice() +
                ", printsForMinute=" + printsForMinute +
                '}';
    }
}
