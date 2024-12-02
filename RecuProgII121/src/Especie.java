public class Especie {
    private String nombreCientifico;

    public Especie(String nombreCientifico) {
        this.nombreCientifico = nombreCientifico;
    }

    @Override
    public String toString() {
        return nombreCientifico;
    }
}
