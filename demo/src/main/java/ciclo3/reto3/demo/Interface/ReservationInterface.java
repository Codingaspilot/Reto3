package ciclo3.reto3.demo.Interface;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import ciclo3.reto3.demo.Modelo.Reservation;

public interface ReservationInterface extends CrudRepository<Reservation, Integer> {

    public Reservation save(Reservation reservation);

    public void delete(Reservation reservation);

    @Query("SELECT c.client, COUNT(c.client) FROM Reservation AS c GROUP BY c.client ORDER BY COUNT (c.client) DESC")
    public List<Object[]> countTotalReservationsByClient(); 
    public List<Reservation> findAllByStatus(String status);
    public List<Reservation> findAllByStartDateAfterAndDevolutionDateBefore(Date dateOne, Date dateTwo);
}
