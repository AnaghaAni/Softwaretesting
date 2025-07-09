package ArrayList;

import java.util.Queue;
import java.util.LinkedList;

public class UnderstandingQueue {

    public static void main(String[] args) {
        // Create a Queue using LinkedList (FIFO order)
        Queue<String> queue = new LinkedList<>();

        // Enqueue elements using offer() — safe method
        queue.offer("Anu");
        queue.offer("Akhila");
        queue.offer("Anil");
        queue.offer("Jinu");

        System.out.println("\t\t\tQueue\n");
        for (String q : queue) {
            System.out.println(q); // Iterates and prints all queue elements
        }

        // Retrieve but do NOT remove the head of the queue
        System.out.println("\nCurrent Head : " + queue.peek());

        // Remove the head of the queue (FIFO) — equivalent to dequeue
        System.out.println("Removed : " + queue.poll());

        // Show the new head after removal
        System.out.println("Current Head : " + queue.peek());

        System.out.println("\n\t\t\tAfter Removing Head\n");
        for (String q : queue) {
            System.out.println(q);
        }

        // Display current size of the queue
        System.out.println("\nSize: " + queue.size());

        // Check if the queue is empty
        if (queue.isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            System.out.println("Queue is not empty"); // ❗Logic was reversed earlier
        }

        System.out.println("\n\t\t\tChecking if 'Anil' is in Queue\n");
        if (queue.contains("Anil")) {
            System.out.println("Element found");
        } else {
            System.out.println("Element not found");
        }

        // Remove the next head using remove() (throws exception if queue is empty)
        System.out.println("Removed : " + queue.remove());

        // Clear all elements from the queue
        queue.clear();
        System.out.println("Cleared Queue: " + queue); // Should print: []

        // Add a new element after clearing
        queue.add("Jinu");
        System.out.println("Queue after re-adding: " + queue); // [Jinu]
    }
}

