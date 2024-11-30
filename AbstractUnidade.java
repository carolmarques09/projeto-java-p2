public abstract class AbstractUnidade {
    protected String nome;
    protected int saude;
    protected int x;
    protected int y;

    public AbstractUnidade(String nome, int saude) {
        this.nome = nome;
        this.saude = saude;
        this.x = 0;
        this.y = 0;
    }
}
