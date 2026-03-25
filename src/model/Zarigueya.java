package model;

public class Zarigueya extends Animal{

    public Zarigueya(String nombre) {
        super(nombre);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre + " la zarigueya hace un sonido chillón ");
    }

    
}
