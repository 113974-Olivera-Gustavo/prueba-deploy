package ar.edu.utn.frc.tup.lciii.repositories;

import ar.edu.utn.frc.tup.lciii.entities.TrabajadorEntity;
import ar.edu.utn.frc.tup.lciii.models.Trabajador;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrabajadorRepository extends JpaRepository<TrabajadorEntity, Long> {
}
