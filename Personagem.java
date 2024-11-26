public class Personagem {
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

    public Personagem(String nome, String raca, String genero, int idade, String classe, int saude, int ataque, int defesa, int velocidade, int nivel, int recursos, int experiencia, int x, int y) {
        this.nome = nome;
        this.raca = raca;
        this.genero = genero;
        this.idade = idade;
        this.classe = classe;
        this.saude = saude;
        this.ataque = ataque;
        this.defesa = defesa;
        this.velocidade = velocidade;
        this.nivel = 1;
        this.recursos = recursos;
        this.experiencia = 0;
        this.x = 0;
        this.y = 0;
    }

    public void mover(int novoX, int novoY) {
        this.x = novoX;
        this.y = novoY;
        System.out.println(nome + " se moveu para (" + x + ", " + y + ").");
    }

    public void atacar(Personagem alvo) {
        int dano = Math.max(this.ataque - alvo.defesa, 0);
        alvo.tomarDano(dano);
        System.out.println(nome + " atacou " + alvo.nome + " e causou " + dano + " de dano.");
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

    public void curar(int quantidade) {
        this.saude += quantidade;
        System.out.println(nome + "se curou e agora tem" + this.saude + " de saúde!");
    }

    public void ganharExperiencia(int exp) {
        this.experiencia += exp;
        if (this.experiencia >= 100) {
            this.nivel++;
            this.experiencia -= 100;
            System.out.println(nome + "subiu para o nível " + this.nivel + "!");
        }
    }

}
