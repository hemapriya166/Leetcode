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
    public ListNode detectCycle(ListNode head) {
        ListNode Fast=head;
        ListNode slow=head;
        ListNode temp=head;
        while(Fast!=null&&Fast.next!=null){
            slow=slow.next;
            Fast=Fast.next.next;
            if(Fast==slow){
                slow=head;
                break;
            }
            temp=temp.next;
        }
        if(Fast==null||Fast.next==null){
            return null;
        }
        
            while(slow!=Fast){
                slow=slow.next;
                Fast=Fast.next;
            }
        
        return slow;
        
    }
}