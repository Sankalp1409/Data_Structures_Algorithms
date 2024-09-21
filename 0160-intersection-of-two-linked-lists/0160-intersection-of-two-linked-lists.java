/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
        ListNode ptr1=headA;
        ListNode ptr2=headB;
        
        while(ptr1!=ptr2)
        {
            if(ptr1==null) ptr1=headB;
            if(ptr2==null) ptr2=headA;
            if(ptr1==ptr2)
                break;
            ptr1=ptr1.next;
            ptr2=ptr2.next;
            
        }
        return ptr1;
    }
}