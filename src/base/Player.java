package base;

import tklibs.SpriteUtils;

import java.awt.image.BufferedImage;

public class Player extends GameObject {

    public Player(){
        this.image = SpriteUtils.loadImage("assets/images/players/straight/0.png");
        this.x = 200;
        this.y = 300;
    }

    public void move (int x, int y){
        this.x += x;
        this.y += y;
    }

    @Override
    public  void run (){
        if (KeyEventPress.isUpPress){
            this.move(0,-1);
        }
        if (KeyEventPress.isDownPress){
            this.move(0,1);
        }
        if (KeyEventPress.isRightPress){
            this.move(1,0);
        }
        if (KeyEventPress.isLeftPress){
            this.move(-1, 0);
        }
    }
}
