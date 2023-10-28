import java.util.EnumSet;

public class Newclass2 {

    public static void main (String[] args) {
        int[] numbers = new int[100];
        int i = 0;
        int number = 0;
        while (i < numbers.length) {
            if (number % 13 == 0 || number % 17 == 0) {
                numbers[i] = number;
                i++;
            }
number++;
        }
        for (int n : numbers) {
            System.out.println(n);
        }
    }
    }
