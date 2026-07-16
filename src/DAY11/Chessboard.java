package DAY11;

class Main {

    public static boolean squareIsWhite(String coordinates) {
        int col = coordinates.charAt(0) - 'a';
        int row = coordinates.charAt(1) - '1';

        return (col + row) % 2 == 1;
    }

    static void main() {
        System.out.println(squareIsWhite("a1"));
    }
}