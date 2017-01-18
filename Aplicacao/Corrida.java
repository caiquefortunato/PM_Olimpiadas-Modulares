import java.util.ArrayList;
import java.util.List;

public final class Corrida extends Esporte{
    
    // Cria uma lista de notas do tipo Double (temporária)
    private final List<Double> notasCorrida = new ArrayList<>();
     
    // Cria o construtor da subclasse
    public Corrida(int id, String nome) {
        super(id, nome);
    }

    // Método que calcula e insere a nota na lista de notas da corrida
    @Override
    public double insereNota(Atleta atleta, String[] stringNotasAtleta, NotasEsporte notasAtleta) {
        notasCorrida.clear();
        ConverteNota(stringNotasAtleta);
        return CalculaNota(notasCorrida);
    }

    // Converte o stringNotasAtleta de String para double
    @Override
    public void ConverteNota(String[] stringNotasAtleta) {        
        for (String stringNotasAtleta1 : stringNotasAtleta) {
            notasCorrida.add(Double.parseDouble(stringNotasAtleta1));    
        }
    }

    // Calcula e obtêm a menor nota do atleta
    @Override
    public double CalculaNota(List<Double> notasCorrida) {      
        return Util.calculaMenorNota(notasCorrida);
    }
    
}
