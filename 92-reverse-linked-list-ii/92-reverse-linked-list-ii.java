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
    public ListNode reverseBetween(ListNode head, int left, int right) {
                
        ListNode prevNode=null, currentNode = head, nextNode=null;
        ListNode p1=new ListNode();
        
        if(currentNode.next == null || left==right){
            return head;
        }
        
        
        p1.next = head;
        // p2 = p1.next;
        prevNode = p1;
        
        for(int i = 0; i<left-1; i++){
            prevNode = currentNode;
            currentNode = currentNode.next;
        }

        
        for(int i = 0; i<right-left; i++){
            // System.out.println("hello6");
            nextNode = currentNode.next;
            currentNode.next = nextNode.next;
            nextNode.next = prevNode.next;
            prevNode.next = nextNode;
        }

        
        
        return p1.next;
        
        
    }
}