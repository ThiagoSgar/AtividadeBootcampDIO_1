package projeto.bootcamp.modelo;

import lombok.*;
import org.hibernate.envers.Audited;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor // cria os construtores de todos os atributos da Classe
@NoArgsConstructor  // cria o construtor sen atributo
@EqualsAndHashCode  // cria os construtores equals e HashCode
@Builder            // cria um objeto que esta sento referenciado
@Entity
@Audited
public class Usuario {
    @Id
    private long id;
    @ManyToOne
    private CategoriaUsuario categoriaUsuario;
    private String nomeUsuario;
    @ManyToOne
    private Empresa empresa;
    @ManyToOne
    private NivelAcesso nivelAcesso;
    @ManyToOne
    private JornadaDeTrabalho jornadaDeTrabalho;
    private BigDecimal tolerancia;
    private LocalDateTime jornadaInicio;
    private LocalDateTime jornadaFim;

}
