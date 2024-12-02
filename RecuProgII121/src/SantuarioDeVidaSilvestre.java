import java.time.LocalDate;
import java.util.*;

public class SantuarioDeVidaSilvestre extends AreaProtegida implements DetallesEspecificos{
    private List<String> especiesProtegidas;

    public SantuarioDeVidaSilvestre(String nombre, double superficie, LocalDate fechaDeEstablecimiento, List<String> especies) {
        super(nombre, superficie, fechaDeEstablecimiento);
        this.especiesProtegidas = especies;
    }

    @Override
    public String detallesEspecificos() {
        return "Especies Protegidas: " + especiesProtegidas;
    }
    
}
