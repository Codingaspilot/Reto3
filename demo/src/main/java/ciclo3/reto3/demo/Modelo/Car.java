/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciclo3.reto3.demo.Modelo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author lufel
 */
@Entity
@Table(name = "car")
public class Car {
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCar;
    private String name;
    private String brand;
    private String year;
    private String description;
    
    @ManyToOne
    @JoinColumn(name = "gamaId")
    @JsonIgnoreProperties("car")
    private Gama gama;
    
     @OneToMany(cascade = {CascadeType.PERSIST}, mappedBy = "car")
    @JsonIgnoreProperties({"car","client"})
    private List<Message> messages;
     
    @OneToMany(cascade = {CascadeType.PERSIST}, mappedBy = "car")
    @JsonIgnoreProperties({"car","messages"})
    private List<Reservation> reservations;

    public Integer getIdCar() {
        return idCar;
    }

    public void setIdCar(Integer idCar) {
        this.idCar = idCar;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Message> getMessages() {
        return messages;
    }

    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }
    
    public Gama getGama() {
        return gama;
    }

    public void setGama(Gama gama) {
        this.gama = gama;
    }

 
    
}

    
    

