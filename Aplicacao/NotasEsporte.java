import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;

public class NotasEsporte {
    
    // Cria uma lista de notas de cada esporte
    protected ArrayList <Notas> listaNotasCorrida = new ArrayList<>();
    protected ArrayList <Notas> listaNotasNatacao = new ArrayList<>();
    protected ArrayList <Notas> listaNotasLevantamentoDePeso = new ArrayList<>();
    protected ArrayList <Notas> listaSaltoEmAltura = new ArrayList<>();
    protected ArrayList <Notas> listaGinasticaArtistica = new ArrayList<>();
    // Cria uma lista de notas da classificação de medalhas
    protected ArrayList <Notas> listaMedalhasPais = new ArrayList<>();
    
    // Ordena os vetores de notas
    private void OrdenaNotas() {
        //Ordena as notas
        OrdenaNotasAtleta ordenaNota = new OrdenaNotasAtleta();
        Collections.sort(listaNotasCorrida, ordenaNota);
        Collections.reverse(listaNotasCorrida);
        Collections.sort(listaNotasNatacao, ordenaNota);
        Collections.reverse(listaNotasNatacao);
        Collections.sort(listaNotasLevantamentoDePeso, ordenaNota);
        Collections.sort(listaSaltoEmAltura, ordenaNota);
        Collections.sort(listaGinasticaArtistica, ordenaNota);     
    }
    
    // ---------- Insere e imprime as notas de Corrida
    public void InsereNotaCorrida(Atleta atleta, Double menorNota) {
        Notas nota = new Notas(atleta, menorNota);
        listaNotasCorrida.add(nota);
    }   
   
    public void ImprimeNotaCorrida(Corrida corrida) throws IOException {
        OrdenaNotas();
        // Salva os dados no arquivo de saída
        try (FileWriter arq = new FileWriter("/estatistica-1-1.txt")) {
            PrintWriter gravarArq = new PrintWriter(arq);
            gravarArq.print(corrida.getNome() + "\n");
            gravarArq.println();gravarArq.println();
            for(int i = 0; i < listaNotasCorrida.size(); i++){
                gravarArq.print(listaNotasCorrida.get(i).getAtleta().getNome() + "\t");
                gravarArq.print(listaNotasCorrida.get(i).getNota() + "\n");
                gravarArq.println();
            }    
        }
  }
    
    // ---------- Insere e imprime as notas de Natação
    public void InsereNotaNatacao(Atleta atleta, Double menorNota) {
        Notas nota = new Notas(atleta, menorNota);
        listaNotasNatacao.add(nota);
    }
    
    public void ImprimeNotaNatacao(Natacao natacao) throws IOException {
        OrdenaNotas();
        // Salva os dados no arquivo de saída
        try (FileWriter arq = new FileWriter("/estatistica-1-2.txt")) {
            PrintWriter gravarArq = new PrintWriter(arq);
            gravarArq.print(natacao.getNome() + "\n");
            gravarArq.println();gravarArq.println();
            for(int i = 0; i < listaNotasNatacao.size(); i++){
                gravarArq.print(listaNotasNatacao.get(i).getAtleta().getNome() + "\t");
                gravarArq.print(listaNotasNatacao.get(i).getNota() + "\n");
                gravarArq.println();
            }    
        }
    }
    
    // ---------- Insere e imprime as notas de Lev. de Peso
    public void InsereNotaLevantamentoDePeso(Atleta atleta, Double maiorNota) {
        Notas nota = new Notas(atleta, maiorNota);
        listaNotasLevantamentoDePeso.add(nota);
    }

    public void ImprimeNotaLevantamentoDePeso(LevantamentoDePeso levantamentoDePeso) throws IOException {
        OrdenaNotas();
        // Salva os dados no arquivo de saída            
        try (FileWriter arq = new FileWriter("/estatistica-1-3.txt")) {
            PrintWriter gravarArq = new PrintWriter(arq);
            gravarArq.print(levantamentoDePeso.getNome() + "\n");
            gravarArq.println(); gravarArq.println();
            for(int i = 0; i < listaNotasLevantamentoDePeso.size(); i++){
                gravarArq.print(listaNotasLevantamentoDePeso.get(i).getAtleta().getNome() + "\t");
                gravarArq.printf("%.0f", listaNotasLevantamentoDePeso.get(i).getNota());
                gravarArq.println();
            }    
        }
    }
    
