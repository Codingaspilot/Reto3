/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciclo3.reto3.demo.Repositorio;

import ciclo3.reto3.demo.Interface.ReservationInterface;
import org.springframework.stereotype.Repository;

import ciclo3.reto3.demo.Modelo.Client;
import ciclo3.reto3.demo.Modelo.Reservation;
import ciclo3.reto3.demo.Modelo.DPO.CountClient;

import java.util.ArrayList;
import java.util.Date;
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

    public void delete (Reservation reservation){
        extencionesCrud.delete(reservation);
    } 
    
    public List<CountClient> getTopClients(){
        List<CountClient> resultado=new ArrayList<>();
        List<Object[]>report=extencionesCrud.countTotalReservationsByClient();
        for(int i=0;i<report.size();i++){
            resultado.add(new CountClient((Long)report.get(i)[1], (Client)report.get(i)[0]));

        }
        return resultado;

    }

    public List<Reservation> getReservationPeriod(Date a, Date b){
    return extencionesCrud.findAllByStartDateAfterAndDevolutionDateBefore(a, b);
    }
    public List<Reservation> getReservationByStatus(String status){
        return extencionesCrud.findAllByStatus(status);
    }

}

