
import java.util.EmptyStackException;

// Implementing stack using linked list
public class StackUsingLinkedList {

    private ListNode top;
    private int length;

    private class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
        }

    }

    public StackUsingLinkedList() {
        top = null;
        length = 0;

    }

    public int length() {
        return length;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public void push(int data) {
        ListNode temp = new ListNode(data);
        temp.next = top;
        top = temp;
        length++;
    }

    public int pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        int result = top.data;
        top = top.next;
        length--;
        return result;

    }

    public int peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return top.data;
    }

    public static void main(String[] args) {

        StackUsingLinkedList stack = new StackUsingLinkedList();
        stack.push(3);
        stack.push(23);
        stack.push(1);

        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.peek());

    }

}
