
public class SumAverage {

    /**
     * Computes sum of running integers from a lower bound to an upper bound.
     *
     * @param lowerBound lower bound
     * @param upperBound upper bound
     * @return sum of integers
     */
    public static int sum(int lowerBound, int upperBound) {
        int result = 0;
        for (int i = lowerBound; i <= upperBound; i++) {
            result += i;
        }
        return result;
    }

    /**
     * Computes sum of running integers from a lower bound to an upper bound within an array.
     *
     * @param numbers running integers array
     * @return sum of integers
     */
    public static int sum(int[] numbers) {
        int result = 0;
        for (int a : numbers) {
            result += a;
        }

        return result;
    }

    /**
     * Computes average of running integers from a lower bound to an upper bound.
     *
     * @param lowerBound lower bound
     * @param upperBound upper bound
     * @return average of integers
     */
    public static double average(int lowerBound, int upperBound) {
        double result;
        while (true) {
            result = (double) (lowerBound + upperBound) / 2;
            break;
        }
        return result;
    }

    /**
     * Computes average of running integers from a lower bound to an upper bound within an array.
     *
     * @param numbers running integers array
     * @return average of integers
     */
    public static double average(int[] numbers) {
        int sum = 0;
        int i = 0;
        double result;

        do {
            sum += numbers[i];
            i++;
        }
        while (i  < numbers.length);

        result = (double) sum / i;
        return result;
    }

}