import Class.Persona;
import java.io.File;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.lang.Integer.valueOf;
import static java.util.stream.Collectors.toList;

public class Main {
  public static void main(String[] args) throws Exception {
    File f = new File("C:\\Users\\rubenmaria.yera\\IdeaProjects\\Ejercicio1NXT\\src\\Datos.txt");
    List<Persona> listaPersonas = new ArrayList<Persona>();
    Scanner obj = new Scanner(f);

    while (obj.hasNextLine()) {
      String linea = obj.nextLine();
      String[] partes = linea.split(":");
      String nombre = null;
      if (partes[0] != "") {
        nombre = partes[0];
      }

      String ciudad = null;
      if (partes[1] != "") {
        ciudad = partes[1];
      }

      Integer edad = null;
      if (partes.length>2) {
        edad = valueOf(partes[2]);
      }

      Persona p = new Persona(nombre, ciudad, edad);
      listaPersonas.add(p);
    }

    Stream<Persona> listaFiltrada = listaPersonas.stream()
            .filter(
                    p -> {
                      try{
                        return p.getEdad() < 25;
                      }catch (Exception e){
                        return false;
                      }

                    });
    listaFiltrada.forEach(p -> System.out.println(
            "Nombre: "+p.getNombre()+
            " Poblacion: "+p.getPoblacion()+
            " Edad: "+p.getEdad()));

  }

}
