package ar.edu.utn.frc.tup.lciii.services;

import ar.edu.utn.frc.tup.lciii.models.Cliente;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ClienteService {
    List<Cliente> getAll();
    Cliente crearPersona(Cliente cliente);
    Cliente eliminarPersona(Long id);
    Cliente actualizarPersona(Cliente cliente);
}
