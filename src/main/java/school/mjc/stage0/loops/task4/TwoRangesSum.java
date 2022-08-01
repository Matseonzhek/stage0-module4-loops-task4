package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public static void main(String[] args) {
        new TwoRangesSum().printSumOfTwoRanges(10, 10);
    }

    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {
        int skippedSum = 0;
        int countedSum = 0;

        int caseCheck = numberToSkip > lastInRow ? 1 : lastInRow < 0 ? 2 : 3;
        switch (caseCheck) {
            case (1) -> System.out.println("number to skip is bugger then the last");
            case (2) -> System.out.println("last number in row is negative");
            case (3) -> {
                for (int i = 0; i <= lastInRow; i++) {
                    if (i <= numberToSkip) {
                        skippedSum += i;
                        continue;
                    }
                    countedSum += i;
                }
                System.out.println("skipped sum is " + skippedSum);
                System.out.println("counted sum is " + countedSum);
            }
        }

    }
}
