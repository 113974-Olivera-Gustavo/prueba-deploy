package ar.edu.utn.frc.tup.lciii.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "TipoCliente")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TipoClienteEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_tipo_cliente;
    @Column
    private String tipo_cliente;
}
