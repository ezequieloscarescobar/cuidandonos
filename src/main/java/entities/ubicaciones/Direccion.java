package entities.ubicaciones;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Direccion {
    private String calle;
    private Localidad localidad;
    private Integer nro;
}
