package Esqueleto;

public class Libro {
    // Atributos
    private String titulo;
    private String autor;
    private double precio;
    private int añoPublicacion;

    // Constructor sin parámetros
    public Libro() {
        // Inicializa los atributos con valores por defecto
        this.titulo = "";
        this.autor = "";
        this.precio = 0.0;
        this.añoPublicacion = 0;
    }

    // Constructor con parámetros
    public Libro(String titulo, String autor, double precio, int añoPublicacion) {
        // Inicializa los atributos con los valores dados
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
        this.añoPublicacion = añoPublicacion;
    }

    // Métodos
    public void mostrarDetalles() {
        // Muestra los detalles del libro
        System.out.println("Título: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Precio: $" + this.precio);
        System.out.println("Año de publicación: " + this.añoPublicacion);
    }

    public void actualizarPrecio(double nuevoPrecio) {
        // Actualiza el precio del libro
        this.precio = nuevoPrecio;
        System.out.println("El precio del libro ha sido actualizado a: $" + this.precio);
    }

    // Métodos getter y setter para los atributos necesarios
    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getPrecio() {
        return this.precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getAñoPublicacion() {
        return this.añoPublicacion;
    }

    public void setAñoPublicacion(int añoPublicacion) {
        this.añoPublicacion = añoPublicacion;
    }
}



