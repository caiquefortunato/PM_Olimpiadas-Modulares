public class Notas{
    
    private Atleta atleta;
    private double nota;
    
    // Criação do construtor
    public Notas(Atleta atleta, double nota) {
        this.atleta = atleta;
        this.nota = nota;
    }

    // Criação dos métodos get e set
    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public Atleta getAtleta() {
        return atleta;
    }

    public void setAtleta(Atleta atleta) {
        this.atleta = atleta;
    }
}
