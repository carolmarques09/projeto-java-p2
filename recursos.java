package Objetos;

public interface recursos {
    void mover(int x, int y);
    void atacar(recursos target);
    void pegarRecursos(String resourceType);
    void pegar();
    void usar();
    void soltar();
    void descartar();
}
