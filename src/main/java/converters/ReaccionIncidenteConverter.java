package converters;

import entities.reacciones.ReaccionIncidente;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter(autoApply = true)
public class ReaccionIncidenteConverter implements AttributeConverter<ReaccionIncidente, String> {

    @Override
    public String convertToDatabaseColumn(ReaccionIncidente reaccionIncidente) {
        return reaccionIncidente.getClass().getName();
    }

    @Override
    public ReaccionIncidente convertToEntityAttribute(String s) {
        ReaccionIncidente reaccion = null;
        try {
            Class c = Class.forName(s);
            reaccion = (ReaccionIncidente) c.newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return reaccion;
    }
}
