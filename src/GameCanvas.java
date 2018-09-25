import base.Background;
import base.Player;
import tklibs.SpriteUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

//canvas bảng vẽ
public class GameCanvas extends JPanel {
    Background background;
    Player player;
//    int backgroundY = 0;

    public GameCanvas(){
//      this.background = SpriteUtils.loadImage("assets/images/background/0.png");
        background = new Background();
//      this.player = SpriteUtils.loadImage("assets/images/players/straight/0.png");
        player = new Player();
    }

    public void run(){
//      this.y -= 1;

        background.run();
        player.run();
    }

    public void render (Graphics g){
//      g.drawImage(player,20,20, null);

        background.render(g);
        player.render(g);
    }


    //painComponent : là hàm vẽ các thay đổi
    // graphics : đóng vai trò là bút vẽ, là 1 phần trong Jpanel

    @Override
    protected void paintComponent(Graphics g) {
//        g.drawImage(background,0, backgroundY,null);
//        g.drawImage(player,20,20, null);
//        backgroundY = backgroundY - 1;
//          background.render(g);
//          g.drawImage(player,20,20, null);
        this.render(g);
    }
}
