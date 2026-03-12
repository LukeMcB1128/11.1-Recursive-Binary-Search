public class Main{
    public static void main(String[] args){
        int[] sortedArray = {1, 3, 5, 7, 9, 11, 13};
        int target = 7;
        int result = binarySearch(sortedArray, target, 0, sortedArray.length - 1);
        System.out.println("Target found at index: " + result);
    }    public static int binarySearch(int[] array, int target, int left, int right) {
        // Base case: search space is empty
        if (left > right) {
            return -1;
        }

        int mid = (left + right) / 2;

        if (array[mid] == target) {
            return mid; // Target found
        } else if (target < array[mid]) {
            return binarySearch(array, target, left, mid - 1); // Search left half
        } else {
            return binarySearch(array, target, mid + 1, right); // Search right half
        }
    }
}