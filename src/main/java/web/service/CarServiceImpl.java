package web.service;


import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import web.dao.CarDAO;
import web.models.Car;

import java.util.List;

@Service
public class CarServiceImpl implements CarService{

    private final CarDAO carDAO;

    public CarServiceImpl(CarDAO carDAO) {
        this.carDAO = carDAO;
    }




    @Override
    public List<Car> showCars(int count) {
        return carDAO.showCars(count);
    }
}
