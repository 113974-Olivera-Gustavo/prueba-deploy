package ar.edu.utn.frc.tup.lciii.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigInteger;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Trabajador {
    private Long id;
    private String nombre;
    private String apellido;
    private TipoDocumento tipo_documento;
    private BigInteger nro_documento;
    private String email;
    private BigInteger telefono;
    private Cargo cargo;
    private Usuario usuario;
}
