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
        Map<Integer, ListNode> map = new HashMap<Integer, ListNode>();
        int lastCount = 1;
        ListNode lastNode = head;
        // 1. ListNode.next가 null인 마지막 숫자 추출
        while(lastNode != null) {
            map.put(lastCount, lastNode);
            lastNode = lastNode.next;
            lastCount++;
        }
        // 2. 마지막 숫자/2+1 이 middle
        int middle = (lastCount-1)/2+1;
        // 3. 해당 번호값의 ListNode 추출
        ListNode middleNode = map.get(middle);
        return middleNode;
    }
}