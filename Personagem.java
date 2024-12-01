import java.util.ArrayList;

public abstract class Personagem extends Unidade {
    private String nome;
    private String classe; // função
    private int saude;
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
