public class Veterinario extends Pessoa {

    private String crvm;

    public Veterinario(String nome, String crvm) {
        super(nome);
        this.crvm = crvm;
    }

    public String getCrvm() {
        return crvm;
    }

    public void setCrvm(String crvm) {
        this.crvm = crvm;
    }

    @Override
    public String mostrarDados() {
        String aux = "---------------------------------\n" + 
        "Dados do Veterinário: \n" +
        super.mostrarDados() + 
        "\nCRVM: " + crvm;

        return aux;
    }

    @Override
    public String TipoPessoa() {
        return "Veterinário";
    }
}