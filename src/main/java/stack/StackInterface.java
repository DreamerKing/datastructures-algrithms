package stack;

public interface StackInterface<T> {
    /**
    * adds a new entry to the top of this stack.
    * @param newEntry an object to be added to the stack.
    * */
    public void push(T newEntry);

    /**
    * Remove and return this stack's top entry.
    * @return  The Object at the top of the stack.
    * @throws  EmptyStackException if the stack is empty.
    * */
    public T pop();

    /**
    * Retrives this stack's top entry.
    * @return The Object at the top of the stack.
    * @throws  EmptyStackException if the stack is empty.
    * */
    public T peek();

    /**
    * Detects whether this stack is empty.
    * @return True if the stack is empty.
    * */
    public boolean isEmpty();

    /**
    * Remove all entries from this stack.
    * */
    public void clear();
}