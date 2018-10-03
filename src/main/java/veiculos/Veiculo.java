package veiculos;

public abstract class Veiculo {
    protected String nome;
    protected int velocidade;
    protected boolean estado;
    /**
     * estado = false parado
     * estado = true andando
     */
    private final int LIMVEL;
    private final int VELOACI;

    public Veiculo(String nome, int limVelo, int veloAci) {
        this.nome = nome;
        this.LIMVEL = limVelo;
        this.VELOACI = veloAci;
        this.velocidade = 0;
        this.estado = false;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
