package exercise1;

import java.util.ArrayList;
import java.util.List;

public class Catalog {
    private List<Product> products = new ArrayList<>();

    public void addProduct(int productId, String productName, String productDescription, int productStock, double productPrice){
        Product newProduct = new Product(productId, productName, productDescription, productStock, productPrice);
        products.add(newProduct);
    }

    public void showProducts(){
        for (Product product : products){
            if (product.getProductStock()>0){
                System.out.println(product.getProductId());
                System.out.println(product.getProductName());
                System.out.println(product.getProductDescription());
                System.out.println(product.getProductStock());
                System.out.println(product.getProductPrice());
                System.out.println();
            }

        }
    }

    public void  showProductsPrice(){
        for (Product product : products){
            if (product.getProductStock()>0){
                System.out.println("Name: "+product.getProductName());
                System.out.println("Price: "+product.getProductPrice());
                System.out.println();
            }
        }
    }

    public void sellProduct(int id){
        for (Product product : products){
            if (product.getProductId()==id){
                if (product.getProductStock()>0){
                    product.setProductStock(product.getProductStock()-1);
                }else{
                    System.out.println("The product is not in stock");
                }
            }else {
                System.out.println("Code not found");
            }

        }

    }

    public void showSpecificProducts(int id){
        for (Product product : products){
            if (product.getProductId()==id){
                System.out.println("exercise1.Product sold:");
                System.out.println("Id: "+product.getProductId());
                System.out.println("Name: "+product.getProductName());
                System.out.println("Description: " + product.getProductDescription());
                System.out.println("Stock: "+product.getProductStock());
                System.out.println("Price: "+product.getProductPrice());
                System.out.println();
            }else {
                System.out.println("Code not found");
            }

        }
    }

}

