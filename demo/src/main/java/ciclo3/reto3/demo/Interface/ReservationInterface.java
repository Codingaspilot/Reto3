package ciclo3.reto3.demo.Interface;

import org.springframework.data.repository.CrudRepository;
import ciclo3.reto3.demo.Modelo.Reservation;

public interface ReservationInterface extends CrudRepository<Reservation, Integer> {
    
}
