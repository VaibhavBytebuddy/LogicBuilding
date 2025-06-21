package LinkedList;

public class ListNode {
    int val;
    ListNode next;

    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    public static ListNode constructLL(int[] arr) {
        if (arr == null || arr.length == 0) return null;

        ListNode head = new ListNode(arr[0]);
        ListNode temp = head;

        for (int i = 1; i < arr.length; i++) {
            temp.next = new ListNode(arr[i]);
            temp = temp.next;
        }

        return head;
    }

    public static void displayLL(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ---> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
