import java.util.ArrayList;
import java.util.List;

import model.Animal;
import model.Lobo;
import model.Perro;

public class App {
    public static void main(String[] args) throws Exception {
               // 1. La lista polimórfica (Acepta cualquier hijo de Animal)
        List<Animal> zoologico = new ArrayList<>();

        // 2. Poblado inicial del zoológico
        zoologico.add(new Perro("Firulais"));
        
        // =======================================================
        // ZONA DE TRABAJO ESTUDIANTIL
        // Instrucción: Cada estudiante debe instanciar su animal aquí
        // Ejemplo: zoologico.add(new Leon("Simba"));
            zoologico.add(new Lobo("Robert"));


        // =======================================================
        

        // 3. Ejecución del Polimorfismo
        System.out.println("--- INICIANDO RECORRIDO POR EL ZOOLÓGICO ---");
        for (Animal animal : zoologico) {
            animal.hacerSonido(); // Enlace Dinámico en acción
        }

    }
}
