package ar.edu.utn.frc.tup.lciii.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Usuarios")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UsuariosEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String nombre_usuario;
    @Column
    private String password;
    @Column
    private String email;
}
