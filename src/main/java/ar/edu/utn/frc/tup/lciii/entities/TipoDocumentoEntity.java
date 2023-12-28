package ar.edu.utn.frc.tup.lciii.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "TipoDocumento")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TipoDocumentoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_tipo_doc;
    @Column
    private String tipo_documento;
}
