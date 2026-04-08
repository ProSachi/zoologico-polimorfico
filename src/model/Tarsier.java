package model;

public class Tarsier extends Animal {
  public Tarsier(String nombre) {
    super(nombre);
  }

  @Override
  public void hacerSonido() {
    System.out.println(nombre + " piiiiii ");
  }
}
