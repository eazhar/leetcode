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
        HashMap <Integer, Integer> h = new HashMap<>();
        ListNode currentNode = head;
        while(currentNode!=null){
            if(h.containsKey(currentNode.hashCode())){
                return true;
            }
            else{
                h.put(currentNode.hashCode(),1);
            }
            currentNode = currentNode.next;
        }
        return false;
    }
}