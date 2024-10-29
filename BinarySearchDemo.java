public class BinarySearchDemo {
	public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if target is present at mid
            if (arr[mid] == target) {
                return mid;
            }

            // If target is smaller, search the left half
            if (target < arr[mid]) {
                right = mid - 1;
            }
            // If target is larger, search the right half
            else {
                left = mid + 1;
            }
        }

        // Target not present in the array
        return -1;
    }

	public static void main(String[] args) {
		int[] arr = {2, 4, 7, 8, 10, 21, 22, 23, 24, 26, 30};
        int target = 23;

        int result = binarySearch(arr, target);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found.");
        }
		

	}

}
