package model;

public class Pulga extends Animal{

  public Pulga(String nombre) {
    super(nombre);
  }

  @Override
    public void hacerSonido() {
        System.out.println(nombre + " la pulga hace el sonido de pulga (no hace sonido pero aja jajajaja)");
    }
}
