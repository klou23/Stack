public class StackNode<T>{

    private final T data;
    private final StackNode<T> child;

    public StackNode(T data, StackNode<T> child) {
        this.data = data;
        this.child = child;
    }

    public T getData() {
        return data;
    }

    public StackNode<T> getChild() {
        return child;
    }
}
