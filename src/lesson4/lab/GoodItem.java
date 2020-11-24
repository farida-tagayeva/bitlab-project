package lesson4.lab;

public class GoodItem {
    private String name;
    private int price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "GoodItem{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
