package projeto.bootcamp.modelo;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor // cria os construtores de todos os atributos da Classe
@NoArgsConstructor  // cria o construtor sen atributo
@EqualsAndHashCode  // cria os construtores equals e HashCode
@Builder            // cria um objeto que esta sento referenciado
@Entity
public class Calendario {
    @Id
    private long id;
    @ManyToOne
    private TipoData tipoData;
    private String descricaoDataEspecial;
    private LocalDateTime dataEspecial;
}
