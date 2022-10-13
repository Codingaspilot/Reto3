/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciclo3.reto3.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ciclo3.reto3.demo.Modelo.Car;
import ciclo3.reto3.demo.Servicio.CarService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
/**
 *
 * @author lufel
 */
@RestController
@RequestMapping("/api/Car")
public class CarController {
      @Autowired
    private CarService carService;
    
    @GetMapping("/all")
    public List<Car> getAll(){
        return carService.getAll();
    }
    
    @GetMapping("/{id}")
    public Optional<Car> getCar(@PathVariable("idCar") int idCar){
        return carService.getCar(idCar);
    } 
    
    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Car save (@RequestBody Car car){
        return carService.save(car);
    }
}

  

   


