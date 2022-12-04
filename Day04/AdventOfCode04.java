package Day04;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class AdventOfCode04 {
    public static void main(String[] args) throws FileNotFoundException {
        File data = new File("Day04/AdventOfCode04Data.txt");
        Scanner scan = new Scanner(data);

        int partOneCount = 0;
        int partTwoCount = 0;

        while (scan.hasNextLine()) {
            String[] currentLine = scan.nextLine().split(",");

            String[] firstPart = currentLine[0].split("-");
            String[] secondPart = currentLine[1].split("-");

            int firstIntOfFirstPart = Integer.valueOf(firstPart[0]);
            int lastIntOfFirstPart = Integer.valueOf(firstPart[1]);

            int firstIntOfSecondPart = Integer.valueOf(secondPart[0]);
            int lastIntOfSecondPart = Integer.valueOf(secondPart[1]);

            // part one
            if (firstIntOfFirstPart >= firstIntOfSecondPart && lastIntOfFirstPart <= lastIntOfSecondPart) {
                partOneCount++;
            } else if (firstIntOfSecondPart >= firstIntOfFirstPart && lastIntOfSecondPart <= lastIntOfFirstPart) {
                partOneCount++;
            }

            // part two
            if ((firstIntOfFirstPart >= firstIntOfSecondPart && firstIntOfFirstPart <= lastIntOfSecondPart) || (firstIntOfSecondPart >= firstIntOfFirstPart && firstIntOfSecondPart <= lastIntOfFirstPart)) {
                partTwoCount++;
            }
        }
        System.out.println("Part one count: " + partOneCount);
        System.out.println("Part two count: " + partTwoCount);
    }
}
