/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciclo3.reto3.demo.Repositorio;

import ciclo3.reto3.demo.Interface.CarInterface;
import ciclo3.reto3.demo.Modelo.Car;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
/**
 *
 * @author lufel
 */
@Repository
public class CarRepository {
    @Autowired
    private CarInterface extencionesCrud;
    
    public List<Car> getAll(){
        return (List<Car>) extencionesCrud.findAll();
    }
    
    public Optional<Car> getTool(int id){
        return extencionesCrud.findById(id);
    }
    
    public Car save(Car car){
        return extencionesCrud.save(car);
    }

    public Optional<Car> getCar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Car save(Optional<Car> car) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
} 

