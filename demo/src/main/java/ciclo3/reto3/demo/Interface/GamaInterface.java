package ciclo3.reto3.demo.Interface;

import org.springframework.data.repository.CrudRepository;
import ciclo3.reto3.demo.Modelo.Gama;

public interface GamaInterface extends CrudRepository<Gama,Integer>{
    
    public Gama save(Gama gama);

    public void delete(Gama gama);
    
}
