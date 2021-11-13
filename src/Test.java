public class Test {

    /**
     * Main
     * Used for testing all the methods within the stack class.
     * If all methods work properly, the following should be printed:
     * 10
     * 3
     * 10
     * false
     * 5
     * true
     */
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>(); //[]
        s.push(5); //[5]
        s.push(32); //[32,5]
        s.push(10); //[10,32,5]
        System.out.println(s.peek()); //10  [10,32,5]
        System.out.println(s.size()); //3   [10,32,5]
        System.out.println(s.pop()); //10   [32,5]
        System.out.println(s.isEmpty()); //false    [32,5]
        s.pop(); //[5]
        System.out.println(s.pop()); //5    []
        System.out.println(s.isEmpty()); //true     []
    }

}
