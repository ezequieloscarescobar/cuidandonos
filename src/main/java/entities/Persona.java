package entities;

import converters.ReaccionIncidenteConverter;
import entities.reacciones.ReaccionIncidente;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Setter
@Getter
@Entity
@Table
public class Persona extends Persistente {
    @Column
    private String nombre;

    @Column
    private String apellido;

    @Enumerated(EnumType.STRING)
    private Sexo sexo;

    @Column
    private LocalDate fechaNacimiento;

    @Transient
    private Usuario usuario;

    @Convert(converter = ReaccionIncidenteConverter.class)
    private ReaccionIncidente reaccionIncidente;
}
