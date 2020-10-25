import java.util.Stack;

public class Q6
{
    //只打印链表，不反转链表
    public void reversePrint(LinkedList head)
    {
        Stack<Integer> stack = new Stack<>();

        LinkedList temp = head;
        while (temp != null)
        {
            stack.push(temp.data);
            temp = temp.next;
        }

        while (!stack.isEmpty())
        {
            System.out.println(stack.pop());
        }
    }

    public static void main(String[] args)
    {
        LinkedList node1 = new LinkedList(1);
        LinkedList node2 = new LinkedList(2, node1);
        LinkedList node3 = new LinkedList(3, node2);
        new Q6().reversePrint(node3);
    }
}

class LinkedList
{
    public int data;
    public LinkedList next;

    public LinkedList(int data, LinkedList next)
    {
        this.data = data;
        this.next = next;
    }

    public LinkedList(int data)
    {
        this.data = data;
    }
}
