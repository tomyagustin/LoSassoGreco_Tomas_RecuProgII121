import java.time.LocalDate;
import java.util.Objects;

public abstract class AreaProtegida {
    protected String nombre;
    protected double superficie;
    protected LocalDate fechaDeEstablecimiento;
    
    public AreaProtegida(String nombre, double superficie, LocalDate fechaDeEstablecimiento)
    {
        this.nombre = nombre;
        this.superficie = superficie;
        this.fechaDeEstablecimiento = fechaDeEstablecimiento;
    }
    
    public String getNombre()
    {
        return nombre;
    }
    
    public LocalDate getFechaEstablecimiento()
    {
        return fechaDeEstablecimiento;
    }

    @Override
    public boolean equals(Object obj)
    {
        if(this == obj)
        {
            return true;
        }
        if(obj == null || getClass() != obj.getClass())
        {
            return false;
        }
        AreaProtegida a = (AreaProtegida)obj;

        return nombre.equals(a.nombre) && superficie == a.superficie;
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(nombre, superficie);
    }
}