package com.company.service_template.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.context.annotation.Configuration;




@OpenAPIDefinition(
    info = @Info(
        title = " Banregio - Microservicio Base",
        version = "1.0.0",
        description = """
  
        Documentación oficial del microservicio base para Banregio.  
        Esta API forma parte del ecosistema modular de servicios desarrollados por Grupo TI.

        **Apis creadas por desarrollador..y descripción :**
        - ✅ API 1 ASIGNADO A Juan Velasco......
        - ✅ API 2 ASIGNADO A Juan Francisco......
        - ✅ API 3 ASIGNADO A ......
        - Construido con Spring Boot y OpenAPI para una integración fluida.
        """,
        contact = @Contact(
          name = "Equpo de Desarrollo Backend  - Grupo TI",
            email = "juan.velasco@grupoti.com"
          
        ),
        license = @License(
            name = "Propietario - Grupo TI"
           
        )
    ),
    servers = {
        @Server(url = "http://localhost:8080/api", description = "Servidor de desarrollo Banregio"),
        @Server(url = "https://api.banregio.com", description = "Servidor de producción Banregio"),
        @Server(url = "https://api.banregio.com", description = "Servidor de test Banregio")
    }
)
@Configuration
public class SwaggerConfig {
}


/* ... 
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;

@Tag(name = "Clientes", description = "Operaciones relacionadas con clientes Banregio")
@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Operation(
        summary = "Obtener cliente por ID",
        description = "Devuelve los datos del cliente según su identificador único"
    )
    @ApiResponse(responseCode = "200", description = "Cliente encontrado")
    @ApiResponse(responseCode = "404", description = "Cliente no existe")
    @GetMapping("/{id}")
    public ResponseEntity<Cliente> getCliente(@PathVariable Long id) {
        // lógica aquí
    }
}
*/