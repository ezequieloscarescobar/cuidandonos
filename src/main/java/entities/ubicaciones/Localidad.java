package entities.ubicaciones;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Localidad {
    private String nombre;
    private Partido partido;
}
