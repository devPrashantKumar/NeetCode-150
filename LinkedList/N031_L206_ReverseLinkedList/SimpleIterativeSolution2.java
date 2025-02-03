package LinkedList.N031_L206_ReverseLinkedList;

//Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

/*
 * Time Complexity O(n)
 * Space Complexity O(n)
 */
class SolutionSimpleIterativeSolution2 {
    public ListNode reverseList(ListNode head) {
        ListNode prev=null;
        ListNode current = head;
        while(current!=null){
            ListNode next = current.next;
            current.next = prev;
            prev=current;
            current=next;
        }
        return prev;
    }

    public void printLinkedList(ListNode head) {
        ListNode current = head;
        while(current!=null){
            System.out.print(current.val+" ");
            current = current.next;
        }
        System.out.println();
    }
}

public class SimpleIterativeSolution2 {
    public static void main(String[] args) {
        SolutionSimpleIterativeSolution2 solution = new SolutionSimpleIterativeSolution2();
        ListNode root1 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        solution.printLinkedList(root1);
        ListNode reverseRoot1 = solution.reverseList(root1);
        solution.printLinkedList(reverseRoot1);

        ListNode root2 = new ListNode(1, new ListNode(2));
        solution.printLinkedList(root2);
        ListNode reverseRoot2 = solution.reverseList(root2);
        solution.printLinkedList(reverseRoot2);
    }
    
}
