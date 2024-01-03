package homework1;

import exercise1.Product;

import java.util.ArrayList;
import java.util.List;

public class Menu {

    private List<Products> menu;

    public Menu() {
        this.menu = new ArrayList<>();
    }

    public void addProduct(int id, String name, double price){
        Products newProducts = new Products(id, name, price);
        menu.add(newProducts);
    }


    public void modifyProduct(int id, String name, double price) {

        for (Products products : menu){
            if (products.getId()==id){
                products.setName(name);
                products.setPrice(price);
            }else {
                System.out.println("Code not found");
            }

        }
    }

    public void showAllProducts(){
        for (Products products : menu){
            System.out.println();
            System.out.println("Id: "+products.getId());
            System.out.println("Name: "+products.getName());
            System.out.println("Price: "+products.getPrice());

        }
    }

    public void showNumberProducts(){
        int count = 0;
        for (Products products : menu){
            count ++;
        }
        System.out.println("Products in the menu: "+count);
    }








}
