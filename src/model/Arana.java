package model;

public class Arana extends Animal {

    public Arana(String nombre) {
        super(nombre);
    }
    @Override
    public void hacerSonido() {
        System.out.println(nombre + "La araña hace sonidos de araña");
    }
}
