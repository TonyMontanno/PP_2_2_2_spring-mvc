package web.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import web.Dao.CarDAO;
import web.Models.Car;

import java.util.List;

@Component
public class CarServiceImpl implements CarService{

    private final CarDAO carDAO;

    public CarServiceImpl(CarDAO carDAO) {
        this.carDAO = carDAO;
    }


    @Override
    public String showCars() {
        return showCars();
    }

    @Override
    public List<Car> showCars(int count) {
        return carDAO.showCars(count);
    }
}
