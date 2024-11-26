public class Unidade implements GameEntity {
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

    public void mover(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println(nome + "se moveu para (" + x + ", " + y + ")");
    }

    public void atacar(Unidade trabalhador) {
        this.saude -= dano;
    }

    public void performarAcao() {

    }
}
