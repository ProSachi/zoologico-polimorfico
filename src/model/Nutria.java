package model;

public class Nutria extends Animal {

    public Nutria(String nombre) {
        super(nombre);
    }


     @Override
    public void hacerSonido() {
        System.out.println(nombre + " la nutria hace ñi-ñi-ñi");
    }

    
}
