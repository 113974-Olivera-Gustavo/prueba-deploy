package ar.edu.utn.frc.tup.lciii.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Cargos")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CargosEntity {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String descripcion;
}
