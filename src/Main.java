import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Declaración de variables
        int categoria; // Almacenará la categoría del trabajador (entero)
        double sueldo = 0; // Almacenará el sueldo correspondiente a la categoría (doble)

        // Pedimos al usuario que ingrese la categoría a la que pertenece
        System.out.println("Ingrese la categoria a la que pertenece: ");
        Scanner teclado= new Scanner(System.in);
        categoria= teclado.nextInt(); // Leemos la categoría ingresada por el usuario

        // Estructura de control if-else anidada para calcular el sueldo correspondiente a la categoría ingresada
        if (categoria == 1) { // Si la categoría es igual a 1
            sueldo = 15890 + (15890 * 0.10); // Calculamos el sueldo sumando el 10% al sueldo base
        } else { // Si la categoría no es igual a 1
            if (categoria == 2) { // Si la categoría es igual a 2
                sueldo = 25630.89; // El sueldo es igual al sueldo base
            } else { // Si la categoría no es igual a 1 ni a 2
                if (categoria == 3) { // Si la categoría es igual a 3
                    sueldo = 35560.20 - (35560.20 * 0.11); // Calculamos el sueldo restando el 11% del sueldo base
                } else { // Si la categoría no es igual a 1, 2 ni 3
                    System.out.println("Categoria incorrecta."); // Imprimimos un mensaje de error indicando que la categoría es incorrecta
                }
            }
        }

        // Si la categoría es igual a 1, 2 o 3, imprimimos el sueldo calculado
        if (categoria == 1 || categoria == 2 || categoria == 3) {
            System.out.println("Su sueldo es: " + (float) sueldo); // Convertimos el sueldo a un valor de tipo flotante y lo imprimimos
        }
    }


}
