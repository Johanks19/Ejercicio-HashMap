public class Pokemon {
    private String nombre;
    private String elemento;

    public Pokemon(String nombre, String elemento) {
        this.nombre = nombre;
        this.elemento = elemento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getElemento() {
        return elemento;
    }

    public void setElemento(String elemento) {
        this.elemento = elemento;
    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "nombre='" + nombre + '\'' +
                ", elemento='" + elemento + '\'' +
                '}';
    }
}
