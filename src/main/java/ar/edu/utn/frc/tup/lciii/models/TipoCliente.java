package ar.edu.utn.frc.tup.lciii.models;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TipoCliente {
    private Long id_tipo_cliente;
    private String tipo_cliente;
}
