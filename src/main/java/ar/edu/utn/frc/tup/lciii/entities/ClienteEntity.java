package ar.edu.utn.frc.tup.lciii.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigInteger;

@Entity
@Table(name = "Clientes")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClienteEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String nombre;
    @Column
    private String apellido;
    @ManyToOne
    @JoinColumn(name = "id_tipo_doc")
    private TipoDocumentoEntity id_tipo_doc;
    @Column
    private BigInteger nro_doc;
    @Column
    private String email;
    @Column
    private String telefono;
    @ManyToOne
    @JoinColumn(name = "id_tipo_cliente")
    private TipoClienteEntity id_tipo_cliente;
    @ManyToOne
    @JoinColumn(name = "id_tipoCategoriaFiscal")
    private TP_Categoria_FiscalEntity id_categoria_fiscal;
    @Column
    private Integer cant_puntos;

}
