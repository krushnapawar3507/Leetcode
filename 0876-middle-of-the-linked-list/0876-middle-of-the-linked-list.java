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
// class Solution {
//     public ListNode middleNode(ListNode head) {
//         int count = 0;
//         ListNode temp = head;
//         while(temp != null){
//             count++;
//             temp = temp.next;
//         }
//         int middle = count/2;
//         temp = head;
//         while(middle > 0){
//             temp = temp.next;
//             middle--;
//         }
//         return temp;
//     }
// }

class Solution {
    public ListNode middleNode(ListNode head) {
        int count = 0;
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
                    }
                    return slow;
    }
}