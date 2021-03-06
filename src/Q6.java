import java.util.Stack;

public class Q6
{
    //只打印链表，不反转链表
    public void reversePrint(LinkedList1 head)
    {
        Stack<Integer> stack = new Stack<>();

        LinkedList1 temp = head;
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
        LinkedList1 node1 = new LinkedList1(1);
        LinkedList1 node2 = new LinkedList1(2, node1);
        LinkedList1 node3 = new LinkedList1(3, node2);
        new Q6().reversePrint(node3);
    }
}

class LinkedList
{
    public int data;
    public LinkedList1 next;

    public LinkedList(int data, LinkedList1 next)
    {
        this.data = data;
        this.next = next;
    }

    public LinkedList(int data)
    {
        this.data = data;
    }
}
