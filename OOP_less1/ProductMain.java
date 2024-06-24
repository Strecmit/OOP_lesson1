package OOP_less1;

import OOP_less1.Prod.BottleOfWater;
import OOP_less1.Prod.EPackage;
import OOP_less1.Prod.HotDrinkVM;
import OOP_less1.Prod.WaterVendingMachine;
import OOP_less1.Prod.CapOfHotDrink;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ProductMain {

    public static void main(String[] args) {
        Product bottle1 = new BottleOfWater("Родники", 55, LocalDate.of(2024, 5, 1));

        Product bottle2 = new BottleOfWater("Родники Газированная", 65, LocalDate.of(2024, 6, 10),
                true, EPackage.GLASS.getMaterial(), 0.5F);

        Product coffee1 = new CapOfHotDrink("Espresso", 80, LocalDate.of(2024,6,11));

        Product coffee2 = new CapOfHotDrink("Cappuccino", 150, LocalDate.of(2024,6,11), 300,65);

        Product tea1 = new CapOfHotDrink("Green cold tea", 90, LocalDate.of(2024,6,11), 150,20);

        VendingMachine vm = new WaterVendingMachine();

        //VendingMachine vm1 = new HotDrinkVM();

        VendingMachine hdvm1 = new HotDrinkVM();

        System.out.println(vm.getProducts());

        vm.addProducts(List.of(bottle1, bottle1, bottle1, bottle2, bottle2, bottle2));

        hdvm1.addProducts(List.of(coffee1, coffee1, coffee2, coffee2, tea1,tea1));

        System.out.println("VM-" + vm.getProducts());
        vm.getProduct("Родники");
        System.out.println("VM-" + vm.getProducts());

        System.out.println("HDVM-" + hdvm1.getProducts());
        hdvm1.getProduct("Espresso");
        hdvm1.getProduct("Cappuccino");
        System.out.println("HDVM-" + hdvm1.getProducts());




    }
}
