package projeto.bootcamp.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PutMapping;
import projeto.bootcamp.modelo.JornadaDeTrabalho;
import projeto.bootcamp.Repository.JornadaDeTrabalhoRepository;

import java.util.List;
import java.util.Optional;
@Service
public class JornadaDeTrabalhoService {
    JornadaDeTrabalhoRepository jornadaDeTrabalhoRepository;

    @Autowired(required = true)
    public JornadaDeTrabalhoService(JornadaDeTrabalhoRepository jornadaDeTrabalhoRepository){
        this.jornadaDeTrabalhoRepository = jornadaDeTrabalhoRepository;
    }

    public JornadaDeTrabalho saveJornada(JornadaDeTrabalho jornadaDeTrabalho){
        return jornadaDeTrabalhoRepository.save(jornadaDeTrabalho);
    }

    public List<JornadaDeTrabalho> findAll() {
        return jornadaDeTrabalhoRepository.findAll();
    }

    public Optional<JornadaDeTrabalho> getById(Long idJornada) {
        return jornadaDeTrabalhoRepository.findById(idJornada);
    }

    public JornadaDeTrabalho updateJornada(JornadaDeTrabalho jornadaDeTrabalho){
        return jornadaDeTrabalhoRepository.save(jornadaDeTrabalho);
    }

    public void delete(Long idJornada) {
        jornadaDeTrabalhoRepository.deleteById(idJornada);
    }
}
