package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        int count = 0;
        while (count <= Math.pow(multiplyByAndToInclusive, 2)) {
            System.out.println(count);
            count = count + multiplyByAndToInclusive;
        }
    }
}
