package model;

public class Capibara extends Animal{

    public Capibara(String nombre) {
        super(nombre);
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre + " el capibara hace sonidos cortos, emite un aullido profundo cuando se asusta.");
    }

}
