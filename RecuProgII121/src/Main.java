import java.util.*;
import java.time.LocalDate;
public class Main {
    public static void main(String[] args) {
        SistemaGestionParques sistema = new SistemaGestionParques();

        try {
            ParqueNacional monteVerde = new ParqueNacional("Monte Verde", 500.0, LocalDate.of(2022, 5, 20), Arrays.asList(ActividadesTuristicas.CAMPING, ActividadesTuristicas.SENDERISMO));
            ReservaNatural amazonas = new ReservaNatural("Amazonas", 1000.0, LocalDate.of(2023, 6, 15), NivelDeProteccion.MEDIO);
            SantuarioDeVidaSilvestre galapagos = new SantuarioDeVidaSilvestre("Galapagos", 200.0, LocalDate.of(2024, 7, 10), Arrays.asList("Tortuga Gigante", "Pinguino de Galapagos"));
    
            sistema.agregarArea(monteVerde);
            sistema.agregarArea(amazonas);
            sistema.agregarArea(galapagos);

            sistema.mostrarAreas();

            sistema.realizarActividad("Monte Verde");
            sistema.realizarActividad("Amazonas");  
            sistema.realizarActividad("Galapagos");   

        } catch (Exception e) 
        {
            System.out.println(e.getMessage());
        }
    }
}
