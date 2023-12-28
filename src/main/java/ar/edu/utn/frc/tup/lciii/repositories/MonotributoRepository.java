package ar.edu.utn.frc.tup.lciii.repositories;

import ar.edu.utn.frc.tup.lciii.entities.TP_Categoria_FiscalEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MonotributoRepository extends JpaRepository<TP_Categoria_FiscalEntity, Long> {
}
