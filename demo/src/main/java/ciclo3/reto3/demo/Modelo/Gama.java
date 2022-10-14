/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciclo3.reto3.demo.Modelo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;
import java.util.Optional;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author lufel
 */
@Entity
@Table(name = "gama")
public class Gama {
 @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idGama;
    private String name;
    private String description;

    @ManyToMany(cascade = {CascadeType.PERSIST}, mappedBy = "gama")
    @JsonIgnoreProperties("gama")
    private Optional<List<Car>> cars;

    public Integer getIdGama() {
        return idGama;
    }

    public void setIdGama(Integer idGama) {
        this.idGama = idGama;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Optional<List<Car>> getCars() {
        return cars;
    }

    public void setCars(Optional<List<Car>> cars) {
        this.cars = cars;
    }


    

    
}
