import java.util.*;
import java.time.LocalDate;

public class ParqueNacional extends AreaProtegida implements DetallesEspecificos{
    private List<ActividadesTuristicas> actividadesTuristicas;
    
    
    public ParqueNacional(String nombre, double superficie, LocalDate fechaDeEstablecimiento, List<ActividadesTuristicas> actividades) {
        super(nombre, superficie, fechaDeEstablecimiento);
        this.actividadesTuristicas = actividades;
    }

    @Override
    public String detallesEspecificos()
    {
        return "Actividades Turisticas permitidas: " + actividadesTuristicas;
    }
}
