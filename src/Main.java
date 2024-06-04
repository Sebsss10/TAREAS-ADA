import Esqueleto.Libro;

;

public class Main {
    public static void main(String[] args) {
                // Crea un objeto 'libro1' utilizando el constructor sin parámetros
                Libro libro1 = new Libro();

                // Crea un objeto 'libro2' utilizando el constructor con parámetros
                Libro libro2 = new Libro("El principito", "Antoine de Saint-Exupéry", 15.99, 1943);

                // Llama a los métodos 'mostrarDetalles' y 'actualizarPrecio' para 'libro2'
                libro2.mostrarDetalles(); // Muestra los detalles iniciales del libro
                libro2.actualizarPrecio(19.99); // Actualiza el precio del libro
            }
        }



