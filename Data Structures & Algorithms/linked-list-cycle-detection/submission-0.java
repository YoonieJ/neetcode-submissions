/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode curr = head;
        Map<ListNode, Integer> visited = new HashMap<>();

        while (curr != null){
            if (visited.get(curr) == null){
                visited.put(curr, 1);
                curr = curr.next;
            }
            else {
                return true;
            }
        }
        return false;
    }
}
