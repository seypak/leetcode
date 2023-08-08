/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Map<ListNode, Integer> map = new LinkedHashMap<ListNode, Integer>();
        
        while(headA != null) {
            map.put(headA, map.getOrDefault(headA, 0) +1);
            headA = headA.next;
        }
        while(headB != null) {
            map.put(headB, map.getOrDefault(headB, 0) +1);
            headB = headB.next;
        }

        ListNode result = null;
        for(ListNode node : map.keySet()) {
            if(map.get(node) > 1) {
                result = node;
                break;
            }
        }
        return result;
    }
}