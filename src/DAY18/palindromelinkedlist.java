package DAY18;

class palindromelinkedlist {
    public boolean isPalindrome(ListNode head) {

        java.util.ArrayList<Integer> list = new java.util.ArrayList<>();

        while (head != null) {
            list.add(head.val);
            head = head.next;
        }

        int i = 0;
        int j = list.size() - 1;

        while (i < j) {
            if (!list.get(i).equals(list.get(j)))
                return false;

            i++;
            j--;
        }

        return true;
    }
}