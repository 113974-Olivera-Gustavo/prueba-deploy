package ar.edu.utn.frc.tup.lciii.controllers;

import ar.edu.utn.frc.tup.lciii.models.Cliente;
import ar.edu.utn.frc.tup.lciii.services.ClienteService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
    private final ClienteService clienteService;

    @Autowired
    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }
    @GetMapping("/getAll")
    @Operation(summary = "Obtiene todas las personas", description = "Obtiene una lista de todas las personas.")
    @ApiResponse(responseCode = "200", description = "Operación exitosa", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Cliente.class)))
    public ResponseEntity<List<Cliente>> getAllPersonas() {
        return ResponseEntity.ok(clienteService.getAll());
    }

    @PostMapping("/postCliente")
    @Operation(summary = "Crear una persona", description = "Crea una nueva persona.")
    @ApiResponse(responseCode = "200", description = "Operación exitosa", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Cliente.class)))
    public ResponseEntity<Cliente> createPersona(@RequestBody Cliente cliente) {
        Cliente createdCliente = clienteService.crearPersona(cliente);
        return ResponseEntity.ok(createdCliente);
    }

    @DeleteMapping("/deleteCliente/{id}")
    @Operation(summary = "Eliminar una persona", description = "Elimina una persona por su ID.")
    @ApiResponse(responseCode = "200", description = "Operación exitosa", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Cliente.class)))
    public ResponseEntity<Cliente> eliminarPersona(@PathVariable Long id) {
        Cliente deleteCliente = clienteService.eliminarPersona(id);
        return ResponseEntity.ok(deleteCliente);
    }

    @PutMapping("/updateCliente")
    @Operation(summary = "Actualizar una persona", description = "Actualiza una persona existente.")
    @ApiResponse(responseCode = "200", description = "Operación exitosa", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Cliente.class)))
    public ResponseEntity<Cliente> updatePersona(@RequestBody Cliente cliente) {
        Cliente updateCliente = clienteService.actualizarPersona(cliente);
        return ResponseEntity.ok(updateCliente);
    }
}
