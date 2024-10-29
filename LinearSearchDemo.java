public class LinearSearchDemo {
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Target found at index i
            }
        }
        return -1; // Target not found in the array
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 7, 8, 10, 21, 22, 23, 24, 26, 30};
        int target = 23;

        int result = linearSearch(arr, target);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found.");
        }
    }
}