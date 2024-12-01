package Objetos;

public interface recursos {
    void mover(int x, int y);
    void atacar(recursos target);
    void pegarRecursos(String resourceType);
    void pegar(String objeto);
    void usar(String objeto);
    void soltar(String objeto);
    void descartar(String objeto);
}
