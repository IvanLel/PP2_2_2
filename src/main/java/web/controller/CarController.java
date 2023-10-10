package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.List;

@Controller
public class CarController {

    @Autowired
    private CarService carService;

    @RequestMapping("/cars")
    public String printCars(@RequestParam(value = "count",defaultValue = "5") int count,
                            Model model) {
        List<Car> carList = carService.getCarList().stream().limit(count).toList();

        model.addAttribute("cars", carList);
        return "cars-view";
    }
}
