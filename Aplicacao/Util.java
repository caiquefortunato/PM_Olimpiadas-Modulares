import java.util.List;

public class Util {

    public static double calculaMenorNota(List<Double> notasAtleta){
        
        double menor = notasAtleta.get(0);
        for (int i = 0; i < notasAtleta.size(); i++) {
            if(notasAtleta.get(i) < menor)
                menor = notasAtleta.get(i);
        }
        return menor;
    }
    
    public static double calculaMaiorNota(List<Double> notasAtleta){
        
        double maior = notasAtleta.get(0);
        for (int i = 0; i < notasAtleta.size(); i++) {
            if(notasAtleta.get(i) > maior)
                maior = notasAtleta.get(i);
        }
        return maior;
    }
    
    public static double calculaSomaNota(List<Double> notasAtleta){
        
        double soma = 0.0;
        for (int i = 0; i < notasAtleta.size(); i++) {
            soma += notasAtleta.get(i);
        }
        return soma;
    }
    
    public static double calculaMaiorMedia(List<Double> notasAtleta){
        
        double media = 0.0;
        for (int i = 0; i < notasAtleta.size(); i++) {
            media += notasAtleta.get(i);
        }
        return media / notasAtleta.size();
    }
    
}
