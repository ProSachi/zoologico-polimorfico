package model;

public class Oso extends Animal {

    public Oso(String nombre) {
        super(nombre);
    }

        @Override
        public void hacerSonido() {
        System.out.println(nombre + "El Oso hace sonido de Oso");
    }
    
}
