/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        
        
        //Tail condition -- will never happen
        if(node.next == null){
            return;
        }
        
        //grab the node 2 ahead (commented out, not great practice but testing to make sure logic is sound)
       // ListNode node_next_next = node.next.next;
        
        //replace current node value with next node value
        node.val = node.next.val;
        
        //middle node ignored and garbage collector deals with it
        
        //set current node's next to saved node
        node.next = node.next.next;
        
        
        
    }
}