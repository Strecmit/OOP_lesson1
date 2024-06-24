package OOP_less1.Prod;
import java.time.LocalDate;
import OOP_less1.Product;

public class CapOfHotDrink extends Product{

    private int volume;
    private int temperature;

    public CapOfHotDrink(String name, double price, LocalDate releaseDate){
        super (name, price, releaseDate);
        this.volume = 30;
        this.temperature = 60;
    }
    public CapOfHotDrink(String name, double price, LocalDate releaseDate, int volume, int temperature){
        super (name, price, releaseDate);
        this.volume = volume;
        this.temperature = temperature;

    }
    @Override
    public String toString() {
        return "Cap Of Hot Drink {" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", releaseDate=" + releaseDate +
                "volume=" + volume +
                ", temperature=" + temperature + "°С}";
    }
}
