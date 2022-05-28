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
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next != null && fast.next.next !=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode rightHalf = slow.next;
        slow.next = null;
        ListNode leftHalf = sortList(head);
        rightHalf = sortList(rightHalf);
        
        return merge(leftHalf,rightHalf);
    }
    public ListNode merge(ListNode p, ListNode q){
        ListNode p1 = p;
        ListNode p2 = q;
        
        ListNode returnedHead = null;
        ListNode tail = null;
        ListNode lower = null;
        
        while(p1 != null || p2 != null){
            if(p1!=null && p2 != null){
                if(p1.val < p2.val){
                    lower = p1;
                    p1=p1.next;                 
                }else{
                    lower = p2;
                    p2 = p2.next;
                
                }
            }else if(p1 != null){
                lower = p1;
                p1 = p1.next;
            }else{
                lower = p2;
                p2 = p2.next;
            }
            if(returnedHead == null){
                returnedHead = lower;
                tail = lower;
            }else{
                tail.next = lower;
                tail = tail.next;
            }   
        }
        return returnedHead;
    }
}