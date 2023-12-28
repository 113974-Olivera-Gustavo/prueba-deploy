package ar.edu.utn.frc.tup.lciii.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TP_Categoria_Fiscal {

    private Long id_monotributo;
    private String clasificacion;
    private String categorizacion;
}
