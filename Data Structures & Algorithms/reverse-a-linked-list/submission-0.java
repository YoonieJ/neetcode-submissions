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
    public ListNode reverseList(ListNode head) {
        if (head == null){
            return null;
        }
        
        Deque<ListNode> stack = new ArrayDeque<>();
        ListNode curr = head;

        while (curr != null){
            stack.push(curr);
            curr = curr.next;
        }

        ListNode newHead = stack.pop();
        ListNode newCurr = newHead;

        while (!stack.isEmpty()){
            newCurr.next = stack.pop();
            newCurr = newCurr.next;
        }
        newCurr.next = null;
        return newHead;
    }
}