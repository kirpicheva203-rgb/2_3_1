package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.servise.CarServiseImpl;

@Controller
public class CarController {

    private final CarServiseImpl carServise;

    @Autowired
    public CarController(CarServiseImpl carServise) {
        this.carServise = carServise;
    }

    @GetMapping("/cars")
    public String getCars(@RequestParam(value = "count", required = false) Integer count, Model model) {
        if (count == null) {
            model.addAttribute("allCars", carServise.getCars());
        } else {
            model.addAttribute("allCars", carServise.cars(count));
        }
        return "cars";
    }
}
