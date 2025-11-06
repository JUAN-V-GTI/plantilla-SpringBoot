#  Banregio – Plantilla Base para Microservicios Backend

> Proyecto desarrollado por Grupo TI para estandarizar la arquitectura de microservicios en Banregio.  
> Esta plantilla está diseñada para ser modular, escalable y alineada con las mejores prácticas corporativas.

📋 Tabla de Contenido

Propósito
Estructura de Carpetas
Convenciones de Nombres
Documentación Swagger
Endpoints RESTful
Pruebas Unitarias
Seguridad JWT
Entornos
Recomendaciones Finales


🎯 Propósito
Esta plantilla sirve como base para el desarrollo de microservicios backend en Banregio, siguiendo los estándares corporativos de arquitectura, nombrado, documentación y pruebas. Está diseñada para ser escalable, modular y fácil de mantener.

📁 Estructura de Carpetas

src/
└── main/
    ├── java/
    │   └── com/
    │       └── banregio/
    │           └── next/
    │               └── certificaciones/
    │                   ├── app/
    │                   │   ├── configuration/
    │                   │   ├── domain/
    │                   │   │   ├── entity/
    │                   │   │   └── repository/
    │                   │   ├── facade/
    │                   │   ├── service/
    │                   │   └── util/
    │                   └── web/
    │                       ├── controller/
    │                       └── model/
    └── resources/
        ├── application.properties
        ├── application-dev.properties
        ├── application-prod.properties
        ├── application-test.properties
        ├── banner.txt
        └── logback-spring.xml

📝 Convenciones de Nombres
<details>
<summary><strong>📌 Proyecto</strong></summary>
Evitar marcas:

❌ banregio
❌ api
❌ backend
❌ core

Usar nombres funcionales:

✅ certificaciones
✅ notificacion-lib
✅ nomina-orq
✅ sibamex-soporte

</details>
<details>
<summary><strong>📌 Clases</strong></summary>
Entidades y modelos: singular

Cliente
CuentaDto

Capas: plural + tipo

ClientesController
CuentasService
ClientesFacade

DTOs y modelos web: singular + sufijo

ClienteDto
PersonaModel

</details>

📘 Documentación Swagger
<details>
<summary><strong>✅ Anotaciones en controladores</strong></summary>
```java
@Tag(name = "Clientes", description = "Operaciones relacionadas con clientes Banregio")
@Operation(summary = "Obtener cliente por ID", description = "Devuelve los datos del cliente según su identificador único")
@ApiResponses({
    @ApiResponse(responseCode = "200", description = "Cliente encontrado"),
    @ApiResponse(responseCode = "404", description = "Cliente no existe")
})
```
</details>
<details>
<summary><strong>✅ Anotaciones en modelos</strong></summary>
```java
@ApiModel(description = "Modelo de datos del cliente")
public class ClienteDto {
    @ApiModelProperty(value = "Nombre del cliente", required = true, example = "Juan Pérez")
    private String nombre;
}
```
</details>

🌐 Endpoints RESTful
<details>
<summary><strong>📌 Buenas prácticas</strong></summary>
Usar sustantivos en plural:

✅ /clientes
✅ /cuentas

Evitar verbos en la URL:

❌ /borrarCliente
✅ DELETE /clientes/{id}

Usar spinal-case para múltiples palabras:

✅ /tipos-credito

Versionar si hay cambios estructurales:

✅ /v1/clientes
✅ /v2/clientes

</details>

🧪 Pruebas Unitarias
<details>
<summary><strong>📌 Recomendaciones</strong></summary>

Ubicar en src/test/java
El paquete debe coincidir con el de la clase a probar
Nombre de clase: ClaseServiceTest
Usar anotaciones:

@Test
@BeforeEach
@Mock
@InjectMocks


Validar métodos con lógica de negocio (Service)

</details>

🔐 Seguridad JWT
<details>
<summary><strong>📌 Integración recomendada</strong></summary>

Crear clase JwtConfig en configuration
Usar filtros para validar tokens en cada request
Documentar en Swagger los headers requeridos

</details>

🌍 Entornos
<details>
<summary><strong>📌 Configuración por entorno</strong></summary>

application-dev.properties → desarrollo local
application-prod.properties → producción
application-test.properties → pruebas automatizadas

Evita sobrescribir propiedades manualmente entre entornos
</details>

✅ Recomendaciones Finales

Usa @Configuration para centralizar ajustes
Evita lógica en Controller y Facade
Documenta todos los endpoints con Swagger
Aplica pruebas unitarias en Service
Mantén consistencia en nombres y estructura


📞 Contacto
Para dudas o soporte, contacta al equipo de Grupo TI de Banregio.

Desarrollado con ❤️ por Grupo TI - Banregio