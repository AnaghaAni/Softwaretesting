package ArrayList;


import java.util.Deque;
import java.util.LinkedList;
import java.util.ListIterator;


public class UnderstandingDequeue {

	public static void main(String[] args) {
		Deque<String> deque = new LinkedList<>();
		
		deque.addFirst("Ram");
		deque.addFirst("Rahul");
		deque.addLast("Divya");
		deque.offerFirst("Anil");
		deque.offerLast("Devi");
		
		System.out.println("\nDeque After Insertions:");
        for (String s : deque) {
            System.out.println(s);
        }
        
        System.out.println("\nFirst Element: " + deque.peekFirst());
        System.out.println("Last Element: " + deque.peekLast());
        
        System.out.println("\nRemoved First: " + deque.pollFirst());
        System.out.println("Removed Last: " + deque.pollLast());
        
        System.out.println("\nDeque After Removals:");
        for (String s : deque) {
            System.out.println(s);
        }

        
        ListIterator<String> it = ((LinkedList<String>) deque).listIterator();
        System.out.println("\nIterating forward\n");
        while(it.hasNext())
        {
        	System.out.println(it.next());
        }
		
        System.out.println("\nIterating backward\n");
        while( it.hasPrevious())
        {
        	System.out.println(it.previous());
        }

	}

}
