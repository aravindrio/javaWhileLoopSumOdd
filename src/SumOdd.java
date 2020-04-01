public class SumOdd {

    public static void main(String[] args) {
        sumOdd(1, 100);
        sumOdd(1,11);
    }

    public static boolean isOdd(int number) {
        if (number <= 0) {
            return false;
        }
        if (number % 2 != 0) {
            return true;
        }
        return false;
    }


    public static int sumOdd(int start, int end) {
        int sum = 0;
        while ((start > 0) && (end > 0) && (end >= start)) {
            while (start <= end) {
                if (isOdd(start)) {
                    sum += start;

                }
                start++;

            }

            System.out.println("sum: " + sum);
            return sum;
        }return -1;

    }
}


