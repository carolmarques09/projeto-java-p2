
public class Main {
    public static void main(String[] args) {
        Unidade trabalhador = new Unidade("Trabalhador 1", UnidadeTipo.TRABALHADOR, 100);
        Unidade arqueiro = new Unidade("Arqueiro 1", UnidadeTipo.ARQUEIRO, 75);
        Unidade cavaleiro = new Unidade("Cavaleiro 1", UnidadeTipo.CAVALARIA, 85);

        trabalhador.mover(10, 20);
        trabalhador.pegarRecursos("madeira");

        arqueiro.mover(15, 30);
        arqueiro.atacar(trabalhador);

        ((Combate)arqueiro).attack(trabalhador);
        System.out.println(trabalhador.getHealth());

        trabalhador.performarAcao();

        cavaleiro.mover(12, 30);
        cavaleiro.pegarRecursos("espada");
    }
}