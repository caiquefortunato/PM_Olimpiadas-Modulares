import java.util.Comparator;

public class OrdenaNotasAtleta implements Comparator {

    @Override
    public int compare(Object obj1, Object obj2) {
        int retorno = 0;
        if(obj1 == null || obj2 == null)
                return 0;
        
        Notas objeto1 = (Notas) obj1;
        Notas objeto2 = (Notas) obj2;
        
        // maior
        if (objeto1.getNota() < objeto2.getNota()) {
                retorno = 1;
        } 
        //menor
        else if (objeto1.getNota() > objeto2.getNota()) {
                retorno = -1;
        } 
        //iguais ?
        else {
            if (objeto1.getAtleta().getNome().compareTo(objeto2.getAtleta().getNome()) == -1) {
                    retorno = 1;
            } else if (objeto1.getAtleta().getNome().compareTo(objeto2.getAtleta().getNome()) == 1) {
                    retorno = -1;
            } 
        }
        return retorno;              
    } 
}
