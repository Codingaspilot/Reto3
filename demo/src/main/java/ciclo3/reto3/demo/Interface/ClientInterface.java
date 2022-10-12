package ciclo3.reto3.demo.Interface;

import ciclo3.reto3.demo.Modelo.Client;
import org.springframework.data.repository.CrudRepository;


public interface ClientInterface extends CrudRepository<Client, Integer>{


    public Client save(Client client);

    public void delete(Client client);
    
}