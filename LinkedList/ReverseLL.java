package LinkedList;
import java.util.Scanner;
class Node1 {
    int data;
    Node1 next;
    public Node1(int data) {
        this.data = data;
        this.next = null;
    }
}
class LinkedList1 {
    private Node1 head;
    public void addToEnd(int data) {
        Node1 newNode = new Node1(data);
        if (head == null) {
            head = newNode;
        } else {
            Node1 current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }
    public void reverse() {
        Node1 prev = null;
        Node1 current = head;
        Node1 next;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }
    public void display() {
        Node1 current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
public class ReverseLL {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList1 myList = new LinkedList1();
        System.out.print("Enter the number of elements in the list: ");
        int n = scanner.nextInt();
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            myList.addToEnd(scanner.nextInt());
        }
        System.out.println("Original list:");
        myList.display();
        myList.reverse();
        System.out.println("Reversed list:");
        myList.display();
        scanner.close();
    }
}