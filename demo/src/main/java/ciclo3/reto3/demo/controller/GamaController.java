/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciclo3.reto3.demo.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ciclo3.reto3.demo.Servicio.GamaService;
import java.util.List;
import ciclo3.reto3.demo.Modelo.Gama;
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
@RequestMapping("/api/Gama")
public class GamaController {
         @Autowired
    private GamaService gamaService;
    
    @GetMapping("/all")
    public List<Gama> getAll(){
        return gamaService.getAll();
    }
    
    @GetMapping("/{id}")
    public Optional<Gama> getGama(@PathVariable("id") int id){
        return gamaService.getGama(id);
    } 
    
    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Gama save (@RequestBody Gama gama){
        return gamaService.save(gama);
    }

    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public Gama update(@RequestBody Gama gama){
        return gamaService.update(gama);
    }
    
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean delete(@PathVariable("id")int id){
    return gamaService.deleteGama(id);
}

}

