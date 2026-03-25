package model;

public class Libelula extends Animal {

    public Libelula(String nombre) {
        super(nombre);
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre + " la libélula hace un zumbido suave");
    }  }
