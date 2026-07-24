class SmallestInfiniteSet {
    private int cur;
    private PriorityQueue<Integer> heap;
    private Set<Integer> added;
    public SmallestInfiniteSet() {
        cur = 1;
        heap = new PriorityQueue<>();
        added = new HashSet<>();
    }
    public int popSmallest() {
        if (!heap.isEmpty()) {
            int val = heap.poll();
            added.remove(val);
            return val;
        }
        return cur++;
    }
    public void addBack(int num) {
        if (num < cur && !added.contains(num)) {
            heap.add(num);
            added.add(num);
        }
    }
}
