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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode finalList = null;
        ListNode ptr1 = l1;
        ListNode ptr2 = l2;
        ListNode tail = new ListNode();
        int carry = 0;
        
        while(ptr1!=null || ptr2!=null || carry > 0){
            int digit1, digit2;
            if(ptr1 != null){
                digit1 = ptr1.val;
            }else{
                digit1 = 0;
            }
            if(ptr2 != null){
                digit2 = ptr2.val;
            }else{
                digit2 = 0;
            }
                
            int nextDigit = (digit1+digit2+carry)%10;
            carry = (digit1+digit2+carry)/10;
            
            

            ListNode newNode = new ListNode(nextDigit);
            // System.out.println(finalList == null);
            // System.out.println(carry);
            if(finalList == null){
                finalList = newNode;
                tail = newNode;
            }else{
                tail.next = newNode;
                tail = tail.next;
            }
            if(ptr1 != null){
                ptr1 = ptr1.next;
            }
            if(ptr2 != null){
                ptr2 = ptr2.next; 
            }
            
              
        }
        // finalList = finalList.next;
        return finalList;
    }
        
        
}