package DAY11;

class Main {

    public static String categorizeBox(int length, int width, int height, int mass) {

        boolean bulky = length >= 10000 || width >= 10000 || height >= 10000
                || (long) length * width * height >= 1000000000;

        boolean heavy = mass >= 100;

        if (bulky && heavy)
            return "Both";
        else if (bulky)
            return "Bulky";
        else if (heavy)
            return "Heavy";
        else
            return "Neither";
    }

    static void main() {
        System.out.println(categorizeBox(1000, 35, 700, 300));
    }
}