package com.cardealer.cardealer;

import com.cardealer.cardealer.car.Car;
import com.cardealer.cardealer.car.CarService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ProgramController {

    private final CarService carService;

    public ProgramController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/")
    public String hello() {
        return "hello";
    }

    @GetMapping("/carsList")
    public String carsList(Model model) {
        model.addAttribute("cars", carService.getCars());
        return "cars";
    }

    @GetMapping("/addCar")
    public String addCar(
            @RequestParam(value = "producer", required = false) String producer,
            @RequestParam(value = "modelName", required = false) String modelName,
            @RequestParam(value = "version", required = false) String version,
            @RequestParam(value = "productionYear", required = false) Integer productionYear
    ) {
        if (producer != null && modelName != null && version != null && productionYear != null) {
            carService.addCar(producer, modelName, version, productionYear);
        }
        return "addingCar";
    }

    @GetMapping("/deleteCar/{id}")
    public String deleteCarById(
            @PathVariable Integer id
    ) {
        carService.deleteCarById(id);
        return "redirect:/carsList";
    }

    @GetMapping("/editCar/{id}")
    public String editCar(
            @PathVariable Integer id,
            Model model
    ) {
        Car editedCar = carService.findById(id);
        model.addAttribute("editedCar", editedCar);
        return "editingCar";
    }

    @GetMapping("/saveEditedCar")
    public String saveEditedCar(
            @RequestParam(value = "id", required = false) Integer id,
            @RequestParam(value = "producer", required = false) String producer,
            @RequestParam(value = "modelName", required = false) String modelName,
            @RequestParam(value = "version", required = false) String version,
            @RequestParam(value = "productionYear", required = false) Integer productionYear
    ) {
        carService.editCar(id, producer, modelName, version, productionYear);
        return "redirect:/carsList";
    }

}
