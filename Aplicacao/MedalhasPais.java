public class MedalhasPais {
    
    private Pais pais;
    private int ouro;
    private int prata;
    private int bronze;

    public MedalhasPais(Pais pais, int ouro, int prata, int bronze) {
        this.pais = pais;
        this.ouro = ouro;
        this.prata = prata;
        this.bronze = bronze;
    }

    // Criação dos métodos set e get
    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public int getOuro() {
        return ouro;
    }

    public int getPrata() {
        return prata;
    }

    public int getBronze() {
        return bronze;
    }

    public void insereOuro() {
        this.ouro++;
    }
    
    public void inserePrata() {
        this.prata++;
    }
    
    public void insereBronze() {
        this.bronze++;
    }
}
