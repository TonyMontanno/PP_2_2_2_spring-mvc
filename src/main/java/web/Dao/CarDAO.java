package web.Dao;

import web.Models.Car;

import java.util.List;

public interface CarDAO {
    public List<Car> showCars();
    public List<Car> showCars(int count);


}

