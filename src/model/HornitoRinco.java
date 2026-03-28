package model;

public class HornitoRinco extends Animal {

    // Constructor que recibe el nombre y lo pasa a la clase padre
    public HornitoRinco(String nombre) {
        super(nombre);
    }

    // Sobrescribimos el método para personalizar el sonido
    @Override
    public void hacerSonido() {
        System.out.println(nombre + " sonido caracteristico de Perry el agente P.");
    }
}
