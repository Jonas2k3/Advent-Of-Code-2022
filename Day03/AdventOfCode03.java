package Day03;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.FileStore;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class AdventOfCode03 {
    public static void main(String[] args) throws FileNotFoundException {
        File data = new File("Day03/AdventOfCodeData03.txt");
        Scanner scan = new Scanner(data);

        HashMap<String, Integer> priority = new HashMap<>();
        //lower case values
        priority.put("a", 1);        priority.put("b", 2);
        priority.put("c", 3);        priority.put("d", 4);
        priority.put("e", 5);        priority.put("f", 6);
        priority.put("g", 7);        priority.put("h", 8);
        priority.put("i", 9);        priority.put("j", 10);
        priority.put("k", 11);       priority.put("l", 12);
        priority.put("m", 13);       priority.put("n", 14);
        priority.put("o", 15);       priority.put("p", 16);
        priority.put("q", 17);       priority.put("r", 18);
        priority.put("s", 19);       priority.put("t", 20);
        priority.put("u", 21);       priority.put("v", 22);
        priority.put("w", 23);       priority.put("x", 24);
        priority.put("y", 25);       priority.put("z", 26);

        //upper case values
        priority.put("A", 27);       priority.put("B", 28);
        priority.put("C", 29);       priority.put("D", 30);
        priority.put("E", 31);       priority.put("F", 32);
        priority.put("G", 33);       priority.put("H", 34);
        priority.put("I", 35);       priority.put("J", 36);
        priority.put("K", 37);       priority.put("L", 38);
        priority.put("M", 39);       priority.put("N", 40);
        priority.put("O", 41);       priority.put("P", 42);
        priority.put("Q", 43);       priority.put("R", 44);
        priority.put("S", 45);       priority.put("T", 46);
        priority.put("U", 47);       priority.put("V", 48);
        priority.put("W", 49);       priority.put("X", 50);
        priority.put("Y", 51);       priority.put("Z", 52);

        int sum = 0;

        while (scan.hasNextLine()) {
            ArrayList<String> firstHalf = new ArrayList<>();
            ArrayList<String> secondHalf = new ArrayList<>();
            String currentLine[] = scan.nextLine().split("");

            for (int i = 0; i < (currentLine.length / 2); i++) {
                firstHalf.add(currentLine[i]);
            }

            for (int i = (currentLine.length / 2); i < currentLine.length; i++) {
                secondHalf.add(currentLine[i]);
            }

            for(String s : firstHalf){
                if(secondHalf.contains(s)){
                    sum += priority.get(s);
                    break;
                }
            }

        }

        System.out.println(sum);
    }
}
