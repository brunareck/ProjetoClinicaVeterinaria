package modelo.teste;
import modelo.Animal;
import modelo.Consulta;
import modelo.Tutor;
import modelo.Veterinario;

public class ClinicaVeterinaria {

    public static void main(String[] args) {
        
        Tutor tutor1 = new Tutor("João", "1234-5678");
        Tutor tutor2 = new Tutor("Bruna", "8765-4321");

        Animal animal1 = new Animal("Rex", "Cachorro", "Labrador", 5, 30.0f, tutor1);
        Animal animal2 = new Animal("Meg", "Cachorro", "Shitzu", 12, 6.0f, tutor2);
        Animal animal3 = new Animal("Maya", "Gato", "SR", 3, 3.0f, tutor2);

        tutor1.addAnimal(animal1);
        tutor2.addAnimal(animal2);
        tutor2.addAnimal(animal3);

        Veterinario veterinario1 = new Veterinario("Laura Dias", "12345");
        Veterinario veterinario2 = new Veterinario("Joao Camargo", "54321");

        Consulta consulta1 = new Consulta(animal1,"2025-05-15T15:30:00", "Coceira", veterinario2);
        Consulta consulta2 = new Consulta(animal2,"2025-06-30T15:30:00", "Infecção Urinária", veterinario1);

        System.out.println(tutor1.mostrarDados());
        System.out.println(tutor2.mostrarDados());
        System.out.println(animal1.mostrarDados());
        System.out.println(animal2.mostrarDados());
        System.out.println(animal3.mostrarDados());
        System.out.println(veterinario1.mostrarDados());
        System.out.println(veterinario2.mostrarDados());
        System.out.println(consulta1.mostrarDados());
        System.out.println(consulta2.mostrarDados());
    }
}