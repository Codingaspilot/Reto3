package ciclo3.reto3.demo.Servicio;

import ciclo3.reto3.demo.Repositorio.CarRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ciclo3.reto3.demo.Modelo.Car;

@Service

public class CarService {
   @Autowired
    private CarRepository carRepository;
    
    public List<Car> getAll(){
        return carRepository.getAll();
    }
    
    public Optional<Car> getCar(int id){
        return carRepository.getCar(id);
    }
    
    public Car save (Car car){
        if (car.getId() == null){
            return carRepository.save(car);
        } else {
            Optional<Car> car1 = carRepository.getCar(car.getId());
            if(car1.isEmpty()){
                return carRepository.save(car);
            } else {
                return car;
            }
        }
    }
}