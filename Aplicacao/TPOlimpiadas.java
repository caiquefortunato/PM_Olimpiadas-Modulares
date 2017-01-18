import java.util.ArrayList;

public class TPOlimpiadas {

    public static void main(String[] args) {
        
        // Cria os vetores de objetos de Pais, Atleta e Medalhas
        ArrayList <Pais> listaPais = new ArrayList<>();
        ArrayList <Atleta> listaAtleta = new ArrayList<>();
         
        // Cria objetos para leitura dos dados
        LeDados lePais = new LeDados();
        LeDados leAtleta = new LeDados ();
        LeDados leSaida = new LeDados ();
        
        // Cria o objeto para calcular as notas
        NotasEsporte notasAtleta = new NotasEsporte ();
        
        // Inicializa os métodos de leitura de dados
        lePais.LeituraPais(listaPais);
        leAtleta.LeituraAtleta(listaAtleta, notasAtleta);
        leSaida.LeituraSaida(notasAtleta, listaPais);
     
    }
    
}
