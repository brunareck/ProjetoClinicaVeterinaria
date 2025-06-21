import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Consulta{
    private LocalDateTime data;
    private String motivo;
    private Animal animal;
    private Veterinario veterinario;
    private boolean atendida = false;

    DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

    public Consulta(Animal animal, String data, String motivo, Veterinario veterinario) {
        this.animal = animal;          
        this.data = LocalDateTime.parse(data);
        this.motivo = motivo;
        this.veterinario = veterinario;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }
    public boolean StatusConsulta() {
       LocalDateTime atual = LocalDateTime.now();
       if(atual.isAfter(data))
        this.atendida = true;

        return this.atendida;
    }

    public String mostrarDados() {
        String aux = "---------------------------------\n" +
                "Dados da Consulta:\n" +
                "Animal: " + animal.getNome() + "\n" +
                "Tutor: " + animal.getTutor().getNome() + "\n" +
                "Data: " + formato.format(data) + "\n" +
                "Motivo: " + motivo + "\n" +
                "Veterinário: " + veterinario.getNome() + "\n" +
                "CRVM: " + veterinario.getCrvm() + "\n";
        if (StatusConsulta()) {
            aux += "Status: Consulta atendida";
        } else {
            aux += "Status: Consulta pendente";
        }
        return aux;
    }

public Veterinario getVeterinario() {
        return veterinario;
    }

    public void setVeterinario(Veterinario veterinario) {
        this.veterinario = veterinario;
    }
}