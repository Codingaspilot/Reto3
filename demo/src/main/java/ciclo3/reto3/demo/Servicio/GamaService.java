package ciclo3.reto3.demo.Servicio;

import ciclo3.reto3.demo.Repositorio.GamaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ciclo3.reto3.demo.Modelo.Gama;
import java.util.Optional;

@Service

public class GamaService {
 @Autowired
    private GamaRepository gamaRepository;
    
    public List<Gama> getAll(){
        return gamaRepository.getAll();
    }
    
    public Optional<Gama> getGama(int id){
        return gamaRepository.getGama(id);
    }
    
    public Gama save (Gama gama){
        if (gama.getIdGama() == null){
            return gamaRepository.save(gama);
        } else {
            Optional<Gama> gama1 = gamaRepository.getGama(gama.getIdGama());
            if(gama1.isEmpty()){
                return gamaRepository.save(gama);
            } else {
                return gama;
            }
        }
    }
}
