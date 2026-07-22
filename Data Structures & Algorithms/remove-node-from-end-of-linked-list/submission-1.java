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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode start=head;
        int count=0;
        while(start!=null){
            count++;
            start=start.next;
        }
        System.out.println(count);
        int x= count-n;
        ListNode prev=head;
        ListNode nextToNext=null;
        if(x==0){
            head=prev.next;
            prev.next=null;
            return head;
        }else if(x==count-1){
            while(prev.next.next!=null){
                prev=prev.next;
            }
            prev.next=null;
        }else{
            for(int i=0;i<x-1;i++){
                prev=prev.next;
                
            }
            nextToNext=prev.next.next;
            prev.next.next=null;
            prev.next=null;
            prev.next=nextToNext;
        }
        return head;
    }
    
}
