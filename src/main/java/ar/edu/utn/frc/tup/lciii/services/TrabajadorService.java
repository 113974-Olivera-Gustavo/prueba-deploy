package ar.edu.utn.frc.tup.lciii.services;

import ar.edu.utn.frc.tup.lciii.models.Trabajador;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TrabajadorService {
    List<Trabajador> getAll();
}
