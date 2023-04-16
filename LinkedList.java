/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package book;

/**
 *
 * @author LENOVO
 */
// Node definition
class Node {
    // package access data so class List can access it directly
    Object data;  //info
    Node next; // link

    // Constructor: Create a Node that refers to Object o.
    Node(Object obj) { //this( o, null );
        data = obj;
        next = null;
    }

    // Constructor: Create a Node that refers to Object o and
    // to the next Node in the List.
    Node(Object o, Node nextNode) {
        data = o;         // this node refers to Object o
        next = nextNode;  // set next to refer to next
    }

    // Return a reference to the Object in this node
    Object getObject() {
        return data;
    }

    // Return the next node
    Node getNext() {
        return next;
    }
}

// LinkedList definition
public class LinkedList {
    private Node head;
    private Node tail;
    private Node newNode; // use to traverse the list

    // Constructor: Construct an empty List
    public LinkedList() {
        head = tail = newNode = null;
    }

    // Method isEmpty() - Return true if the List is empty
    public boolean isEmpty() {
        return head == null;
    }

    // Return First element
    public Object getFirst() {
        if (isEmpty())
            return null;
        else {
            newNode = head;
            return newNode.data;
        }
    }

    // Return next element
    public Object getNext() {
        if (newNode != tail) {
            newNode = newNode.next;
            return newNode.data;
        } else
            return null;
    }

    // Display the content of linked list - traverse the linked list
    public void print() {
        if (isEmpty()) {
            System.out.println("The list is Empty ");
            // return;
        }

        System.out.print("The contents of the linked list is: \n");

        Node current = head;

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }

        System.out.println("\n");
    }

    // Insert an Object at the front of the List
    // If List is empty, head and tail will refer to
    // the same object. Otherwise, head refers to new node.

    //  public void insertAtFront( Object insertItem )
    public void insertAtFront(Object insertItem) {

        newNode = new Node(insertItem); // create a newnode
        if (head == null)   // List is empty
            head = tail = newNode;
        else {
            newNode.next = head; // Step 1
            head = newNode; // Step 2
        }
    }

    // Method size()
    // { Write the method definition here }
    public int size() {
        int size = 0;

        if (!isEmpty()) {
            Node traversalNode = head;

            do {
                size++;
                traversalNode = traversalNode.getNext();
            } while (traversalNode != null);
        }

        return size;
    }

    // insertAtBack()
    // { Write the method definition here }
    public void insertAtBack(Object insertItem) {
        Node insertNode = new Node(insertItem);

        if (isEmpty()) {
            head = tail = insertNode;
        }
        else {
            tail.next = insertNode;
            tail = insertNode;
        }
    }

    //remove FromFront()
    // { Write the method definition here }
    public void removeFromFront() {
        if (!isEmpty()) {
            head = head.getNext();
        }
    }

    //removeAtBack()
    // { Write the method definition here }
    public void removeAtBack() {
       if (!isEmpty()) {
           Node traversalNode = head;
           Node secondLastNode = null;

           while (traversalNode.getNext() != null) {
               secondLastNode = traversalNode;
               traversalNode = traversalNode.getNext();
           }

           tail = secondLastNode;
           secondLastNode.next = null;
       }
    }
}