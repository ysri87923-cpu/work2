class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        dfs(s, 0, new ArrayList<>(), res);
        return res;
    }
    private void dfs(String s, int start, List<String> path, List<List<String>> res) {
        if (start == s.length()) {
            res.add(new ArrayList<>(path));
            return;
        }
        for (int end = start+1; end <= s.length(); end++) {
            String sub = s.substring(start, end);
            if (isPalindrome(sub)) {
                path.add(sub);
                dfs(s, end, path, res);
                path.remove(path.size()-1);
            }
        }
    }
    private boolean isPalindrome(String str) {
        int l = 0, r = str.length()-1;
        while (l < r) if (str.charAt(l++) != str.charAt(r--)) return false;
        return true;
    }
}
