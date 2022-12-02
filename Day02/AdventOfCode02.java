package Day02;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class AdventOfCode02 {
    public static void main(String[] args) throws FileNotFoundException {
        File data = new File("Day02/AdventOfCode02Data.txt");
        Scanner scan = new Scanner(data);

        ArrayList<String> opponentPlay = new ArrayList<>();
        ArrayList<String> selfPlay = new ArrayList<>();
        int[] input;

        int score = 0;

        // Sores:
        // 2 points for paper
        // 1 for rock
        // 3 for scissors
        // win is 6
        // loss is 0
        // draw is 3

        // opponent rock is A
        // self rock is X
        // opponent paper is B
        // own paper is Y
        // opponent scissors is C
        // self scissors is Z

        while (scan.hasNextLine()) {

            ArrayList<String> currentLine = new ArrayList<>();
            String [] line = scan.nextLine().split(" ");
            currentLine.add(line[0]);
            currentLine.add(line[1]);

            //opponent chooces scissors
            if(currentLine.get(0).equals("C")){
                if(currentLine.get(1).equals("X")){
                    System.out.println("player won!");
                    score += 7;
                } else if(currentLine.get(1).equals("Z")){
                    System.out.println("It's a draw");
                    score += 6;
                } else{
                    System.out.println("Player lost!");
                    score += 2;
                }
            } 

            //opponent chooces rock
            else if(currentLine.get(0).equals("A")){
                if(currentLine.get(1).equals("Y")){
                    System.out.println("Player won!");
                    score += 8;
                } else if(currentLine.get(1).equals("X")){
                    System.out.println("It's a draw!");
                    score += 4;
                } else {
                    System.out.println("Player lost!");
                    score += 3;
                }
            } 

            //opponent chooces paper
            else if(currentLine.get(0).equals("B")){
                if(currentLine.get(1).equals("Z")){
                    System.out.println("Player won!");
                    score += 9;
                } else if(currentLine.get(1).equals("Y")){
                    System.out.println("It's a draw!");
                    score += 5;
                } else{
                    System.out.println("Player lost!");
                    score += 1;
                }
            }
        }

        System.out.println("The player achieved a final score of " + score);
    }
}
