package model;

public class Plesiosaurus extends Animal {
  public Plesiosaurus(String nombre) {
    super(nombre);
  }

  @Override
  public void hacerSonido() {
    System.out.println(nombre + "mm nosé, WOHHHHH");
  }

}
