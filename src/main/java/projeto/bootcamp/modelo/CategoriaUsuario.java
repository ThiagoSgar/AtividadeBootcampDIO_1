package projeto.bootcamp.modelo;

import lombok.*;
import org.hibernate.envers.Audited;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@AllArgsConstructor // cria os construtores de todos os atributos da Classe
@NoArgsConstructor  // cria o construtor sen atributo
@EqualsAndHashCode  // cria os construtores equals e HashCode
@Entity
@Audited
public class CategoriaUsuario {
    @Id
    private long id;
    private String descricao;
}
