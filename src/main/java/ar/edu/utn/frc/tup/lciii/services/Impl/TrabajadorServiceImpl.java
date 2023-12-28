package ar.edu.utn.frc.tup.lciii.services.Impl;

import ar.edu.utn.frc.tup.lciii.models.Trabajador;
import ar.edu.utn.frc.tup.lciii.repositories.TrabajadorRepository;
import ar.edu.utn.frc.tup.lciii.services.TrabajadorService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;

import java.util.List;

@Service
public class TrabajadorServiceImpl implements TrabajadorService {
    private final TrabajadorRepository trabajadorRepository;
    private final ModelMapper modelMapper;
    @Autowired
    public TrabajadorServiceImpl(TrabajadorRepository trabajadorRepository, ModelMapper modelMapper){
        this.trabajadorRepository = trabajadorRepository;
    }

    @Override
    public List<Trabajador> getAll() {
        return null;
    }
}
