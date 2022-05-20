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
        int size = 0;
        
        ListNode prevNode = null;
        ListNode currentNode = head;
        ListNode nextNode;
        
        if(currentNode == null || currentNode.next == null){
            return head;
        }
        nextNode = head.next;
        
        while(currentNode != null){
            currentNode.next = prevNode;
            
            prevNode = currentNode;
            currentNode = nextNode;
            
            if(nextNode != null){
                nextNode = nextNode.next;
            }
            
            
        }
        return prevNode;
        
    }
}