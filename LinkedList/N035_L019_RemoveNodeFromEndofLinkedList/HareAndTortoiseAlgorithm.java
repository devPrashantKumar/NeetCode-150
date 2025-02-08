package LinkedList.N035_L019_RemoveNodeFromEndofLinkedList;

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

class SolutionHareAndTortoiseAlgorithm {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode hare = head;
        ListNode tortoise = head;
        for(int i=0;i<n;i++){
            if(hare==null) return null;
            hare = hare.next;
        }

        ListNode prev=null;
        while(hare!=null){
            prev = tortoise;
            tortoise = tortoise.next;
            hare = hare.next;
        }

        if(prev==null){
            head = head.next;
        }else{
            prev.next = tortoise.next;
        }
        return head;
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

public class HareAndTortoiseAlgorithm {
    public static void main(String[] args) {
        SolutionHareAndTortoiseAlgorithm solution = new SolutionHareAndTortoiseAlgorithm();
        ListNode root1 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));
        int n1 = 2;
        solution.printLinkedList(root1);
        ListNode removedNodeRoot1 = solution.removeNthFromEnd(root1,n1);
        solution.printLinkedList(removedNodeRoot1);

        System.out.println("-----------------------------------------------");

        ListNode root2 = new ListNode(5);
        int n2 = 1;
        solution.printLinkedList(root2);
        ListNode removedNodeRoot2 = solution.removeNthFromEnd(root2,n2);
        solution.printLinkedList(removedNodeRoot2);

        System.out.println("-----------------------------------------------");

        ListNode root3 = new ListNode(1, new ListNode(2));
        int n3 = 2;
        solution.printLinkedList(root3);
        ListNode removedNodeRoot3 = solution.removeNthFromEnd(root3,n3);
        solution.printLinkedList(removedNodeRoot3);

    }
}
