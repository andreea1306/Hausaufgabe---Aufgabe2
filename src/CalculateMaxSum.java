public class CalculateMaxSum {
    public int execute(int[] numbers) {

        CalculateTotalSum total = new CalculateTotalSum();
        FindMin minFinder = new FindMin();

        int totalSum = total.execute(numbers);
        int min = minFinder.execute(numbers);

        return totalSum - min;
    }
}
