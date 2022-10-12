package ciclo3.reto3.demo.Servicio;

import ciclo3.reto3.demo.Repositorio.CarRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ciclo3.reto3.demo.Modelo.Carro;

@Service

public class CarService {
   @Autowired
    private CarRepository carRepository;
    
    public List<Carro> getAll(){
        return carRepository.getAll();
    }
    
    public Optional<Carro> getCarro(int id){
        return carRepository.getCarro(id);
    }
    
    public Carro save (Carro car){
        if (car.getId() == null){
            return carRepository.save(car);
        } else {
            Optional<Carro> car1 = carRepository.getCarro(car.getId());
            if(car1.isEmpty()){
                return carRepository.save(car);
            } else {
                return car;
            }
        }
    }
}