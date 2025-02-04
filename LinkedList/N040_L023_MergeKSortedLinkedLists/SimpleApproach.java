package LinkedList.N040_L023_MergeKSortedLinkedLists;

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
 * Time Complexity - O(m) m:sum of number of elements in all lists
 * Space Complexity - O(1)
 */
class SolutionSimpleApproach {
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode head = null;
        ListNode tail = null;
        boolean isNodeleft = true;
        while (isNodeleft) {
            isNodeleft = false;
            int minimum = Integer.MAX_VALUE;
            int index = -1;
            for(int i=0;i<lists.length;i++){
                if(lists[i]!=null && lists[i].val<minimum){
                    minimum = lists[i].val;
                    index=i;
                    isNodeleft=true;
                }
            }
            if(isNodeleft){
                if (head == null) {
                    head = tail = lists[index];
                } else {
                    tail.next = lists[index];
                    tail = tail.next;
                }
                lists[index] = lists[index].next;
                tail.next=null;
            }   
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

public class SimpleApproach {
    public static void main(String[] args) {
        SolutionSimpleApproach solution = new SolutionSimpleApproach();
        ListNode l11 = new ListNode(1, new ListNode(4, new ListNode(5)));
        ListNode l12 = new ListNode(1, new ListNode(3, new ListNode(4)));
        ListNode l13 = new ListNode(2, new ListNode(6));

        solution.printLinkedList(l11);
        solution.printLinkedList(l12);
        solution.printLinkedList(l13);

        ListNode sumList1 = solution.mergeKLists(new ListNode[]{l11,l12,l13});
        solution.printLinkedList(sumList1);

        System.out.println("-----------------------------------------------");

        ListNode sumList12 = solution.mergeKLists(new ListNode[]{});
        solution.printLinkedList(sumList12);

        System.out.println("-----------------------------------------------");

        ListNode sumList3 = solution.mergeKLists(new ListNode[]{null});
        solution.printLinkedList(sumList3);
    }
}
