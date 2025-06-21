package modelo;
import java.util.ArrayList;
import java.util.List;

public class Tutor extends Pessoa {

    protected String telefone;
    protected List<Animal> animais = new ArrayList<>();

    public Tutor(String nome, String telefone) {
        super(nome);
        this.telefone = telefone;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void addAnimal(Animal animal){
        animais.add(animal);
    }

    public String mostrarAnimais() {
        String aux = "Animais: ";
        for (Animal animal : animais) {
            aux += "\n" + animal.getNome();
        }
        return aux;
    }

    @Override
    public String mostrarDados() {
        String aux = "---------------------------------\n" + 
        "Dados do(a) Tutor(a): \n" + 
        super.mostrarDados() + "\nTelefone: " + telefone + "\n" +
        mostrarAnimais();
        
        return aux;
    }

    @Override
    public String TipoPessoa() {
        return "Tutor";
    }

}
