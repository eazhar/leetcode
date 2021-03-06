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
    public ListNode middleNode(ListNode head) {
        //Todo: Code an optimal solution that is O(n) that uses a second pointer that goes double the distance for every single step of the slow pointer
        
        
        //Brute force Technique
        int size = 0;
        ListNode currentNode = head;
        while(currentNode != null){
            size++;
            currentNode = currentNode.next;
        }
        //System.out.println(size);
        currentNode = head;
        for(int i = 0; i<size/2; i++){
            //System.out.println(currentNode);
            currentNode = currentNode.next;
        }
        return currentNode;
        
    }
}