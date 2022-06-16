/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        
        if(head == null){
            return null;
        }
        
        Node p1 = head;
        Node p2 = null;
        
        while(p1 != null){
            if(p1.child == null){
                p1 = p1.next;
            }
            else{
                
                Node p3 = p1.child;
                while(p3.next != null){
                    p3 = p3.next;
                }
                p3.next = p1.next;
                if(p3.next != null){
                    p3.next.prev = p3;
                }
                
                p1.next = p1.child;
                p1.next.prev = p1;
                p1.child = null;
                
//                 // p2=p1.next;
                
//                 p1.child.prev = p1;
                
                
                
//                 p2.prev = p3;
                
            }
            
        }
        
//         //System.out.println(head.next.next.child.val);
        
        
        
        return head;
    }
    
    //OLD SOLN: Passes run code case
            // while(p1.next != null){
//             if(p1.child != null){
//                 p2=p1.next;
//                 p1.next = p1.child;
//                 p1.child.prev = p1;
                
//                 Node p3 = p1.next;
//                 while(p3.next != null){
//                     p3 = p3.next;
//                 }
//                 p3.next = p2;
//                 p2.prev = p3;
//                 p1.child = null;
//             }
//             p1 = p1.next;
//         }
        
//         //System.out.println(head.next.next.child.val);
}