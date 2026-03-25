package model;

public class Animal {
    protected String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    // Método que será sobrescrito (Polimorfismo)
    public void hacerSonido() {
        System.out.println(nombre + " hace un sonido genérico.");
    }

    public String getNombre() {
        return nombre;
    }

}
