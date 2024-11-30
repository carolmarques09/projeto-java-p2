import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Unidade trabalhador = new Unidade("Trabalhador 1", UnidadeTipo.TRABALHADOR, 100);
        Unidade arqueiro = new Unidade("Arqueiro 1", UnidadeTipo.ARQUEIRO, 75);
        Unidade cavaleiro = new Unidade("Cavaleiro 1", UnidadeTipo.CAVALARIA, 85);
        Personagem jogador1 = new Personagem("Trabalhador 2", UnidadeTipo.TRABALHADOR, 100);

        System.out.println("It is the 41st millenium. For more than a hundred centuries, the Emperor of mankind has sat immobile on the Golden Throne of Earth. He is the master of mankind by the will of the gods and master of a million worlds by the might of his inexhaustible armies.");

        System.out.println("Bem-vindo(a)! Vamos começar com algumas regras básicas!");
        System.out.println("Para ver as suas coordenadas, ");

        jogador1.adicionarItem("Arco");
        jogador1.adicionarItem("Machado");
        jogador1.exibirInventario();

        jogador1.removerItem("Machado");
        jogador1.exibirInventario();

        trabalhador.mover(10, 20);
        trabalhador.pegarRecursos("madeira");

        arqueiro.mover(15, 30);
        arqueiro.atacar(trabalhador);

        ((Combate)arqueiro).attack(trabalhador);

        trabalhador.performarAcao();
        trabalhador.curar();

        cavaleiro.mover(12, 30);
        cavaleiro.pegarRecursos("espada");
        cavaleiro.ganharExperiencia();
    }
}