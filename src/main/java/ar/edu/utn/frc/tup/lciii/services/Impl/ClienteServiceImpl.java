package ar.edu.utn.frc.tup.lciii.services.Impl;

import ar.edu.utn.frc.tup.lciii.entities.ClienteEntity;
import ar.edu.utn.frc.tup.lciii.entities.TP_Categoria_FiscalEntity;
import ar.edu.utn.frc.tup.lciii.entities.TipoClienteEntity;
import ar.edu.utn.frc.tup.lciii.entities.TipoDocumentoEntity;
import ar.edu.utn.frc.tup.lciii.models.Cliente;
import ar.edu.utn.frc.tup.lciii.repositories.ClienteRepository;
import ar.edu.utn.frc.tup.lciii.services.ClienteService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ClienteServiceImpl implements ClienteService {
    private final ClienteRepository clienteRepository;

    private final ModelMapper modelMapper;

    @Autowired
    public ClienteServiceImpl(ClienteRepository clienteRepository, ModelMapper modelMapper) {
        this.clienteRepository = clienteRepository;
        this.modelMapper = modelMapper;
    }
    @Override
    public List<Cliente> getAll() {
        List<ClienteEntity> personas = clienteRepository.findAll();
        return personas.stream()
                .map(clienteEntity -> modelMapper.map(clienteEntity, Cliente.class))
                .collect(java.util.stream.Collectors.toList());
    }

    @Override
    public Cliente crearPersona(Cliente cliente) {
        ClienteEntity clienteEntity = modelMapper.map(cliente, ClienteEntity.class);
        ClienteEntity savedPersona = clienteRepository.save(clienteEntity);
        return modelMapper.map(savedPersona, Cliente.class);
    }

    @Override
    public Cliente eliminarPersona(Long id) {
        Optional <ClienteEntity> personaEntityOptional = clienteRepository.findById(id);

        if(personaEntityOptional.isPresent()){
            ClienteEntity clienteEntity = personaEntityOptional.get();
            clienteRepository.delete(clienteEntity);
            return modelMapper.map(clienteEntity, Cliente.class);
        }
        else {
            throw new IllegalArgumentException("No existe la persona");
        }
    }
    @Override
    public Cliente actualizarPersona(Cliente cliente) {
       Optional<ClienteEntity> personaEntityOptional = clienteRepository.findById(cliente.getId());

       if(personaEntityOptional.isPresent()){

           ClienteEntity clienteEntity = personaEntityOptional.get();
              clienteEntity.setNombre(cliente.getNombre());
              clienteEntity.setApellido(cliente.getApellido());
              clienteEntity.setEmail(cliente.getEmail());
              clienteEntity.setTelefono(cliente.getTelefono());
              TipoClienteEntity tipoClienteEntity = modelMapper.map(cliente.getId_tipo_cliente(), TipoClienteEntity.class);
              clienteEntity.setId_tipo_cliente(tipoClienteEntity);
              TipoDocumentoEntity tipoDocumentoEntity = modelMapper.map(cliente.getId_tipo_doc(), TipoDocumentoEntity.class);
              clienteEntity.setId_tipo_doc(tipoDocumentoEntity);
              clienteEntity.setNro_doc(cliente.getNro_doc());
              TP_Categoria_FiscalEntity categoriaFiscalEntity = modelMapper.map(cliente.getId_categoria_fiscal(), TP_Categoria_FiscalEntity.class);
              clienteEntity.setId_categoria_fiscal(categoriaFiscalEntity);
              clienteEntity.setCant_puntos(cliente.getCant_puntos());
              ClienteEntity updateClienteEntity = clienteRepository.save(clienteEntity);
              return modelMapper.map(updateClienteEntity, Cliente.class);
       }
         else {
              throw new IllegalArgumentException("No existe la persona");
         }
    }

}
