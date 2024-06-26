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
    public boolean isPalindrome(ListNode head) {
        ListNode slow  = head;
        ListNode fast = head;
        
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        
        fast = head;
        slow = reverseList(slow);

        while(slow != null){
            if(slow.val != fast.val){
                return false;
            }
            
            slow = slow.next;
            fast = fast.next;
        }
        
        return true;
        
    }
    public ListNode reverseList(ListNode head){
    // 2 -> 4 -> 6 -> 4 -> 2 -> null
    ListNode curr = head;
    ListNode prev = null;
    ListNode holder = null;

    while(curr != null){
      holder = curr.next;
      curr.next = prev;
      prev = curr;
      curr = holder;
    }

    return prev;
  }

}