package Cau3;

public class Singly {
    private String name;
    private float price;
    private int quantity;

    public Singly(String _name, float _price, int _quantity) {
        this.name = _name;
        this.price = (float) _price;
        this.quantity = _quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Singly [name=" + name + ", price=" + price + ", quantity=" + quantity + "]";
    }
}