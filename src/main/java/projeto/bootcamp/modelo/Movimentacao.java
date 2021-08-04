package projeto.bootcamp.modelo;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor // cria os construtores de todos os atributos da Classe
@NoArgsConstructor  // cria o construtor sen atributo
@EqualsAndHashCode  // cria os construtores equals e HashCode
@Builder            // cria um objeto que esta sento referenciado
@Entity
public class Movimentacao {

    @AllArgsConstructor // cria os construtores de todos os atributos da Classe
    @NoArgsConstructor  // cria o construtor sen atributo
    @EqualsAndHashCode  // cria os construtores equals e HashCode

    @Embeddable
    public class MovimentacaoId implements Serializable {
        private long idMovimento;
        private long idUsuario;
    }
    @Id
    @EmbeddedId //sabe que este id puxa referencia
    private MovimentacaoId id;
    @ManyToOne
    private Usuario usuario;
    private LocalDateTime entrada;
    private LocalDateTime saida;
    private String descricao;
    private BigDecimal periodoPermanencia;
    @ManyToOne
    private Ocorrencia ocorrencia;
    @ManyToOne
    private Calendario calendario;
}
