package model;

public class Rinoceronte extends Animal{
    
    public Rinoceronte(String nombre) {
        super(nombre);
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre + "el rinoceronte hace sonido rinoceronte");
    }
}
