import java.time.LocalDate;
import java.util.*;

class SistemaGestionParques {
    private List<AreaProtegida> areas;

    public SistemaGestionParques() {
        this.areas = new ArrayList<>();
    }

    public void agregarArea(AreaProtegida area) throws Exception {
        for (AreaProtegida existente : areas) {
            if (existente.getNombre().equals(area.getNombre()) &&
                existente.getFechaEstablecimiento().equals(area.getFechaEstablecimiento())) 
            {
                throw new AreaYaExisteException("El area protegida ya existe.");
            }
        }
        areas.add(area);
    }

    public void mostrarAreas() {
    for (AreaProtegida area : areas) {
        System.out.println("Nombre: " + area.nombre);
        System.out.println("Superficie: " + area.superficie + " hectareas");
        System.out.println("Fecha de establecimiento: " + area.fechaDeEstablecimiento);

        if (area instanceof DetallesEspecificos) {
            System.out.println(((DetallesEspecificos) area).detallesEspecificos());
        }
    }
}
    
    public void realizarActividad(String nombreArea) {
        for (AreaProtegida area : areas) {
            if (area.getNombre().equals(nombreArea)) {
                if (area instanceof ParqueNacional) {
                    System.out.println("Se permite realizar actividades turisticas en el parque nacional: " + nombreArea);
                } else {
                    System.out.println("No se pueden realizar actividades turisticas en el area: " + nombreArea);
                }
                return;
            }
        }
        System.out.println("Área protegida no encontrada.");
    }

}
