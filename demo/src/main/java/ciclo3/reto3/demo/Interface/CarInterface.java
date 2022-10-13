package ciclo3.reto3.demo.Interface;

import org.springframework.data.repository.CrudRepository;
import ciclo3.reto3.demo.Modelo.Car;

public interface CarInterface extends CrudRepository <Car, Integer> {
    
    public Car save(Car car);

    public void delete(Car car);
    
}
    

