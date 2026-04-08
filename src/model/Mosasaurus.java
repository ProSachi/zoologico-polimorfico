package model;

public class Mosasaurus extends Animal {
  public Mosasaurus(String nombre) {
    super(nombre);
  }

  @Override
  public void hacerSonido() {
    System.out.println(nombre + "GRAAASHHHH");
  }
}
