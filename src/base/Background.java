package base;

import tklibs.SpriteUtils;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Background extends GameObject {


    public Background (){
        this.image = SpriteUtils.loadImage("assets/images/background/0.png");
        this.x = 0;
        this.y = 0;
    }

    //overrider hàm run để thêm thay đổi của lớp con
    @Override
    public void run(){
        if(this.y >= (this.image.getHeight() - 600)* -1 ){
            this.y -= 1;
        }

    }


}
