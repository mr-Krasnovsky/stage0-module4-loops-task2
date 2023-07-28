package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        if (multiplyByAndToInclusive == 0) {
            System.out.print("");
        } else {
            int i = 0;
            while (i < Math.abs(multiplyByAndToInclusive) + 1) {
                System.out.println(i * multiplyByAndToInclusive);
                i++;
            }
        }
    }
}
