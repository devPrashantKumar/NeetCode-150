package LinkedList.N037_L002_AddTwoNumbers;

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

class SolutionMostOptimisedApproach {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = null;
        ListNode tail = null;
        int carry = 0;
        while (l1 != null || l2 != null) {
            int num1 = 0;
            if (l1 != null) {
                num1 = l1.val;
                l1 = l1.next;
            }
            int num2 = 0;
            if (l2 != null) {
                num2 = l2.val;
                l2 = l2.next;
            }
            int sum = num1 + num2 + carry;
            carry = sum / 10;
            if (head == null) {
                head = tail = new ListNode(sum % 10);
            } else {
                tail.next = new ListNode(sum % 10);
                tail = tail.next;
            }
        }
        if (carry != 0) {
            tail.next = new ListNode(carry);
        }
        return head;
    }

    public void printLinkedList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }
}

public class MostOptimisedApproach {
    public static void main(String[] args) {
        SolutionMostOptimisedApproach solution = new SolutionMostOptimisedApproach();
        ListNode l11 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode l12 = new ListNode(5, new ListNode(6, new ListNode(4)));

        solution.printLinkedList(l11);
        solution.printLinkedList(l12);

        ListNode sumList1 = solution.addTwoNumbers(l11, l12);
        solution.printLinkedList(sumList1);

        System.out.println("-----------------------------------------------");
        ListNode l21 = new ListNode(0);
        ListNode l22 = new ListNode(0);

        solution.printLinkedList(l21);
        solution.printLinkedList(l22);

        ListNode sumList12 = solution.addTwoNumbers(l21, l22);
        solution.printLinkedList(sumList12);

        System.out.println("-----------------------------------------------");
        ListNode l31 = new ListNode(9,
                new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9)))))));
        ListNode l32 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))));

        solution.printLinkedList(l31);
        solution.printLinkedList(l32);

        ListNode sumList3 = solution.addTwoNumbers(l31, l32);
        solution.printLinkedList(sumList3);
    }
}
