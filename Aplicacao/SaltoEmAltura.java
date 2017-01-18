import java.util.ArrayList;
import java.util.List;

public final class SaltoEmAltura extends Esporte{
    
    // Cria uma lista de notas do tipo Double
    private final List<Double> notasSaltoEmAltura = new ArrayList<>();

    // Cria o construtor da subclasse
    public SaltoEmAltura(int id, String nome) {
        super(id, nome);
    }

    // Método que calcula e insere a nota na lista de notas do Salto em altura
    @Override
    public double insereNota(Atleta atleta, String[] stringNotasAtleta, NotasEsporte notasAtleta) {
        notasSaltoEmAltura.clear();
        ConverteNota(stringNotasAtleta);
        return CalculaNota(notasSaltoEmAltura);  
    }
    
    // Converte o stringNotasAtleta de String para double
    @Override
    public void ConverteNota(String[] stringNotasAtleta) {
        for (String stringNotasAtleta1 : stringNotasAtleta) {
            notasSaltoEmAltura.add(Double.parseDouble(stringNotasAtleta1));         
        }
    }

    // Calcula e obtêm a maior nota do atleta
    @Override
    public double CalculaNota(List<Double> notasSaltoEmAltura) {
        return Util.calculaMaiorNota(notasSaltoEmAltura);
    }
    
}
