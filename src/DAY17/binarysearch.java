package DAY17;

public class binarysearch {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50, 60};
        int key = 40;

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            if (arr[mid] == key) {
                System.out.println("Element Found at Index: " + mid);
                return;
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        System.out.println("Element Not Found");
    }
}