public class Atleta {
    private int id;
    private String nome;
    private int idPais;
    private int idEsporte;
    
    // Cria o construtor
    public Atleta(int id, String nome, int idPais, int idEsporte) {
        this.id = id;
        this.nome = nome;
        this.idPais = idPais;
        this.idEsporte = idEsporte;
    }
    
    // Cria os get/set necessários
    public int getIdEsporte() {
        return idEsporte;
    }

    public void setIdEsporte(int idEsporte) {
        this.idEsporte = idEsporte;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdPais() {
        return idPais;
    }

    public void setIdPais(int idPais) {
        this.idPais = idPais;
    }
}
