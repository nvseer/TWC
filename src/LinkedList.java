import java.util.List;

/**
 * Created by Nik on 4/28/2016.
 */
public class LinkedList {

    Node head;

    class Node  {
        String data;
        Node next;
        Node(String d)
        {
            this.data = d;
            this.next = null;
        }
        // Override the toString() method to print Node value
        @Override
        public String toString(){
            return this.data;
        }
    }

    // Create method to add Node elements
    public void add(String data)
    {
        Node anotherNode = new Node(data);
        anotherNode.next = head;
        head = anotherNode;
    }

    // Method to find the 5th from the end of the linked list
    public static void findFifthElementFromEnd(LinkedList linkedList) {
        Node p1, p2;

        if (linkedList == null && linkedList.head == null) {
            return;
        }

        p1 = p2 = linkedList.head;

        for (int j = 0; j < 4; ++j) {
            if (p2 == null) {
                return;
            }
            p2 = p2.next;
        }

        while (p2.next != null) {
            p1 = p1.next;
            p2 = p2.next;
        }
        System.out.println("The head of the list is: " + linkedList.head.toString());
        System.out.println("The 5th element from the end of the list is: " + p1.toString());
    }

    // Method to compare two lists for the same integer elements regardless of order
    public static void CompareLists(List one, List two){
        if (one.containsAll(two)){
            System.out.println("Both lists contain all the same elements.");
        } else {
            System.out.println("Both lists do not contain all the same elements.");
        }
    }

}
