package main;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Day1 {

    private List<Integer> elf_calories = new LinkedList();

    public static void main(String[] args) {

        Day1 day1 = new Day1();
        day1.processInput();
        day1.first();
        day1.second();
    }

    private void second() {
        Collections.sort(elf_calories);
        int size = elf_calories.size();
        int sum = 0;

        // top three carrying calories elves
        sum = elf_calories.get(size-1)
                + elf_calories.get(size-2)
                + elf_calories.get(size-3);

        System.out.println(sum);
    }

    private void first() {
        int aux = elf_calories.get(0);
        for (Integer elf_calory : elf_calories) {
            if (elf_calory > aux)
                aux = elf_calory;
        }

        System.out.println(aux);
    }

    private void processInput() {
        int temp_addition = 0;
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String line = sc.nextLine();

            if (line.equalsIgnoreCase("q")) {
                elf_calories.add(temp_addition);
                break;
            }

            if (line.equalsIgnoreCase("")) {
                elf_calories.add(temp_addition);
                temp_addition = 0;
            } else {
                temp_addition += Integer.parseInt(line);
            }
        }
    }
}
