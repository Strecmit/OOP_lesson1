package OOP_less1.Prod;
import OOP_less1.Product;
import OOP_less1.VendingMachine;

import java.util.List;


public class WaterVendingMachine extends VendingMachine{

    public WaterVendingMachine()  {
        super();
    }

    public WaterVendingMachine(List<Product> products) {
        super(products);
    }

    @Override
    public void addProducts(List<Product> products) {
        this.products.addAll(products);
    }
}
