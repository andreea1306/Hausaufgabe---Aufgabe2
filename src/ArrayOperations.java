public class ArrayOperations {

    public int findMax(int[] numbers) {
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }

    public int findMin(int[] numbers) {
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        return min;
    }

    public int calculateTotalSum(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum;
    }

    public int calculateMaxSum(int[] numbers) {
        int totalSum = calculateTotalSum(numbers);
        int min = findMin(numbers);
        return totalSum - min;
    }

    public int calculateMinSum(int[] numbers) {
        int totalSum = calculateTotalSum(numbers);
        int max = findMax(numbers);
        return totalSum - max;
    }
}
