package ciclo3.reto3.demo.Interface;

import org.springframework.data.repository.CrudRepository;
import ciclo3.reto3.demo.Modelo.Message;

public interface MessageInterface extends CrudRepository<Message, Integer> {

    public Message save(Message message);

    public void delete(Message message);
    
    
}