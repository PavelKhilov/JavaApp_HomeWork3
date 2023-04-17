package task;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

// Реализовать разность массивов и симметрическую разность.
public class Task4 {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        Random random1 = new Random();
        for(int i = 0; i < 10; i++) {
            list1.add(random1.nextInt(100));
        }
        System.out.println("Массив 1: " + list1);
        List<Integer> list2 = new ArrayList<>();
        Random random2 = new Random();
        for(int i = 0; i < 10; i++) {
            list2.add(random2.nextInt(100));
        }
        System.out.println("Массив 2: " + list2);
        List<Integer> intersection = new ArrayList<>();
        List<Integer> diff1 = list1;
        List<Integer> diff2 = list2;
        for (int i = 0; i < list1.size(); i++) {
            Integer integer = list1.get(i);
            for (int j = 0; j < list2.size(); j++) {
                Integer value = list2.get(j);
                if (integer == value) {
                    intersection.add(integer);
                    diff1.remove(i);
                    diff2.remove(j);
                }
            }
        }
        System.out.println("Пересечение массивов: " + intersection);
        System.out.println("Разность массива 1 и массива 2: " + diff1);
        System.out.println("Разность массива 2 и массива 1: " + diff2);
    }
}
