public class newday28 {
    public static void main(String[] args) {

//        int x1 = 4;
//        int x2 = 6;

        int[] numbers = {1, 2, 3, 4, 5};


        System.out.println(arraySum(numbers));
    }

    static void seyHello() {
        System.out.println("Hello World");
    }

    static int sum() {
        return 50 + 50;

    }

    static String stroka(String s1) {
        return s1;
    }

    static int dlinastroki(String s2) {
        return s2.length();
    }

    static int dvachisla(int s3, int s4) {
        return s3 * s4;
    }

    static int znacheniy(int x4, int x5) {

        if (x4 > x5) {
            return x4;
        } else {
            return x5;
        }
    }


    static int arraySum(int[] numbers) {
        int result = 0;
        for (int i = 0; i < numbers.length; i++) {
            result = result + numbers[i];
        }
        return result;
    }

}






