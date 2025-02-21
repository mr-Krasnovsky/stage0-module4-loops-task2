package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        if (printToInclusive >= 2) {
            int number = 2;

            while (number <= printToInclusive) {
                boolean isPrime = true;
                int i = 2;

                while (i <= Math.sqrt(number)) {
                    if (number % i == 0) {
                        isPrime = false;
                        break;
                    }
                    i++;
                }

                if (isPrime) {
                    System.out.println(number);
                }

                number++;
            }
        }
    }
}
