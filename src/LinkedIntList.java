/**
 * The LinkedIntList class represents a singly linked list of integer values.
 * It provides methods to add elements to the front of the list.
 *
 * @author Braeodn Billingsley
 */
public class LinkedIntList {
    private class Node {
        int data;
        Node next;

    }

    //set up the head Node;
    private Node head;

    // set up the size field.
    private int size;

    // add a constructor to initialize fields.

    /**
     * The LinkedIntList class represents a singly linked list of integer values.
     * It provides methods to add elements to the front and end of the list.
     */
    public LinkedIntList() {
        head = null;
        size = 0;
    }

    /**
     * Adds an element to the front of the linked list.
     *
     * @param value the value to be added to the front of the list
     */
    public void addFront(int value) {
        // set up a new node.
        Node newOne = new Node();
        if (head == null) {
            // The list is currently empty
            head = newOne; // set the new start of the linkedlist
            size++;

        } else {
            // The list currently has some nodes in it.
            newOne.next = head; // link the new head to the old head to add to the original list.
            head = newOne; // set head to the front of the list again.
        }
    }

    /**
     * Adds an element to the end of the linked list.
     *
     * @param value the value to be added to the list
     */
    public void addBack(int value) {

    }
}
