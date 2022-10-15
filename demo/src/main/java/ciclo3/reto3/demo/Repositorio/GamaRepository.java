package ciclo3.reto3.demo.Repositorio;

import ciclo3.reto3.demo.Interface.GamaInterface;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ciclo3.reto3.demo.Modelo.Gama;
import java.util.Optional;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lufel
 */

@Repository

public class GamaRepository {
 @Autowired
    private GamaInterface extencionesCrud;
    
    public List<Gama> getAll(){
        return (List<Gama>) extencionesCrud.findAll();
    }
    
    public Optional<Gama> getGama(int id){
        return extencionesCrud.findById(id);
    }
    
    public Gama save(Gama gama){
        return extencionesCrud.save(gama);
    }

    public void delete (Gama gama){
        extencionesCrud.delete(gama);
    }
    
    
    
}
