package DAY10;

class Main {

    public static boolean canAliceWin(int[] nums) {
        int single = 0;
        int doubleDigit = 0;

        for (int num : nums) {
            if (num < 10)
                single += num;
            else
                doubleDigit += num;
        }

        return single != doubleDigit;
    }

    static void main() {
        int[] nums = {5, 5, 10};
        System.out.println(canAliceWin(nums));
    }
}