package model;

public class Dakosaurus extends Animal {
  public Dakosaurus(String nombre) {
    super(nombre);
  }

  @Override
  public void hacerSonido() {
    System.out.println(nombre + "KRAKKKKK");
  }

}
