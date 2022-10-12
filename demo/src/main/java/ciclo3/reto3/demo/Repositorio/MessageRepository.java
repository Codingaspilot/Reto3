/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciclo3.reto3.demo.Repositorio;

import ciclo3.reto3.demo.Interface.MessageInterface;
import org.springframework.stereotype.Repository;
import ciclo3.reto3.demo.Modelo.Message;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
/**
 *
 * @author lufel
 */
@Repository

public class MessageRepository {
  @Autowired
    private MessageInterface extencionesCrud;
    
    public List<Message> getAll(){
        return (List<Message>) extencionesCrud.findAll();
    }
    
    public Optional<Message> getMessage(int id){
        return extencionesCrud.findById(id);
    }
    
    public Message save(Message message){
        return extencionesCrud.save(message);
    }
}
