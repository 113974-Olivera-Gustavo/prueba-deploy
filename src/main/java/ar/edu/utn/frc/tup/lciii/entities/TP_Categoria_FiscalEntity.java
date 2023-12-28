package ar.edu.utn.frc.tup.lciii.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "TP_Categoria_Fiscal")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TP_Categoria_FiscalEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_categoria_fiscal;
    @Column
    private String clasificacion;
    @Column
    private String categorizacion;
}
