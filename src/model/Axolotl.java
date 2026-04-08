package model;

public class Axolotl extends Animal {
    public Axolotl(String nombre) {
        super(nombre);
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre + " plof plof");
    }
  
}
