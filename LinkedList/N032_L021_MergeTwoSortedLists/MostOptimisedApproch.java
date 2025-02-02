package LinkedList.N032_L021_MergeTwoSortedLists;

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

class SolutionMostOptimisedApproch {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = null;
        ListNode tail = null;

        // Merging both lists while both have elements
        while (list1 != null && list2 != null) {
            ListNode node;
            if (list1.val <= list2.val) {
                node = list1;
                list1 = list1.next;
            } else {
                node = list2;
                list2 = list2.next;

            }
            node.next = null;
            if (tail == null) {
                head = node;
                tail = node;
            } else {
                tail.next = node;
                tail = tail.next;
            }
        }

        // Append remaining nodes of list1
        if (list1 != null) {
            if (tail == null) {
                head = list1;
                tail = list1;
            } else {
                tail.next = list1;
            }
        }

        // Append remaining nodes of list2
        if (list2 != null) {
            if (tail == null) {
                head = list2;
                tail = list2;
            } else {
                tail.next = list2;
            }
        }

        return head;
    }
}

public class MostOptimisedApproch {

}
