package ar.edu.utn.frc.tup.lciii.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigInteger;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cliente {
    private Long id;
    private String nombre;
    private String apellido;
    private String email;
    private String telefono;
    private TipoDocumento id_tipo_doc;
    private BigInteger nro_doc;
    private TP_Categoria_Fiscal id_categoria_fiscal;
    private TipoCliente id_tipo_cliente;
    private Integer cant_puntos;


}
