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
    public boolean isPalindrome(ListNode head) {
        
        ListNode slowPtr = head;
        ListNode fastPtr = head;
        
        //Find the midpoint with a faster pointer
        while(fastPtr != null && fastPtr.next != null){
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
        }
        
        //ListNode reversed = slowPtr;
        if(slowPtr.next == null){
            if(slowPtr.val != head.val){
                return false;
            }
        }
        
        //reverse first half of list
        ListNode prevNode = null;
        ListNode currentNode = head;
        ListNode nextNode;
        
        while(currentNode != slowPtr){
            nextNode = currentNode.next;
            currentNode.next = prevNode;
            
            prevNode = currentNode;
            currentNode = nextNode;
                        
            if(nextNode != null){
                nextNode = nextNode.next;
            }
        }
        
//         //double check these lines
        head.next = slowPtr;
        
         if(fastPtr != null && fastPtr.next ==null){
             slowPtr = slowPtr.next;
         }
        
        //compare current values reading forward with second half reading backwards
        currentNode = prevNode;
        // System.out.println("prevNode: " + prevNode.val);
        while(currentNode!=null && slowPtr != null){
            // System.out.println("CurrentNode: " + currentNode.val);
            // System.out.println("slowPtr: " + slowPtr.val);
            
            if(currentNode.val != slowPtr.val){
                return false;
            }
            currentNode = currentNode.next;
            slowPtr = slowPtr.next;
        
        }
        
        return true;
        
    }
}