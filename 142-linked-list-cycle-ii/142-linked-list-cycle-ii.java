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
        
        ListNode p1 = head; //slow pointer
        ListNode p2 = null; //fast pointer
        
        if(p1 == null || p1.next == null ){
            return null;
        }
        p2 = p1;
        while(p2 != null && p2.next != null ){
            
            p1 = p1.next;
            p2 = p2.next.next;
            
            //This structure is actually slower (but more readable)?
            if( p2 == null || p2.next == null){
                   return null;
            }
            
            if(p1 == p2){
                break;
            }
            
            //System.out.println("hello");
            
        }
        p1 = head;
        while(p2 != p1){
            p1 = p1.next;
            p2 = p2.next;
        }
        return p1;
    }
}

//OLD SOLN
        // HashSet <ListNode> h = new HashSet<>();
        // ListNode currentNode = head;
        // while(currentNode!=null){
        //     if(h.contains(currentNode)){
        //         return currentNode;
        //     }
        //     else{
        //         h.add(currentNode);
        //     }
        //     currentNode = currentNode.next;
        // }
        // return null;