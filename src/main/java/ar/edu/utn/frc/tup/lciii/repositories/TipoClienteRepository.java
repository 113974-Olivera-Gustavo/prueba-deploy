package ar.edu.utn.frc.tup.lciii.repositories;

import ar.edu.utn.frc.tup.lciii.entities.TipoClienteEntity;
import ar.edu.utn.frc.tup.lciii.models.TipoCliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoClienteRepository extends JpaRepository<TipoClienteEntity, Long> {
}
