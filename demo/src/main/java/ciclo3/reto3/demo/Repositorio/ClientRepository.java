package ciclo3.reto3.demo.Repositorio;

import ciclo3.reto3.demo.Interface.ClientInterface;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ciclo3.reto3.demo.Modelo.Client;


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

public class ClientRepository {
  @Autowired
    private ClientInterface clientCrudRepository;
    
    public List<Client> getAll(){
        return (List<Client>) clientCrudRepository.findAll();
    }
    
    public Optional<Client> getClient(int id){
        return clientCrudRepository.findById(id);
    }
    
    public Client save(Client client){
        return clientCrudRepository.save(client);
    }
    
    public void delete(Client c){
        clientCrudRepository.delete(c);
    }

}
