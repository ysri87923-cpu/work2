class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        Set<Character> set = new HashSet<>();
        for (char c : jewels.toCharArray()) set.add(c);
        int count = 0;
        for (char s : stones.toCharArray()) if (set.contains(s)) count++;
        return count;
    }
}
