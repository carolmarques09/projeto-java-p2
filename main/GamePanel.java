package main;

import javax.swing.*;
import java.awt.*;
import entity.Jogador;

public class GamePanel extends JPanel implements Runnable{

    // CONFIGURAÇÕES DE TELA
    final int originalTileSize = 16; // 16x16 tile
    final int scale = 3;

    public final int TileSize = originalTileSize * scale; // 48x48 tile
    final int maxScreenCol = 16;
    final int maxScreenRow = 12;
    final int screenWidth = TileSize * maxScreenCol; // 768 pixels
    final int screenHeight = TileSize * maxScreenRow; // 576 pixels

    // FPS
    int FPS = 60;

    KeyHandler KeyH = new KeyHandler();
    Thread gameThread;
    Jogador jogador = new Jogador(this, KeyH);

    // Posição padrão do jogador
    int playerX = 100;
    int playerY = 100;
    int playerSpeed = 4;

    public GamePanel() {
        this.setPreferredSize(new Dimension(screenWidth, screenHeight));
        this.setBackground(Color.BLACK);
        this.setDoubleBuffered(true);
        this.addKeyListener(KeyH);
        this.setFocusable(true);
    }

    public void startGameThread() {
        gameThread = new Thread(this);
        gameThread.start();
    }

    @Override
    public void run() {

        double drawInterval = 1000000000 / FPS; // 0.0166666 segundos
        double nextDrawTime = System.nanoTime() + drawInterval;

        while (gameThread != null) {
            // 1: O loop vai atualizar informações como o posicionamento do personagem
            update();

            // 2: Em seguida, irá recarregar a tela com as informações novas
            repaint();

            try {
                double remainingTime = nextDrawTime - System.nanoTime();
                remainingTime = remainingTime / 1000000;

                if (remainingTime < 0) {
                    remainingTime = 0;
                }

                Thread.sleep((long) remainingTime);

                nextDrawTime += drawInterval;

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public void update() {

        jogador.update();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D)g;

        jogador.draw(g2);

        g2.dispose();
    }
}