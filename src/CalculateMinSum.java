public class CalculateMinSum {
    public int execute(int[] numbers) {

        CalculateTotalSum total = new CalculateTotalSum();
        FindMax maxFinder = new FindMax();

        int totalSum = total.execute(numbers);
        int max = maxFinder.execute(numbers);

        return totalSum - max;
    }
}
