import java.util.ArrayList;
import java.util.List;

import model.Animal;
import model.HornitoRinco;
import model.Lobo;
import model.Perro;
import model.Rinoceronte;
import model.Arana;
import model.Pulga;
import model.Mosasaurus;
import model.Plesiosaurus;
import model.Dakosaurus;
import model.Axolotl;
import model.Tarsier;

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

            zoologico.add(new HornitoRinco("Perry"));


        zoologico.add(new Lobo("Robert"));
        zoologico.add(new Arana("Peter"));
        zoologico.add(new Pulga("Pulguiña"));
        zoologico.add(new Rinoceronte("Jerico"));
        zoologico.add(new Mosasaurus("Mosita"));
        zoologico.add(new Plesiosaurus("Plesio"));
        zoologico.add(new Dakosaurus("Drakito"));
        zoologico.add(new Axolotl("Axolotito"));
        zoologico.add(new Tarsier("Tarsito_cansón"));

        // =======================================================

        // 3. Ejecución del Polimorfismo
        System.out.println("--- INICIANDO RECORRIDO POR EL ZOOLÓGICO ---");
        for (Animal animal : zoologico) {
            animal.hacerSonido(); // Enlace Dinámico en acción
        }

    }
}
