import java.util.ArrayList;
import java.util.List;

public final class Natacao extends Esporte{
    
    // Cria uma lista de notas do tipo Double
    private final List<Double> notasNatacao = new ArrayList<>();
    
    // Cria o construtor da subclasse
    public Natacao(int id, String nome) {
        super(id, nome);
    }

    // Método que calcula e insere a nota na lista de notas da Natação
    @Override
    public double insereNota(Atleta atleta, String[] stringNotasAtleta, NotasEsporte notasAtleta) {
        notasNatacao.clear();
        ConverteNota(stringNotasAtleta);
        return CalculaNota(notasNatacao);
    }

    // Converte o stringNotasAtleta de String para double
    @Override
    public void ConverteNota(String[] stringNotasAtleta) {
        // Converte o stringNotasAtleta de String para double
        for (String stringNotasAtleta1 : stringNotasAtleta) {
            notasNatacao.add(Double.parseDouble(stringNotasAtleta1));         
        }
    }

    // Calcula e obtêm a menor nota do atleta
    @Override
    public double CalculaNota(List<Double> notasAtleta) {
        return Util.calculaMenorNota(notasNatacao);
    }
    
}
