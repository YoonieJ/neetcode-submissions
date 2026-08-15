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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode curr1 = list1;
        ListNode curr2 = list2;
        ListNode head = null;
        ListNode curr = head;

        if (curr1 == null && curr2 == null){
            return null;
        }
        else if (curr1 == null){
            return curr2;
        }
        else if (curr2 == null){
            return curr1;
        }

        while (curr1 != null && curr2 != null){
            if(head == null){
                if (curr1.val >= curr2.val){
                    head = curr2;
                    curr2 = curr2.next;
                }
                else if (curr1.val < curr2.val){
                    head = curr1;
                    curr1 = curr1.next;
                }
                curr = head;
            }
            else{
                if (curr1.val >= curr2.val){
                    curr.next = curr2;
                    curr2 = curr2.next;
                }
                else if (curr1.val < curr2.val){
                    curr.next = curr1;
                    curr1 = curr1.next;
                }
                if(head == null){
                    continue;
                }
                curr = curr.next;
            }
        }
        if (curr1 == null){
            while(curr2 != null){
                curr.next = curr2;
                curr2 = curr2.next;
                curr = curr.next;
            }
        } else if (curr2 == null){
            while(curr1 != null){
                curr.next = curr1;
                curr1 = curr1.next;
                curr = curr.next;
            }
        }
        curr.next = null;
        return head;
    }
}