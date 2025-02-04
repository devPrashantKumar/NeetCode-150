package LinkedList.N033_L141_LinkedListCycleDetection;

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
    To detect a cycle in a linked list, 
    we can use Floyd’s Cycle Detection Algorithm (also called the slow and fast pointer approach).
    Time Complexity - O(n)
    Space Complexity - O(1) , only constant space pointers are used
*/
class SolutionFloyedCycleDetectionAlgo {
    public boolean hasCycle(ListNode head){
        ListNode tortoise = head;
        ListNode hare  = head;

        while(hare!=null && hare.next!=null){
            tortoise = tortoise.next;
            hare = hare.next.next;
            if(tortoise==hare){
                return true;
            }
        }
        return false;
    }
}

public class FloyedCycleDetectionAlgo {
    public static void main(String[] args) {
        SolutionFloyedCycleDetectionAlgo solution = new SolutionFloyedCycleDetectionAlgo();
        ListNode node11 = new ListNode(3);
        ListNode node12 = new ListNode(2);
        ListNode node13 = new ListNode(0);
        ListNode node14 = new ListNode(-4);

        ListNode head1 = node11;
        node11.next = node12;
        node12.next = node13;
        node13.next = node14;
        node14.next = node12;

        System.out.println("Cycle Exists : "+solution.hasCycle(head1));

        System.out.println("-----------------------------------------------");

        ListNode node21 = new ListNode(1);
        ListNode node22 = new ListNode(2);

        ListNode head2 = node21;
        node21.next = node22;
        node22.next = node21;

        System.out.println("Cycle Exists : "+solution.hasCycle(head2));

        System.out.println("-----------------------------------------------");

        ListNode head3 = new ListNode(1);;

        System.out.println("Cycle Exists : "+solution.hasCycle(head3));

    }
}
