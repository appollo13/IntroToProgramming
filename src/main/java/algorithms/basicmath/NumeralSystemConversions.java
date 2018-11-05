package algorithms.basicmath;

/*
6 (1.1.6) Numeral system conversions

  - task: Convert a given decimal number (int, >= 0) to a BaseN numerical system, where n (> 1) is a param
  - task: Convert a given BaseN number, where n (> 1) is a param, to a decimal number
 */
public class NumeralSystemConversions {

    public static String toBaseN(int n, int number) {

        int result = 0;
        int position = 1;

        while (number > 0) {
            int ostatyk = number % n;
            result = result + (ostatyk * position);
            number /= n;
            position *= 10;
        }
        return String.valueOf(result);
    }

    public static int fromBaseN(int n, String number) {

        int pow = 0;
        int result = 0;
        int rNumber = Integer.valueOf(number);

        while (rNumber > 0) {
            int ostatyk = rNumber % 10;
            result = (int) (result + ostatyk * (Math.pow(n, pow)));
            rNumber /= 10;
            pow++;
        }
        System.out.println(result);
        return result;
    }
}
