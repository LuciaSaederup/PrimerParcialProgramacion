package Services;

import Models.*;

import javax.management.ObjectInstance;
import java.util.ArrayList;

public class FunctionsService {

   //Servicio de funciones
    public ArrayList<Product> productList = new ArrayList<>();

    public FunctionsService() {
        fillList();
    }

    public ArrayList<Product> getProductList() {
        return productList;
    }




    public void fillList(){
        Desk desk = new Desk(5,"Modern Desktop", 1500.00,1.90,1.3);
        Notebook notebook = new Notebook(7,"Acer Aspire 5", 1000000.00, "BG Colors", 280);
        Printer printer = new Printer(2,"Bg Color", 25000.00,"BG Colors",7 );
        Chair chair = new Chair(7,"Sport chair", 3000.00,false);
        productList.add(desk);
        productList.add(notebook);
        productList.add(printer);
        productList.add(chair);
    }

    public void showInstanceProducts(ArrayList<Product> list){
        for(Product prod : list){
            System.out.println("El producto es de tipo: "+prod.getClass().getSimpleName());
        }
    }

    public Double applyDiscount(Integer discount, Product product){
        Double originalPrice = product.getPrice();
        Double newPrice = originalPrice - (originalPrice * discount / 100);
        return newPrice;
    }

    public void updatePrices(ArrayList<Product> products){
        for(Product prod: products){
            Double lastPrice = prod.getPrice();
            System.out.println(prod.getName() + " Last price = " + lastPrice);
            switch (prod.getClass().getSimpleName().toString()){
                case "Printer":
                    prod.setPrice(lastPrice + (lastPrice * 15 /100));
                    break;
                case "Notebook":
                    prod.setPrice(lastPrice + (lastPrice * 20 / 100));
                    break;
                case "Chair":
                    prod.setPrice((lastPrice + (lastPrice * 5 / 100)));
                    break;
                case "Desk":
                    prod.setPrice(lastPrice + (lastPrice * 10 / 100));
                    break;
            }
            System.out.println(prod.getName() + " New price= " + prod.getPrice());


        }
    }

}
