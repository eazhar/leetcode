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
        ListNode p1 = head;
        ListNode p2 = null;
        
        if(p1 == null){
            return false;
        }
        
        if(p1.next != null){
            p2 = p1.next;
        }
        while(p2!=null){
            if(p2.next == null || p2.next.next == null){
                return false;
            }
            if(p1 == p2){
                return true;
            }
            p1 = p1.next;
            p2 = p2.next.next;
        }
        return false;
    }
}

//ORIGINAL SOLN
 // HashSet <ListNode> h = new HashSet<>();
 //        ListNode currentNode = head;
 //        while(currentNode!=null){
 //            if(h.contains(currentNode)){
 //                return true;
 //            }
 //            else{
 //                h.add(currentNode);
 //            }
 //            currentNode = currentNode.next;
 //        }
 //        return false;