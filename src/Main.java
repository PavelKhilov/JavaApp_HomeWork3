import task.Task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int[] a = { 5, 1, 6, 2, 3, 4 };

//        int[] a = new int[];
//        Random random = new Random();
//        for(int i = 0; i < 20; i++) {
//            a.(random.nextInt(100));
//        }
        System.out.println(Arrays.toString(a));
        Task1.mergeSort(a, a.length);
        System.out.println(Arrays.toString(a));
    }
}