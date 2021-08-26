package entities.viajes;

import entities.Persona;
import entities.ubicaciones.Direccion;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
public class Viaje {
    private Direccion origen;
    private Direccion destino;
    private List<Persona> cuidadores;
    private Integer duracionEstimadaMins;
    private LocalDateTime fechaHoraInicio;
    private Boolean finalizado;
    private Persona transeunte;

    public Viaje() {
        this.cuidadores = new ArrayList<>();
    }
}
