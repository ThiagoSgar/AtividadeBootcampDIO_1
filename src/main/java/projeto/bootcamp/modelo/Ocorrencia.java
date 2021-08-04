package projeto.bootcamp.modelo;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@AllArgsConstructor // cria os construtores de todos os atributos da Classe
@NoArgsConstructor  // cria o construtor sen atributo
@EqualsAndHashCode  // cria os construtores equals e HashCode
@Entity
public class Ocorrencia {
    @Id
    private long id;
    private String nomeOcorrencia;
    private String descricaoFormulaOcorrencia;
}
