import Models.Product;
import Services.FunctionsService;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {

        FunctionsService functionsService = new FunctionsService();
        ArrayList<Product> products = functionsService.getProductList();
        
        
        functionsService.showInstanceProducts(products);
        Double applyDdiscountClient = functionsService.applyDiscount(12,products.getFirst());
        System.out.println("El descuento aplicaddo al producto elegido es: " + applyDdiscountClient);
        functionsService.updatePrices(products);

    }
}
