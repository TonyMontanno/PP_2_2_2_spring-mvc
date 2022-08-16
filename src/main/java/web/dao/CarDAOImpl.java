package web.dao;


import org.springframework.stereotype.Repository;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


@Repository
public class CarDAOImpl implements CarDAO {

    private static final List<Car> cars;

    static {
        cars = new ArrayList<>();
        cars.add(new Car("BMW", "X5", "Red"));
        cars.add(new Car("AUDI", "A8", "Metallic"));
        cars.add(new Car("HONDA", "Civic", "White"));
        cars.add(new Car("TESLA", "'3'", "Brown"));
        cars.add(new Car("LEXUS", "NX", "Blue"));

    }

    @Override
    public List<Car> showCars(int count) {
        if (count <= 0 || count >= 5) {
            return cars;
        }
        return cars.stream().limit(count).collect(Collectors.toList());
    }


}
