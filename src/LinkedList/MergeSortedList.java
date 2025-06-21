package LinkedList;

public class MergeSortedList {
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(-1);  // dummy node to simplify logic
        ListNode current = dummy;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                current.next = new ListNode(list1.val);
                list1 = list1.next;
            } else {
                current.next = new ListNode(list2.val);
                list2 = list2.next;
            }
            current = current.next;
        }

        // Append remaining nodes
        while (list1 != null) {
            current.next = new ListNode(list1.val);
            list1 = list1.next;
            current = current.next;
        }

        while (list2 != null) {
            current.next = new ListNode(list2.val);
            list2 = list2.next;
            current = current.next;
        }

        return dummy.next;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 12, 23, 42};  // Sorted input arrays
        int[] arr2 = {2, 3, 10, 22};

        ListNode list1 = ListNode.constructLL(arr1);
        ListNode list2 = ListNode.constructLL(arr2);

        ListNode merged = mergeTwoLists(list1, list2);
        ListNode.displayLL(merged);
    }
}
