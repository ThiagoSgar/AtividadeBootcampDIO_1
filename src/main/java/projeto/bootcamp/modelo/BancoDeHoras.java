package projeto.bootcamp.modelo;

import lombok.*;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor // cria os construtores de todos os atributos da Classe
@NoArgsConstructor  // cria o construtor sen atributo
@EqualsAndHashCode  // cria os construtores equals e HashCode
@Builder            // cria um objeto que esta sento referenciado
@Entity
public class BancoDeHoras {

    @AllArgsConstructor // cria os construtores de todos os atributos da Classe
    @NoArgsConstructor  // cria o construtor sen atributo
    @EqualsAndHashCode  // cria os construtores equals e HashCode

    @Embeddable
    public class BancoHoras implements Serializable {
        private long idBancoHoras;
        private long idMovimento;
        private long idUsuario;
    }
    @Id
    @EmbeddedId
    private BancoHoras id;
    private LocalDateTime dataTrabalhada;
    private BigDecimal quantidadeHoras;
    private BigDecimal saldoHoras;
}
