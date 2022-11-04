package MineSweeperGame;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final Scanner s = new Scanner(System.in);

        System.out.print("Satır sayısını giriniz:  ");
        int line = s.nextInt();

        System.out.print("Sutun sayısını giriniz:  ");
        int column = s.nextInt();

        MineSweeper MineGame = new MineSweeper(line,column);
        MineGame.run();

        s.close();
    }
}
