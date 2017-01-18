public class Pais {
    private int id;
    private String nome;

    // Cria-se o construtor
    public Pais(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    // Métodos get e se
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
}
