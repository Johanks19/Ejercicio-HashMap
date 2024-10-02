// Johan Sneyder Blanco Sanchez
// id: 936056
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Crear un HashMap para almacenar los pokemones disponibles para adopción
        HashMap<Integer, Pokemon> pokemonesDisponibles = new HashMap<>();
        pokemonesDisponibles.put(1, new Pokemon("Pikachu", "Eléctrico"));
        pokemonesDisponibles.put(2, new Pokemon("Charmander", "Fuego"));
        pokemonesDisponibles.put(3, new Pokemon("Bulbasaur", "Planta"));
        pokemonesDisponibles.put(4, new Pokemon("Squirtle", "Agua"));
        pokemonesDisponibles.put(5, new Pokemon("Eevee", "Normal"));

        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n*** Centro de Adopción de Pokemones ***");
            System.out.println("1. Ver pokemones disponibles");
            System.out.println("2. Adoptar un pokemon");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("\nPokemones disponibles para adopción:");
                    for (Integer id : pokemonesDisponibles.keySet()) {
                        System.out.println("ID: " + id + " - " + pokemonesDisponibles.get(id));
                    }
                    break;
                case 2:
                    System.out.print("\nIngrese el ID del pokemon que desea adoptar: ");
                    int id = scanner.nextInt();

                    if (pokemonesDisponibles.containsKey(id)) {
                        System.out.println("¡Felicidades! Has adoptado a " + pokemonesDisponibles.get(id).getNombre());
                        pokemonesDisponibles.remove(id);
                    } else {
                        System.out.println("ID inválido o el pokemon ya ha sido adoptado.");
                    }
                    break;
                case 3:
                    System.out.println("Gracias por visitar el Centro de Adopción de Pokemones. ¡Hasta pronto!");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 3);

        scanner.close();


    }

    }