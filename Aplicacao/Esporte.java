import java.util.List;

public abstract class Esporte {
    
    private final int id;
    private final String nome;

    // Cria o construtor da superclasse
    public Esporte(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    // Cria os métodos get e set
    public final int getId() {
        return this.id;
    }

    public final String getNome() {
        return this.nome;
    }
    
    // Define os métodos que todas as subclasses terão
    public abstract double insereNota(Atleta atleta, String[] stringNotasAtleta, NotasEsporte notasAtleta);
    public abstract void ConverteNota (String[] stringNotasAtleta);
    public abstract double CalculaNota (List<Double> notasAtleta);
}
