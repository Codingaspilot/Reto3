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
        if (car.getIdCar() == null){
            return carRepository.save(car);
        } else {
            Optional<Car> car1 = carRepository.getCar(car.getIdCar());
            if(car1.isEmpty()){
                return carRepository.save(car);
            } else {
                return car;
            }
        }
    }

    public Car update(Car car){
        if(car.getIdCar()!=null){
            Optional<Car>e=carRepository.getCar(car.getIdCar());
            if(!e.isEmpty()){
                if(car.getName()!=null){
                    e.get().setName(car.getName());
                }
                if(car.getBrand()!=null){
                    e.get().setBrand(car.getBrand());
                }
                if(car.getYear()!=null){
                    e.get().setYear(car.getYear());
                }
                if(car.getDescription()!=null){
                    e.get().setDescription(car.getDescription());
                }
                if(car.getGama()!=null){
                    e.get().setGama(car.getGama());
                }
                carRepository.save(e.get());
                return e.get();
            }else {
                return car;
            }
        }else{
            return car;
         }
    }



    public boolean deleteCar (int id){
        Boolean d = getCar(id).map(car -> {
            carRepository.delete(car);
            return true;

        }).orElse(false);
        return d;
}
}