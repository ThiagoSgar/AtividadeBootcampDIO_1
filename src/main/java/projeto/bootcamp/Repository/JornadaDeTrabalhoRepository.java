package projeto.bootcamp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import projeto.bootcamp.modelo.JornadaDeTrabalho;

@Repository
public interface JornadaDeTrabalhoRepository extends JpaRepository<JornadaDeTrabalho, Long> {
}

