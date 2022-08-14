package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import web.Dao.CarDAO;



@Controller
public class CarsController {

    private final CarDAO carDAO;

    @Autowired
    public CarsController(CarDAO carDAO) {
        this.carDAO = carDAO;
    }


    @GetMapping("/cars")
    public String show(Model model) {
        model.addAttribute("cars",carDAO.show());
        return "cars";

    }

}
