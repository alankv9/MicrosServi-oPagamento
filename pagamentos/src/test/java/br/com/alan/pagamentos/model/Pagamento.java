package br.com.alan.pagamentos.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.*;
import org.hibernate.annotations.Generated;

import java.math.BigDecimal;

@Entity
@Table(name = "Pagamentos")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Pagamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NonNull
    @Positive
    private BigDecimal valor;
    @NotBlank
    @Size(max = 100)
    private String nome;
    @NotBlank
    @Size(max = 19)
    private String numero;
    @Size(max = 7)
    private String expiracao;
    @NotBlank
    @Size(min = 3,max = 3)
    private String codigo;
    @NonNull
    @Enumerated(EnumType.STRING)
    private Status status;
    @NonNull
    private Long pedidoId;
    @NonNull
    private Long formaDePagamentoId;


}
