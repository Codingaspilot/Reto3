/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciclo3.reto3.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ciclo3.reto3.demo.Modelo.Reservation;
import ciclo3.reto3.demo.Modelo.DPO.CountClient;
import ciclo3.reto3.demo.Modelo.DPO.StatusAmount;
import ciclo3.reto3.demo.Servicio.ReservationService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
/**
 *
 * @author lufel
 */
@RestController
@RequestMapping("/api/Reservation")
public class ReservationController {
      @Autowired
    private ReservationService reservationService;
    
    @GetMapping("/all")
    public List<Reservation> getAll(){
        return reservationService.getAll();
    }
    
    @GetMapping("/{id}")
    public Optional<Reservation> getReservation(@PathVariable("id") int id){
        return reservationService.getReservation(id);
    } 
    
    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Reservation save (@RequestBody Reservation reservation){
        return reservationService.save(reservation);
    }

    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public Reservation update(@RequestBody Reservation reservation){
        return reservationService.update(reservation);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean delete(@PathVariable("id")int id){
    return reservationService.deleteReservation(id);
    }

    @GetMapping("/report-clients")
    public List<CountClient> getReservationReportClient(){
        return reservationService.getTopClients();

    }

    @GetMapping("report-status")
    public StatusAmount getReservationStatus(){
        return reservationService.getReservationStatusReport();
    }

    @GetMapping("/report-dates/{dateOne}/{dateTwo}")
    public List<Reservation> getReservationReportDates(@PathVariable("dateOne")String dateOne,@PathVariable("dateTwo")String dateTwo){
        return reservationService.getReservationPeriod(dateOne, dateTwo);


    }

    
}
