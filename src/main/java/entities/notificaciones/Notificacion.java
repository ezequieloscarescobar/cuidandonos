package entities.notificaciones;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Notificacion {
    private String emisor;
    private String receptor;
    private String mensaje;
}
