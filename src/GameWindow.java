import base.KeyEventPress;
import tklibs.SpriteUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;

public class GameWindow extends JFrame {
    // khai báo biến ngoài để dùng chung
    GameCanvas canvas ;



    public GameWindow(){
        //setup window
        this.setSize(800,600);
        this.setResizable(false);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setupEventListtener();
        //init game
        this.canvas = new GameCanvas();
        this.add(canvas);
        this.setVisible(true);
    }

    private void setupEventListtener() {
        this.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_W){
                    KeyEventPress.isUpPress = true;
                }
                if (e.getKeyCode() == KeyEvent.VK_S){
                    KeyEventPress.isDownPress = true;
                }
                if (e.getKeyCode() == KeyEvent.VK_D){
                    KeyEventPress.isRightPress = true;
                }
                if (e.getKeyCode() == KeyEvent.VK_A){
                    KeyEventPress.isLeftPress = true;
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_W) {
                    KeyEventPress.isUpPress = false;
                }
                if (e.getKeyCode() == KeyEvent.VK_S) {
                    KeyEventPress.isDownPress = false;
                }
                if (e.getKeyCode() == KeyEvent.VK_D) {
                    KeyEventPress.isRightPress = false;
                }
                if (e.getKeyCode() == KeyEvent.VK_A) {
                    KeyEventPress.isLeftPress = false;
                }
            }
        });
    }

    void gameLoop(){
        long delay = 1000/60;
        long lastTime = 0;
        while (true){
            // nếu thời gian hiện tại cách thời gian chạy cuối cùng 1 khoảng bằng delay thì vẽ hình ( thời gian hiện tại luôn tăng)
            long currentTime= System.currentTimeMillis();
            if(currentTime - lastTime > delay){
            //logic
            canvas.run();
            this.repaint(); //hàm repain gọi từ pain component
            // mỗi lần chạy xong thì gán t/g hiện tại băng t/g cuối
            lastTime = currentTime;
            }
        }
    }

}
