package entities.notificaciones;

import lombok.Setter;

@Setter
public class Notificador {
    private EstrategiaDeNotificacion estrategiaDeNotificacion;

    public void notificar(Notificacion notificacion) {
        this.estrategiaDeNotificacion.notificar(notificacion);
    }
}
