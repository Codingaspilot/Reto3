/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciclo3.reto3.demo.Repositorio;

import ciclo3.reto3.demo.Interface.ReservationInterface;
import org.springframework.stereotype.Repository;
import ciclo3.reto3.demo.Modelo.Reservation;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
/**
 *
 * @author lufel
 */
@Repository
public class ReservationRepository {
    @Autowired
    private ReservationInterface extencionesCrud;
    
    public List<Reservation> getAll(){
        return (List<Reservation>) extencionesCrud.findAll();
    }
    
    public Optional<Reservation> getReservation(int id){
        return extencionesCrud.findById(id);
    }
    
    public Reservation save(Reservation reservation){
        return extencionesCrud.save(reservation);
    }
}

