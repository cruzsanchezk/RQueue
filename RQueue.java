import java.util.NoSuchElementException;

public class RQueue<T> implements CarlQueue<T>
{
    private T front;
    private RQueue<T> inside;
    private T rear;

    public RQueue(){
        front = null;
        inside = null;
        rear = null;
    }

    // This method is useful for us in testing your code. Do not modify it.
    public void showImmediateContents() {
        System.out.println("Front: " + front);
        System.out.println("Inside: " + inside);
        System.out.println("Rear: " + rear);
    }
    //This method adds an item to the queue; placing added item to the rear of the queue, creating space where needed.
    //no return value
    public void enqueue(T item){
        if (front == null){
            front = item;}
        else if(rear == null){
            rear = item;
        }
        else{
            if(inside == null){
                inside = new RQueue<T>();
                inside.enqueue(rear);
                rear = item;
            }
            else{
                inside.enqueue(rear);
                rear = item;
            }
        }
    }
    //This method allows us to view the next first item in the front of the queue without removing it;
    //returns a value of type T 
    public T peek(){
        if (front == null){
            throw new NoSuchElementException("No items found");  
        }
        else{
            return front;
        }
    }
    //This method removes the front of the queue by checking base cases to decide how to shift items to replace the old_front;
    //returns a value of type T
    public T dequeue(){
        if (front == null){
            throw new NoSuchElementException("No items found");
        }
        else if (rear == null){
            T old_front = front;
            front = null;
            return old_front;
        }
        else{
            if(inside == null){
                T old_front = front;
                front = rear;
                rear = null;
                return old_front;
            }
            else{
                T old_front = front;
                front = inside.dequeue();
                if (inside.inside == null && inside.front == null){
                    inside = null;
                }
                return old_front;
            }
        }
}
    //This method prints the items in the queue from first to last in; base cases assure items are printed in the appropriate order
    //no return value
    public void display(){
        if (front == null){
            throw new NoSuchElementException("No items found");
        }
        else if(rear == null){
            System.out.println(front);
        }
        else{
            if(inside == null){
                System.out.println(front);
                System.out.println(rear);
            }
            else{
                System.out.println(front);
                inside.display();
                System.out.println(rear);
            }
        }
    }
}