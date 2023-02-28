import java.util.ArrayList;
import java.util.Collections;
import java.util.IntSummaryStatistics;
import java.util.Random;

public class Main{
    public static void main(String[] args) {
        Random rnd = new Random();
        ArrayList<Integer> list = new ArrayList<>(10);
        for (int i = 0; i < 10; i++) {
            list.add(rnd.nextInt(10));
        }
        System.out.println(list.toString());
        list.removeIf(n -> (n % 2 == 0));
        System.out.println(list.toString());
        MaxMin();
    }
    private static void MaxMin() {
        Random rnd = new Random();
        ArrayList<Integer> list = new ArrayList<>(10);
        for (int i = 0; i < 10; i++) {
            list.add(rnd.nextInt(10));
        }
        System.out.println(list.toString());
        IntSummaryStatistics stats = list.stream()
                                        .mapToInt((x) -> x)
                                        .summaryStatistics();
        System.out.println(stats);                                
    }
}