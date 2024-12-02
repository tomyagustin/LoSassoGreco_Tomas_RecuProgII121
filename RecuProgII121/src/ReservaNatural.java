import java.time.LocalDate;

public class ReservaNatural extends AreaProtegida implements DetallesEspecificos{
    private NivelDeProteccion nivelDeProteccion;

    public ReservaNatural(String nombre, double superficie, LocalDate fechaDeEstablecimiento, NivelDeProteccion nivel) {
        super(nombre, superficie, fechaDeEstablecimiento);
        this.nivelDeProteccion = nivel;
    }

    @Override
    public String detallesEspecificos() {
        return "Nivel de Proteccion: " + nivelDeProteccion;
    }
    
    
}
