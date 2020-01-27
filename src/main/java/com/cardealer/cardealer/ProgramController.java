package com.cardealer.cardealer;

import com.cardealer.cardealer.car.Car;
import com.cardealer.cardealer.car.CarService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ProgramController {

    private final CarService carService;
    List<Car> carsList;

    public ProgramController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/")
    public String hello() {
        return "hello";
    }

    @GetMapping("/carsList")
    public String carsList (Model model){
        model.addAttribute("cars", carService.getCars());
        return "cars";
    }

}
