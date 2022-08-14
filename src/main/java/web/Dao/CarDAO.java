package web.Dao;

import org.springframework.stereotype.Component;
import web.Models.Car;

import java.util.ArrayList;
import java.util.List;


@Component
public class CarDAO {

   private List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car("BMW","X5","Red"));
        cars.add(new Car("AUDI","A8","Metallic"));
        cars.add(new Car("HONDA","Civic","White"));
        cars.add(new Car("TESLA","'3'","Brown"));
        cars.add(new Car("LEXUS","NX","Blue"));

    }

    public List<Car> show() {
        return cars;
    }


//    public Car byId(int id){
//        return cars.stream().filter(car-> car.getId() == id).findAny().orElse(null);
//    }
}
