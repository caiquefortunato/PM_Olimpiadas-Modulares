import java.util.ArrayList;
import java.util.List;

public final class LevantamentoDePeso extends Esporte{

    // Cria uma lista de notas do tipo Double
    private final List<Double> notasLevantamentoDePeso = new ArrayList<>();
    
    // Cria o construtor da subclasse
    public LevantamentoDePeso(int id, String nome) {
        super(id, nome);
    }

    // Método que calcula e insere a nota na lista de notas do Lev. de Peso
    @Override
    public double insereNota(Atleta atleta, String[] stringNotasAtleta, NotasEsporte notasAtleta) {
        notasLevantamentoDePeso.clear();
        ConverteNota(stringNotasAtleta);
        return CalculaNota(notasLevantamentoDePeso);        
    }
    
    // Converte o stringNotasAtleta de String para double
    @Override
    public void ConverteNota(String[] stringNotasAtleta) {
        // Converte o stringNotasAtleta de String para Doable
        for (int i = 0; i < stringNotasAtleta.length; i++) {
            notasLevantamentoDePeso.add(Double.parseDouble(stringNotasAtleta[i]));  
        }   
    }

    // Calcula e obtêm a soma das notas do atleta
    @Override
    public double CalculaNota(List<Double> notasAtleta) {
        return Util.calculaSomaNota(notasAtleta);
    }
    
}
