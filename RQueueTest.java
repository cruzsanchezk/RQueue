/* Copyright (c) 2024, Dave Musicant. All rights reserved.

 You may not post this code, or any code you build using it, in any publicly
 viewable capacity online or otherwise. This means in particular that you may
 not post your solution to this assignment on GitHub or any other online
 location for others to see.

 You are permitted to use this code for purposes of completing class
 assignments.

 You may wish for potential employers to view the work that you have done. You
 are free to send your work as a zip file or other archive directly to potential
 employers, with this comment included, that indicates that they are not
 further able to distribute your work. You may also make your work accessible to
 employers via a website if access to that site is restricted only to specific
 employers, such as via a password. You must ensure that the work is not visible
 to the public at large.
*/

import java.util.NoSuchElementException;

public class RQueueTest {
    public static void main(String[] args)
    {
        // In addition to looking at their code to see if they seem to have the right idea,
        //run tests against their class to verify that it correctly adds, removes, and so on.
        // Try it with just one item in the queue, 2, 3, 4, and more.
        RQueue<Integer> rq = new RQueue<>();
        System.out.println("===========================");
        try {
            rq.peek();
            System.out.println("Test error: exception should have been thrown.");
        } catch (NoSuchElementException e) {
            System.out.println("Peek threw exception as it should.");
        }
        try {
            rq.dequeue();
            System.out.println("Test error: exception should have been thrown.");
        } catch (NoSuchElementException e) {
            System.out.println("Peek threw exception as it should.");
        }
        System.out.println("Adding and then removing one item from the list");
        rq.enqueue(1);
        System.out.println(rq.peek() + " should be 1");
        System.out.println("Show immediate contents (expect 1/null/null): ");
        rq.showImmediateContents();
        System.out.println("\nDisplay (expect 1): ");
        rq.display();
        System.out.println();
        System.out.println(rq.dequeue() + " should be 1");
        try {
            rq.peek();
            System.out.println("Test error: exception should have been thrown.");
        } catch (NoSuchElementException e) {
            System.out.println("Peek threw exception as it should.");
        }
        System.out.println("Show immediate contents (expect null/null/null): ");
        rq.showImmediateContents();
        System.out.println("===========================");

        System.out.println("Adding and then removing two items from the list");
        rq.enqueue(11);
        rq.enqueue(12);
        System.out.println(rq.peek() + " should be 11");
        System.out.println("Show immediate contents (expect 11/null/12): ");
        rq.showImmediateContents();
        System.out.println("\nDisplay (expect 11/12): ");
        rq.display();
        System.out.println();
        System.out.println(rq.dequeue() + " should be 11");
        System.out.println(rq.peek() + " should be 12");
        System.out.println(rq.dequeue() + " should be 12");
        System.out.println("Show immediate contents (expect null/null/null): ");
        rq.showImmediateContents();
        System.out.println("===========================");

        System.out.println("Adding and then removing 5 items from the list");
        for (int i = 21; i < 26; i++) {
            rq.enqueue(i);
        }
        System.out.println(rq.peek() + " should be 21");
        System.out.println("Show immediate contents: (expect 21/object/25)");
        rq.showImmediateContents();
        System.out.println("\nDisplay: (expect 21, 22, 23, 24, 25) ");
        rq.display();
        System.out.println();
        rq.dequeue(); //remove 21
        rq.dequeue(); //remove 22
        rq.dequeue(); //remove 23
        System.out.println("Just removed 21, 22, 23");
        System.out.println("Show immediate contents: (expect 24/null/25)");
        rq.showImmediateContents();
        System.out.println("\nDisplay: (expect 24, 25) ");
        rq.display();
        System.out.println();
        System.out.println(rq.dequeue() + " should be 24");
        System.out.println(rq.peek() + " should be 25");
        rq.dequeue();
        try {
            rq.dequeue();
            System.out.println("Test error: exception should have been thrown.");
        } catch (NoSuchElementException e) {
            System.out.println("Dequeue threw exception as it should.");
        }
        System.out.println("Show immediate contents: (expect null/null/null)");
        rq.showImmediateContents();
        System.out.println("===========================");


    }
}