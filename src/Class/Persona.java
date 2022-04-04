package Class;

import java.util.Optional;

public class Persona {

    private String Nombre;
    private String Poblacion;
    private Integer Edad;

    public Persona(String nombre, String poblacion, Integer edad) {
        Nombre = nombre;
        Poblacion = poblacion;
        Edad = edad;
    }

    public String getNombre() {
        Optional<String> nombre = Optional.ofNullable(this.Nombre);
        return nombre.isPresent() ? nombre.get() : "Desconocida";
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getPoblacion() {
        Optional <String> poblacion = Optional.ofNullable(this.Poblacion);
        return poblacion.isPresent() ? poblacion.get() : "Desconocida";
    }

    public void setPoblacion(String poblacion) {
        Poblacion = poblacion;
    }

    public Integer getEdad() {
        return Edad;
    }

    public void setEdad(Integer edad) {
        Edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "Nombre='" + Nombre + '\'' +
                ", Poblacion='" + Poblacion + '\'' +
                ", Edad=" + Edad +
                '}';
    }
}
