import java.util.Comparator;

public class OrdenaQuadroMedalhas implements Comparator{
    @Override
    public int compare(Object obj1, Object obj2) {
        int retorno = 0;
        if(obj1 == null || obj2 == null)
                return 0;
        
        MedalhasPais objeto1 = (MedalhasPais) obj1;
        MedalhasPais objeto2 = (MedalhasPais) obj2;
        
        // maior
        if (objeto1.getOuro() < objeto2.getOuro()) {
                retorno = 1;
        } 
        //menor
        else if (objeto1.getOuro() > objeto2.getOuro()) {
                retorno = -1;
        } 
        //iguais ?
        else {
            if (objeto1.getPrata() < objeto2.getPrata()) {
                    retorno = 1;
            } else if (objeto1.getPrata() > objeto2.getPrata()) {
                    retorno = -1;
            } else {
                    if (objeto1.getBronze() < objeto2.getBronze()) {
                    retorno = 1;
                    } else if (objeto1.getBronze() > objeto2.getBronze()) {
                    retorno = -1;
                    }
            }
        }
        return retorno;        
    }
}
