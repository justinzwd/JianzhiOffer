import java.util.Stack;

public class Q6_1
{
    //只打印链表，不反转链表
    public void reversePrint(LinkedList1 head)
    {
        LinkedList1 temp = head;
        if (temp != null)
        {
            if (temp.next != null)
            {
                reversePrint(temp.next);
            }
            System.out.println(temp.data);
        }
    }

    public static void main(String[] args)
    {
        LinkedList1 node1 = new LinkedList1(1);
        LinkedList1 node2 = new LinkedList1(2, node1);
        LinkedList1 node3 = new LinkedList1(3, node2);

        //注意这里node3是head
        new Q6().reversePrint(node3);
    }
}

class LinkedList1
{
    public int data;
    public LinkedList1 next;

    public LinkedList1(int data, LinkedList1 next)
    {
        this.data = data;
        this.next = next;
    }

    public LinkedList1(int data)
    {
        this.data = data;
    }
}

