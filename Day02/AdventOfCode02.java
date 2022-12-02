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

        int partOneScore = 0;
        int partTwoScore = 0;

        // A is rock (1)
        // B is paper (2)
        // C is scissors (3)

        // X is loss (0)
        // Y is draw (3)
        // Z is win (6)

        while (scan.hasNextLine()) {

            ArrayList<String> currentLine = new ArrayList<>();
            String[] line = scan.nextLine().split(" ");
            currentLine.add(line[0]);
            currentLine.add(line[1]);

            // opponent chooces scissors
            if (currentLine.get(0).equals("C")) {
                if (currentLine.get(1).equals("X")) {
                    partOneScore += 7;
                    partTwoScore += 2;
                } else if (currentLine.get(1).equals("Y")) {
                    partOneScore += 2;
                    partTwoScore += 6;
                } else {
                    partOneScore += 6;
                    partTwoScore += 7;
                }
            }

            // opponent chooces rock
            else if (currentLine.get(0).equals("A")) {
                if (currentLine.get(1).equals("X")) {
                    partOneScore += 4;
                    partTwoScore += 3;
                } else if (currentLine.get(1).equals("Y")) {
                    partOneScore += 8;
                    partTwoScore += 4;
                } else {
                    partOneScore += 3;
                    partTwoScore += 8;
                }
            }

            // opponent chooces paper
            else if (currentLine.get(0).equals("B")) {
                if (currentLine.get(1).equals("X")) {
                    partOneScore += 1;
                    partTwoScore += 1;
                } else if (currentLine.get(1).equals("Y")) {
                    partOneScore += 5;
                    partTwoScore += 5;
                } else {
                    partOneScore += 9;
                    partTwoScore += 9;
                }
            }
        }

        System.out.println("Part one score: " + partOneScore);
        System.out.println("Part two score: " + partTwoScore);
    }
}
