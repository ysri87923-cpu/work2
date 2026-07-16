package DAY11;

public class Main {

    public static char repeatedCharacter(String s) {
        boolean[] seen = new boolean[26];

        for (char c : s.toCharArray()) {
            if (seen[c - 'a']) {
                return c;
            }
            seen[c - 'a'] = true;
        }

        return ' ';
    }

    public static void main(String[] args) {
        System.out.println(repeatedCharacter("abccbaacz"));
    }
}