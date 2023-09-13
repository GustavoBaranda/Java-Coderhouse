import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Persona> personas = new ArrayList<>();

        // Creo 5 objetos Persona con nombres y apellidos 
        personas.add(new Persona("Gustavo", "Baranda"));
        personas.add(new Persona("Juan", "López"));
        personas.add(new Persona("Roberto", "Martínez"));
        personas.add(new Persona("Ana", "Rodríguez"));
        personas.add(new Persona("Luis", "Sánchez"));

        // Ordeno la lista por nombre.
        Collections.sort(personas, Comparator.comparing(Persona::getNombre));
        System.out.println("Ordenado por nombre:");
        for (Persona persona : personas) {
            System.out.println(persona.getNombre() + " " + persona.getApellido());
        }

        // Ordeno la lista por apellido.
        Collections.sort(personas, Comparator.comparing(Persona::getApellido));
        System.out.println("\nOrdenado por apellido:");
        for (Persona persona : personas) {
            System.out.println(persona.getApellido() + ", " + persona.getNombre());
        }

        // Ordeno la lista inversamente por apellido.
        Collections.sort(personas, Comparator.comparing(Persona::getApellido).reversed());
        System.out.println("\nOrdenado inversamente por apellido:");
        for (Persona persona : personas) {
            System.out.println(persona.getApellido() + ", " + persona.getNombre());
        }
    }
}
