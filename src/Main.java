import com.brand.Audi;
import com.brand.BMW;
import com.brand.Tesla;
import com.model.A6;
import com.model.A6Builder;
import com.model.X5;

public class Main {
    public static void main(String[] args) {

        System.out.println("---------------------Tesla");

        Tesla teslaCar = new Tesla(4, 4, "Black", "No", true, "Lition");
        teslaCar.display();

        System.out.println("---------------------Audi");

        Audi audiCar = new Audi(4, 4, "Red", "diesel", false, true);
        audiCar.display();

        System.out.println("---------------------BMW");

        BMW bmwCar = new BMW(4, 4, "Blue", "benz", false, true);
        bmwCar.display();

        System.out.println("---------------------Audi A6");

        A6 a6Car = new A6Builder()
                .setNumWheels(4)
                .setNumDoors(4)
                .setColor("White")
                .setFuel("gas")
                .setAutopilot(false)
                .setQuatro(true)
                .setOffRoad("AllRoad")
                .createA6();

        a6Car.display();

        System.out.println("---------------------BMW X5");

        X5 x5Car = new X5(4, 4, "Silver", "diesel", false, true, "Comfort+");
        x5Car.display();


    }

}
