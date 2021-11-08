public class StackNode<E>{

    private final E data;
    private final StackNode<E> child;

    public StackNode(E data, StackNode<E> child) {
        this.data = data;
        this.child = child;
    }

    public E getData() {
        return data;
    }

    public StackNode<E> getChild() {
        return child;
    }
}
