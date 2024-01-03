package homework1;

import java.util.HashMap;
import java.util.Map;

public class Products {

    private int id;
    private String name;
    private double price;

    public Products(int id, String name, double priece) {

        this.id = id;
        this.name = name;
        this.price = priece;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}