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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode currentNode=head, returnNode;
        ListNode internalNode;//=currentNode.next;
        
        returnNode = currentNode;
        
        if(currentNode == null || currentNode.next == null){
            return head;
        }
        
        
        while(currentNode.next != null){
            if(currentNode.val == currentNode.next.val && currentNode.next.next != null){
                internalNode = currentNode.next;
                while(currentNode.val == internalNode.val && internalNode.next != null){
                    currentNode.next = internalNode.next;
                    internalNode = internalNode.next;
                }
            }
            else if(currentNode.val == currentNode.next.val && currentNode.next.next == null){
                currentNode.next = null;
            }else{
                currentNode = currentNode.next;
            }
            
        }
        
        return returnNode;
    }
}