import tklibs.test1;

import java.util.Scanner;

/**
 * Created by huynq on 7/4/17.
 */
public class Program {
    public static void main(String[] args) {
//        System.out.println("hello world");
//        int x = 1; // những biến mầu vàng thì vẫn là kiểu nguyên thủy
//        double a = 2;
//        String abc = "abc"; // những kiểu có mầu trắng là 1 đối tượng

//        test1 t1 = new test1();
//        test1 t2 = new test1(1);
//        t1.print();
//        t2.print();

        GameWindow gameWindow = new GameWindow();
        gameWindow.gameLoop();
    }
}
