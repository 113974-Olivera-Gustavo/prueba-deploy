package ar.edu.utn.frc.tup.lciii.entities;

import ar.edu.utn.frc.tup.lciii.models.Cargo;
import ar.edu.utn.frc.tup.lciii.models.TipoDocumento;
import ar.edu.utn.frc.tup.lciii.models.Usuario;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigInteger;

@Entity
@Table(name = "Trabajadores")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TrabajadorEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String nombre;
    @Column
    private String apellido;
    @ManyToOne
    @JoinColumn(name = "id_tipo_documento")
    private TipoDocumentoEntity id_tipo_documento;
    @Column
    private BigInteger nro_documento;
    @Column
    private String email;
    @Column
    private BigInteger telefono;
    @ManyToOne
    @JoinColumn(name = "id_cargo")
    private CargosEntity cargo;
    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private UsuariosEntity usuario;
}
