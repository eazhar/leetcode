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
    public boolean hasCycle(ListNode head) {
        HashMap <ListNode, Integer> h = new HashMap<>();
        ListNode currentNode = head;
        while(currentNode!=null){
            if(h.containsKey(currentNode)){
                return true;
            }
            else{
                h.put(currentNode,1);
            }
            currentNode = currentNode.next;
        }
        return false;
    }
}