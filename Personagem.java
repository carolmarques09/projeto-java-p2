import java.util.ArrayList;

public class Personagem extends Unidade {
    private String nome;
    private String raca;
    private String genero;
    private int idade;
    private String classe; // função
    private int ataque;
    private int defesa;
    private int saude;
    private int velocidade;
    private int nivel;
    private int recursos;
    private int experiencia;
    private int x;
    private int y;
    private ArrayList<String> inventario;

    public Personagem(String nome, UnidadeTipo tipo, int saude) {
        super(nome, tipo, saude);
        this.inventario = new ArrayList<>();
    }

    public void adicionarItem(String item) {
        inventario.add(item);
        System.out.println(item + " adicionado ao inventário. ");
    }

    public void removerItem(String item) {
        if (inventario.remove(item)) {
            System.out.println(item + " removido do inventário. ");
        } else {
            System.out.println(item + "não encontrado no inventário. ");
        }
    }

    public void exibirInventario() {
        System.out.println("Inventário de " + nome + " :" + inventario);
    }

    public void tomarDano(int dano) {
        this.saude -= dano;
        if (this.saude <= 0) {
            this.saude = 0;
            System.out.println(nome + "foi derrotado!");
        } else {
            System.out.println(nome + "agora tem" + this.saude + "de saúde!");
        }
    }
}
