package MineSweeperGame;

import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    private String [][] yes_mine;
    private String [][] no_mine;
    private int row_no;
    private int col_no;
    private boolean isFinish;
    private boolean isWin;
    private int conditionToWin;

    public MineSweeper(int row, int col){
        this.yes_mine = new String[row][col];
        this.no_mine = new String[row][col];
        this.row_no = row;
        this.col_no = col;
        this.isFinish = false;
        this.isWin = false;
    }

    public void CreatingGameBoard(){
        for (int i = 0; i < yes_mine.length; i++){
            for (int j = 0; j < yes_mine[i].length; j++){
                yes_mine[i][j] = "-";
                no_mine[i][j] = "-";
            }
        }
    }

    public void PlacingMine(){
        Random rand = new Random();
        int n = (row_no * col_no) / 4;
        conditionToWin = (row_no * col_no) - n;

        for (int i = 0; i < n; i++){
            int randRow = rand.nextInt(row_no);
            int randCol = rand.nextInt(col_no);

            if (yes_mine[randRow][randCol] == "*") i--;
            else yes_mine[randRow][randCol] = "*";
        }
    }

    public void print (int a){
        if (a == 1){
            System.out.println("Maden Yeri: => => ");
            print(yes_mine);
            System.out.println("==  ==  ==  ==  ==  ==  ==  ==  ==");
            System.out.println("Mayın tarlası Oyunu'na Hoş Geldiniz   :')     ");
        } else {
            System.out.println("===============================");
            print(no_mine);
        }
    }

    public void print(String[][] arr){
        for (String[] temp: arr){
            for (String temp2 : temp) System.out.print(temp2 + " ");
            System.out.println("");
        }
    }

    public int Control(int line, int column){
        int count = 0;
        for (int i = -1; i < 2; i++){
            for (int j = -1; j < 2; j++){
                if (line + i < 0 || column + j < 0 || line + i >= row_no || column + j >= col_no || (row_no == 0 && col_no == 0)) continue;
                if (yes_mine[line + i][column + j].equals("*")) count++;
            }
        }
        return  count;
    }

    public void run(){
        CreatingGameBoard();
        PlacingMine();
        print(1);
        Scanner s = new Scanner(System.in);
        while (!isFinish){
            print(0);
            System.out.print("Satır giriniz:  ");
            int line = s.nextInt();
            System.out.print("Sutun giriniz:  ");
            int column = s.nextInt();

            if (line < 0 || line >= row_no || column < 0 || column >= col_no){
                System.out.println("Hatalı giriş tekrar dene!");
                continue;
            } else {
                if (yes_mine[line][column].equals("*")){
                    System.out.println("Oyun bitti");
                    System.out.println(" ");
                    isFinish = true;
                    isWin = false;
                    break;
                } else {
                    conditionToWin--;
                }

                if (conditionToWin <= 0){
                    System.out.println("Tebrikler oyunu kazandınız...");
                    System.out.println(" ");
                    isWin = true;
                    isFinish = true;
                    break;
                } else {
                    int count = Control(line, column);
                    yes_mine[line][column] = String.valueOf(count);
                }
            }
        }
    }
}


