/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    
    public ListNode findCycle(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
            
            if (slow == fast){
                return slow;
            }
        }
        return null;
    }
    
    
    public ListNode detectCycle(ListNode head) {
        
        if (head == null || head.next == null){
            return null;
            
        }
        ListNode start = head;
        ListNode check = findCycle(head);
        
        if (check == null){
            return null;
        }
        
        while(check != start){ 
            check = check.next;
            start = start.next;
                
        }
        
        return start;
            
        }
        
    }
