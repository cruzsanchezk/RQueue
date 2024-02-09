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

public interface CarlQueue<T> {
    // Add item to the queue
    void enqueue(T item);

    // Return next item to come out of queue, without changing it.
    // If the queue is empty, throw NoSuchElementException.
    T peek();

    // Remove the next item from the queue. If the queue is empty,
    // throw NoSuchElementException.
    T dequeue();

    // Print the entire contents of the queue to the screen to help you in
    // debugging and us in grading. If the integers 1, 2, 3, 4, 5 were enqueued
    // in that order, this method should print out "1 2 3 4 5".
    void display();

    // Display just the contents of this particular object for grading and
    // debugging purposes. (This is essentially a non-recursive version of the
    // display method.
    void showImmediateContents();
}