import java.util.ArrayList;
import java.util.List;

public final class GinasticaArtistica extends Esporte{
    
    // Cria uma lista de notas do tipo Double
    private final List<Double> notasGinasticaArtistica = new ArrayList<>();

    // Cria o construtor da subclasse
    public GinasticaArtistica(int id, String nome) {
        super(id, nome);
    }

    // Método que calcula e insere a nota na lista de notas da Ginástica Art.
    @Override
    public double insereNota(Atleta atleta, String[] stringNotasAtleta, NotasEsporte notasAtleta) {
        notasGinasticaArtistica.clear();
        ConverteNota(stringNotasAtleta);
        return CalculaNota(notasGinasticaArtistica);     
    }

    // Converte o stringNotasAtleta de String para double
    @Override
    public void ConverteNota(String[] stringNotasAtleta) {
        for (String stringNotasAtleta1 : stringNotasAtleta) {
            notasGinasticaArtistica.add(Double.parseDouble(stringNotasAtleta1));         
        }        
    }

    // Calcula e obtêm a maior nota do atleta
    @Override
    public double CalculaNota(List<Double> notasGinasticaArtistica) {
        return Util.calculaMaiorMedia(notasGinasticaArtistica);
    }
    
}
