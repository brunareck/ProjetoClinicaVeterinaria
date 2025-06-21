package modelo;
public abstract class Pessoa {

    private String nome;

    Pessoa(String nome) {
        this.nome = nome;
    }

    Pessoa() {
        
    }   

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String mostrarDados() {
        return "Nome: " + nome;
    }

    @Override
    public String toString() {
        return nome;   
    }

    public abstract String TipoPessoa();

}
