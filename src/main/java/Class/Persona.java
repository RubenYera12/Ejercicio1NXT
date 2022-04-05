package Class;

import java.util.Optional;

public class Persona {

  private String nombre;
  private String poblacion;
  private Integer edad;

  public Persona(String nombre, String poblacion, Integer edad) {
    this.nombre = nombre;
    this.poblacion = poblacion;
    this.edad = edad;
  }

  public String getNombre() {
    return (nombre != null) ? this.nombre : "Desconocido";
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getPoblacion() {
    return (poblacion != null) ? this.poblacion : "Desconocido";
  }

  public void setPoblacion(String poblacion) {
    this.poblacion = poblacion;
  }

  public Optional<Integer> getEdad() {
    return Optional.ofNullable(this.edad);
  }

  public void setEdad(Integer edad) {
    this.edad = edad;
  }

  @Override
  public  String toString(){
    return "Casa: "+nombre;
  }
  public String toString(Integer numeroLinea) {
    // Línea 1. Nombre: Andres. Población: Madrid. Edad: 19
    return "Linea"
        + numeroLinea
        + " Nombre:"
        + nombre
        + ". Poblacion:"
        + poblacion
        + ". Edad:"
        + edad;
  }
}
