import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class LeDados {
     
    // Cria objetos para cada esporte
    private final Corrida corrida = new Corrida(1, "Corrida");
    private final Natacao natacao = new Natacao(2, "Natação");
    private final LevantamentoDePeso levantamentoDePeso = new LevantamentoDePeso (3, "Levantamento de peso");
    private final SaltoEmAltura saltoEmAltura = new SaltoEmAltura (4, "Salto em Altura");
    private final GinasticaArtistica ginasticaArtistica = new GinasticaArtistica (5, "Ginástica artística");
    
    // Método que realiza a leitura de pais e salva na lista de objetos
    public final void LeituraPais(ArrayList <Pais> listaPais) {

        // Abre um novo arquivo do diretório
        File file = new File("/paises.txt");

        // Se for possível carregar o arquivo informado:
        try (FileInputStream stream = new FileInputStream(file)) {

            InputStreamReader reader = new InputStreamReader(stream);
            BufferedReader br = new BufferedReader(reader);
            String linha = br.readLine();

            while(linha != null) {
               String id = linha.substring(0, linha.indexOf(';'));
               String nome = linha.substring(linha.lastIndexOf(';') + 1, linha.length());

               // Converte de string para inteiro (id do país)
               int id_cod = Integer.parseInt(id);
               // Adiciona os dados em um novo objeto do tipo País
               Pais p = new Pais(id_cod, nome);
               // Adiciona o objeto na lista de objetos de País
               listaPais.add(p);

               linha = br.readLine();
            }
        } 
        catch (IOException e) { }  
    } 
    
    // Método que realiza a leitura de atletas
    public final void LeituraAtleta(ArrayList <Atleta> listaAtleta, NotasEsporte notasAtleta) {

        // Abre um novo arquivo do diretório
        File file = new File("/atletas.txt");

        // Se for possível carregar o arquivo informado:
        try (FileInputStream stream = new FileInputStream(file)) {

            InputStreamReader reader = new InputStreamReader(stream);
            BufferedReader br = new BufferedReader(reader);
            String linha = br.readLine();

            while(linha != null) {
                // Le os dados do atleta e suas respectivas notas
                String sId = linha.substring(0, linha.indexOf(';'));
                int tam = sId.length();
                String sIdPais = linha.substring(tam + 1, tam + 2);
                String sIdEsporte = linha.substring(tam + 3, tam + 4);
                String nome = linha.substring(tam + 5, linha.lastIndexOf(';'));
                String notas = linha.substring(linha.lastIndexOf(';') + 1, linha.length());
                
                // Converte de string para inteiro (id do país)
                int idAtleta = Integer.parseInt(sId);
                int idPais = Integer.parseInt(sIdPais);
                int idEsporte = Integer.parseInt(sIdEsporte);    
                // Adiciona os dados em um novo objeto do tipo Atleta
                Atleta atleta = new Atleta(idAtleta, nome, idPais, idEsporte);   
                // Adiciona o objeto na lista de objetos de Atleta
                listaAtleta.add(atleta);
                
                // Converte de | para ; para utilizar o split
                notas = notas.replace('|', ';');
                // Converte de , para . para utilizar conversor de Double
                notas = notas.replace(',', '.');

                // Separa as notas pelo ; e salva em um stringNotasAtleta de String
                String[] stringNotasAtleta = notas.split(";");
                
                switch (idEsporte) {
                    case 1:
                        notasAtleta.InsereNotaCorrida(atleta, corrida.insereNota(atleta, stringNotasAtleta, notasAtleta));
                        break;
                    case 2:
                        notasAtleta.InsereNotaNatacao(atleta, natacao.insereNota(atleta, stringNotasAtleta, notasAtleta));
                        break;
                    case 3:
                        notasAtleta.InsereNotaLevantamentoDePeso(atleta, levantamentoDePeso.insereNota(atleta, stringNotasAtleta, notasAtleta));
                        break;
                    case 4:
                        notasAtleta.InsereNotaSaltoEmAltura(atleta, saltoEmAltura.insereNota(atleta, stringNotasAtleta, notasAtleta));
                        break;
                    case 5:
                        notasAtleta.InsereNotaGinasticaArtistica(atleta, ginasticaArtistica.insereNota(atleta, stringNotasAtleta, notasAtleta));
                        break;
                    default:
                        System.out.println("O identificador do Esporte não existe!");
                        break;
                }
 
                linha = br.readLine();
            }
        } 
        catch (IOException e) { }    
    }
   
    // Método que le a saida
    public final void LeituraSaida (NotasEsporte notasAtleta, ArrayList <Pais> listaPais) {
        // Abre um novo arquivo do diretório
        File file = new File("/estatisticas.txt");

        // Se for possível carregar o arquivo informado:
        try (FileInputStream stream = new FileInputStream(file)) {

            InputStreamReader reader = new InputStreamReader(stream);
            BufferedReader br = new BufferedReader(reader);
            String linha = br.readLine();

            while(linha != null) {
               // Le os dados do atleta e suas respectivas notas
               String entrada = linha.substring(0, linha.length());
               
               // Se a entrada for 2, é exibido o quadro de medalhas
               if("2".equals(entrada)){
                   // Cria-se um vetor do tipo de Medalhas do País
                   ArrayList <MedalhasPais> medalhasPais = new ArrayList<>();

                   // É feita a cópia dos dados do lista de pais para a de medalhas
                   for(int i = 0; i < listaPais.size(); i++)
                   {
                       Pais p = listaPais.get(i);
                       MedalhasPais copia = new MedalhasPais (p, 0, 0, 0);
                       medalhasPais.add(copia);
                   }
                   
                   // O método de impressão do quadro é chamado
                   notasAtleta.ImprimeQuadroMedalhas(medalhasPais);
                  // Caso contrário, será exibida o ranking de cada esporte
               }else{
                   String sValorEsporte = entrada.substring(2, 3);
                   int valorEsporte = Integer.parseInt(sValorEsporte);
                                     
                   switch (valorEsporte) {
                       case 1:            
                           notasAtleta.ImprimeNotaCorrida(corrida);
                           break;
                       case 2:
                           notasAtleta.ImprimeNotaNatacao(natacao);
                           break;
                       case 3:
                           notasAtleta.ImprimeNotaLevantamentoDePeso(levantamentoDePeso);
                           break;
                       case 4:
                           notasAtleta.ImprimeNotaSaltoEmAltura(saltoEmAltura);
                           break;
                       case 5:
                           notasAtleta.ImprimeNotaGinasticaArtistica(ginasticaArtistica);
                           break;
                       default:
                           System.out.println("Valor do código do esporte errado!");
                           break;
                   }        
               }
               linha = br.readLine();
            }
            } 
        catch (IOException e) { }            
    }
}
