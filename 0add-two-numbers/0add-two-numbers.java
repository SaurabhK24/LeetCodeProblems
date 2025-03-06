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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {   
        ListNode dummy = new ListNode(0);
        ListNode type = dummy; 

        int carry = 0;
        while(l1 != null || l2 != null){
            int l1val = (l1 != null) ?  l1.val : 0;
            int l2val = (l2 != null) ?  l2.val : 0;

            int currentSum = l1val + l2val + carry;
            int num = currentSum % 10;
            carry = currentSum / 10;

            ListNode newNode = new ListNode(num);
            type.next = newNode;
            type = type.next;

            if(l1 != null){
                l1 = l1.next;
            }
            if(l2 != null){
                l2 = l2.next;
            }
        }

        if(carry > 0){
            ListNode finalNode = new ListNode(carry);
            type.next = finalNode;
        } 

        return dummy.next;
    }

}