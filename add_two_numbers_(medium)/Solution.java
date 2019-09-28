/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    //initialize variables
    double s1=0, s2=0;
    double c1=0, c2=0, f=0;
    ListNode head1 = l1;
    ListNode head2 = l2;
    //find lengths of linked lists
    while(l1.next != null){
        c1+=(l1.val * Math.pow(10,s1));
        l1 = l1.next;
        s1++;
    }
    c1+=(l1.val * Math.pow(10,s1));
    s1++;
    while(l2.next != null){
        c2+=(l2.val * Math.pow(10,s2));
        l2 = l2.next;
        s2++;
    }
    c2+=(l2.val * Math.pow(10,s2));
    s2++;
    //get a final integer value
    f = c1+c2;
    //send final value to linked list
    l1 = head1;
    l2 = head2;
    if(s1>s2){
        l2 = l1;
        //add the rest of the digits
        for(double i=0;i<s1;i++){
            l1.val = (int) ((f/(Math.pow(10,i)))%10);
            if(l1.next!=null) l1 = l1.next;
        }
        if(((int) ((f/(Math.pow(10,s1)))%10))!=0){
        ListNode tail = new ListNode( (int) ((f/(Math.pow(10,s1)))%10));
        l1.next = tail;
        }
        l1 = l2;
        return l1;
    }else{
        l1 = l2;
        //add the rest of the digits
        for(double i=0;i<s2;i++){
            l2.val = (int) ((f/(Math.pow(10,i)))%10);
            if(l2.next!=null) l2 = l2.next;
        }
        if(((int) ((f/(Math.pow(10,s2)))%10))!=0){
        ListNode tail = new ListNode( (int) ((f/(Math.pow(10,s2)))%10));
        l2.next = tail;
        }
        l2 = l1;
        return l2;
    }
    }
    

}