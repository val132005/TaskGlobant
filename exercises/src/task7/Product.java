package task7;

public class Product {

    int productCode;
    String productName;
    String unitMeasure;
    String description;
    float price;

    public  Product (int productCode, String productName, String unitMeasure, String description, float price){
        this.productCode = productCode;
        this.productName=productName;
        this.unitMeasure = unitMeasure;
        this.description = description;
        this.price = price;
    }

    public void printProduct() {
        System.out.println("Product details:");
        System.out.println("Product Code: " + productCode);
        System.out.println("Product Name: " + productName);
        System.out.println("Unit of Measure: " + unitMeasure);
        System.out.println("Description: " + description);
        System.out.println("Price: " + price);
    }

    public int getProductCode() {
        return productCode;
    }

    public void setProductCode(int productCode) {
        this.productCode = productCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getUnitMeasure() {
        return unitMeasure;
    }

    public void setUnitMeasure(String unitMeasure) {
        this.unitMeasure = unitMeasure;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }



}
