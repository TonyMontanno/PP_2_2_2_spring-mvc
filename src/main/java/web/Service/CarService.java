package web.Service;

import web.Models.Car;

import java.util.List;

public interface CarService {
public String showCars();
public List<Car> showCars(int count);
}