    // ---------- Insere e imprime as notas de Salto em altura
    public void InsereNotaSaltoEmAltura(Atleta atleta, Double maiorNota) {
        Notas nota = new Notas(atleta, maiorNota);
        listaSaltoEmAltura.add(nota);
    }
    
    public void ImprimeNotaSaltoEmAltura(SaltoEmAltura saltoEmAltura) throws IOException {
        OrdenaNotas();
        // Salva os dados no arquivo de saída
        try (FileWriter arq = new FileWriter("/estatistica-1-4.txt")) {
            PrintWriter gravarArq = new PrintWriter(arq);
            gravarArq.print(saltoEmAltura.getNome() + "\n");
            gravarArq.println(); gravarArq.println();
            for(int i = 0; i < listaSaltoEmAltura.size(); i++){
                gravarArq.print(listaSaltoEmAltura.get(i).getAtleta().getNome() + "\t");
                gravarArq.print(listaSaltoEmAltura.get(i).getNota());
                gravarArq.println();
            }    
        }
    }
    
    // ---------- Insere e imprime as notas de Ginástica Artística
    public void InsereNotaGinasticaArtistica(Atleta atleta, Double maiorNota) {
        Notas nota = new Notas(atleta, maiorNota);
        listaGinasticaArtistica.add(nota);
    }
    
    public void ImprimeNotaGinasticaArtistica(GinasticaArtistica ginasticaArtistica) throws IOException {
        OrdenaNotas();
        // Salva os dados no arquivo de saída
        try (FileWriter arq = new FileWriter("/estatistica-1-5.txt")) {
            PrintWriter gravarArq = new PrintWriter(arq);
            gravarArq.print(ginasticaArtistica.getNome() + "\n");
            gravarArq.println(); gravarArq.println();
            for(int i = 0; i < listaGinasticaArtistica.size(); i++){
                gravarArq.print(listaGinasticaArtistica.get(i).getAtleta().getNome() + "\t");
                gravarArq.printf("%.2f", listaGinasticaArtistica.get(i).getNota());
                gravarArq.println();
            }    
        }
    } 
    
    // Calcula o quadro de medalhas
    public void ImprimeQuadroMedalhas(ArrayList <MedalhasPais> medalhasPais) throws IOException {
        // Ordena todas as notas
        OrdenaNotas();
        // Captura o resultado de cada modalidade, calculando as medalhas por colocação
        DeterminaMedalhas.SetaMedalhas(listaNotasCorrida, medalhasPais);  
        DeterminaMedalhas.SetaMedalhas(listaNotasNatacao, medalhasPais);
        DeterminaMedalhas.SetaMedalhas(listaNotasLevantamentoDePeso, medalhasPais);
        DeterminaMedalhas.SetaMedalhas(listaSaltoEmAltura, medalhasPais);
        DeterminaMedalhas.SetaMedalhas(listaGinasticaArtistica, medalhasPais);
       
        //Ordena o quadro de medalhas
        OrdenaQuadroMedalhas doisCriteriosNota = new OrdenaQuadroMedalhas();
        Collections.sort(medalhasPais, doisCriteriosNota); // use o comparador para ordenar.
        
        // Salva os dados no arquivo de saída
        try (FileWriter arq = new FileWriter("/estatistica-2.txt")) {
            PrintWriter gravarArq = new PrintWriter(arq);
            gravarArq.print("Quadro de medalhas");
            gravarArq.println();gravarArq.println();
            gravarArq.print("Pais" + "\t" + "Ouro" + "\t" + "Prata" + "\t" + "Bronze" + "\t"); 
            gravarArq.println();
            for(int i = 0; i < medalhasPais.size(); i++) {
                gravarArq.print(medalhasPais.get(i).getPais().getNome());
                gravarArq.print("\t");
                gravarArq.print(medalhasPais.get(i).getOuro());
                gravarArq.print("\t");
                gravarArq.print(medalhasPais.get(i).getPrata());
                gravarArq.print("\t");
                gravarArq.print(medalhasPais.get(i).getBronze());
                gravarArq.println();
            }    
        }
    }
}
