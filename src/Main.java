public class Main {
    public static void main(String[] args) {

        int[] numbers = {4, 8, 3, 10, 17};

        FindMax findMax = new FindMax();
        FindMin findMin = new FindMin();
        CalculateMaxSum calcMaxSum = new CalculateMaxSum();
        CalculateMinSum calcMinSum = new CalculateMinSum();

        int max = findMax.execute(numbers);
        int min = findMin.execute(numbers);
        int maxSum = calcMaxSum.execute(numbers);
        int minSum = calcMinSum.execute(numbers);

        System.out.println("Numerele din array:");
        for (int n : numbers) {
            System.out.print(n + " ");
        }
        System.out.println("\n");

        System.out.println("Maximul: " + max);
        System.out.println("Minimul: " + min);
        System.out.println("Suma maxima (n-1 numere): " + maxSum);
        System.out.println("Suma minima (n-1 numere): " + minSum);
    }
}
