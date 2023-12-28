package ar.edu.utn.frc.tup.lciii.repositories;

import ar.edu.utn.frc.tup.lciii.entities.TipoDocumentoEntity;
import ar.edu.utn.frc.tup.lciii.models.TipoDocumento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoDocumentoRepository extends JpaRepository<TipoDocumentoEntity, Long> {
}
