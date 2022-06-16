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
        
        
        HashSet <ListNode> h = new HashSet<>();
        ListNode currentNode = head;
        while(currentNode!=null){
            if(h.contains(currentNode)){
                return currentNode;
            }
            else{
                h.add(currentNode);
            }
            currentNode = currentNode.next;
        }
        return null;
        
//         ListNode p1 = head;
//         ListNode p2 = null;
        
//         if(p1 == null || p1.next == null ){
//             return null;
//         }
//         p2 = p1.next;
//         while(p2.next!=null && p2.next.next != null){
            
//             //This structure is actually slower (but more readable)?
//             if(p2.next == null || p2.next.next == null){
//                            return null;
//                        }
            
//             if(p1 == p2){
//                 return p2;
//             }
//             p1 = p1.next;
//             p2 = p2.next.next;
            
            
//         }
//         return null;
    }
}