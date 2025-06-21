package modelo;
public class Animal {

    private String nome;
    private String especie;
    private String raca;
    private int idade;
    private float peso;
    private Tutor tutor;

    public Animal(String nome, String especie, String raca, int idade, float peso, Tutor tutor) {
        this.nome = nome;
        this.especie = especie;
        this.raca = raca;
        this.idade = idade;
        this.peso = peso;
        this.tutor = tutor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public Tutor getTutor() {
        return tutor;
    }

    public void setTutor(Tutor tutor) {
        this.tutor = tutor;
    }

    public String mostrarDados() {
        String aux = "---------------------------------\n" +
        "Dados do Animal:\n" +
        "Nome: " + nome + "\n" +
        "Espécie: " + especie + "\n" +
        "Raça: " + raca + "\n" +
        "Idade: " + idade + " anos\n" +
        "Peso: " + peso + " kg\n" +
        "Tutor: " + (tutor != null ? tutor.getNome() : "Sem Tutor");
        return aux;
    }
}