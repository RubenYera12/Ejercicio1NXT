import Class.Persona;
import java.io.File;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

import static java.lang.Integer.valueOf;

public class Main {
  public static void main(String[] args) throws Exception {
    File f = new File("C:\\Users\\rubenmaria.yera\\IdeaProjects\\Ejercicio1NXT\\target\\Datos.txt");
    List<Persona> listaPersonas = new ArrayList<Persona>();
    Scanner obj = new Scanner(f);

    while (obj.hasNextLine()) {
      String linea = obj.nextLine();
      String[] partes = linea.split(":");
      String nombre = partes[0];

      String ciudad = partes[1];

      Integer edad = null;
      if (partes.length > 2) {
        edad = valueOf(partes[2]);
      }

      Persona p = new Persona(nombre, ciudad, edad);
      listaPersonas.add(p);
    }
    AtomicInteger cont= new AtomicInteger();
    listaPersonas.stream()
        .filter(p -> p.getEdad().orElse(25) < 25)
        .forEach(
                System.out::println
                );
  }
}
