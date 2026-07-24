class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<>());
        for (int num : nums) {
            List<List<Integer>> newRes = new ArrayList<>();
            for (List<Integer> curr : res) {
                List<Integer> temp = new ArrayList<>(curr);
                temp.add(num);
                newRes.add(temp);
            }
            res.addAll(newRes);
        }
        return res;
    }
}
