import Objetos.recursos;

public abstract class Unidade implements recursos {
    private String nome;
    private UnidadeTipo tipo;
    private int saude;
    private int x;
    private int y;
    private int dano;

    public Unidade(String nome, UnidadeTipo tipo, int saude) {
        this.nome = nome;
        this.tipo = tipo;
        this.saude = saude;
        this.x = 0;
        this.y = 0;
    }

    public void performarAcao() {

    }

    public UnidadeTipo getTipo() {
        return this.tipo;
    }

    @Override
    public void mover(int x, int y) {

    }

    @Override
    public void atacar(recursos target) {

    }

    @Override
    public void pegarRecursos(String resourceType) {

    }

    @Override
    public void usar(String objeto) {

    }

    @Override
    public void soltar(String objeto) {

    }

    @Override
    public void descartar(String objeto) {

    }
}
