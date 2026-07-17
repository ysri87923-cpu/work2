package DAY16;

public class forlooplogn {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50, 60, 70};
        int key = 40;

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            if (arr[mid] == key) {
                System.out.println("Found at index " + mid);
                break;
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
    }
}