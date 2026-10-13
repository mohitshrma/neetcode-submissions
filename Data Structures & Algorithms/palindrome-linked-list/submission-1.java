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
    public boolean isPalindrome(ListNode head) 
    {
        //Find the middle element
        ListNode slow = head, fast = head;
        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }

        //Reverse the second half
        ListNode prev = null;
        while(slow != null)
        {
            ListNode next = slow.next;
            slow.next = prev;
            prev = slow;
            slow = next;
        }

        // Compare the first half with reversed second half
        ListNode left = head, right = prev;
        while(right != null)
        {
            if(left.val != right.val)
            {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }
}