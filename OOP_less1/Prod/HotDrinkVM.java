package OOP_less1.Prod;
import OOP_less1.Product;
import OOP_less1.VendingMachine;

import java.util.List;

public class HotDrinkVM extends VendingMachine {


    public HotDrinkVM() {
        super();
    }
    public HotDrinkVM(List<Product> products){
        super(products);
    }

    @Override
    public void addProducts(List<Product> products) {
        //System.out.println("Всегда ничего не верну, бе бе бе!");
        this.products.addAll(products);
    }



}
