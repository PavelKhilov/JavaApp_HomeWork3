package task;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

// Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое этого списка.
public class Task3 {
    public static void main(String[] args) {
        List<Integer> listOfNumbers = new ArrayList<>();
        Random random = new Random();
        for(int i = 0; i < 10; i++) {
            listOfNumbers.add(random.nextInt(100));
        }
        System.out.println(listOfNumbers);
        Collections.sort(listOfNumbers);
        System.out.println("Минимальное значение: " + listOfNumbers.get(0));
        System.out.println("Максимальное значение: " + listOfNumbers.get(listOfNumbers.size() - 1));
        int sum = 0;
        for (Integer listOfNumber : listOfNumbers) {
            sum += listOfNumber;
        }
        System.out.println("Среднее значение: " + sum/listOfNumbers.size());
    }
}
