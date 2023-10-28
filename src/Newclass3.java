public class Newclass3 {

    public static void main(String[] args) {
for (int num: square (5)) {
            System.out.println(num);
        }
    }

    static int [] square (int bound) {
        int [] number = new int[bound];

        for (int i=0; i < number.length; i++){
            number[i] = i * i;
        }
        return number;
    }
}