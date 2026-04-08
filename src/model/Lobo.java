package model;

public class Lobo extends Animal {

    public Lobo(String nombre) {
        super(nombre);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre + " el lobo hace aulla");
    }

}