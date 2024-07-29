package LinkedList;
import java.util.Scanner;
class Node {
    int data;
    Node next;
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
class LinkedList {
    private Node head;
    public void addToEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }
    public void deleteFromBeginning() {
        if (head != null) {
            head = head.next;
        }
    }
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
public class BLinkedList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList myList = new LinkedList();
        System.out.print("Enter the number of elements in the list: ");
        int n = scanner.nextInt();
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            myList.addToEnd(scanner.nextInt());
        }
        System.out.println("Linked list contents:");
        myList.display();
        System.out.println("Deleting the first node...");
        myList.deleteFromBeginning();
        myList.display();
    }
}