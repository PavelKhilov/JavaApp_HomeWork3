package task;
// Пусть дан произвольный список целых чисел, удалить из него чётные числа

import java.util.*;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> listOfNumbers = new ArrayList<>();
        Random random = new Random();
        for(int i = 0; i < 20; i++) {
            listOfNumbers.add(random.nextInt(100));
        }
        System.out.println(listOfNumbers);
        for(int i = 0; i < listOfNumbers.size(); i++) {
            if(listOfNumbers.get(i) % 2 == 0) {
                listOfNumbers.remove(i);
                i--;
            }
        }
        System.out.println(listOfNumbers);
    }


}
