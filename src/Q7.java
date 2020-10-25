public class Q7
{

    /**
     * @param preOrder  前序遍历数组
     * @param inOrder   中序遍历数组
     * @return  返回一个二叉树
     */
    public BinaryTreeNode constructNode(int[] preOrder,int[] inOrder)
    {
        BinaryTreeNode root = new BinaryTreeNode();

        //判断是否为空
        if (preOrder.length <= 0 || inOrder.length <= 0 || preOrder.length != inOrder.length)
            return null;

        return constructCore(preOrder,0,preOrder.length-1,inOrder,0,inOrder.length-1);

    }

    public BinaryTreeNode constructCore(int[] preOrder,int startPre,int endPre,int[] inOrder,int startIn,int endIn)
    {
        if (startPre > endPre || startIn > endIn)
            return null;

        BinaryTreeNode tree = new BinaryTreeNode(preOrder[startPre]);


        //找到根节点值在中序遍历数组的下标，以此划分左右子树
        int rootIndex = startIn;
        while(rootIndex <= endIn && inOrder[rootIndex] != tree.value)
        {
            rootIndex++;
        }

        //构建左子树
        tree.left = constructCore(preOrder,startPre+1,startPre+rootIndex-startIn,inOrder,startIn,rootIndex-1);

        //构建右子树
        tree.right = constructCore(preOrder,startPre+rootIndex-startIn+1,endPre,inOrder,rootIndex+1,endIn);

        return tree;
    }

    //前序遍历，将二叉树按顺序输出
    public static void preOrderRe(BinaryTreeNode biTree)
    {//递归实现
        System.out.println(biTree.value);
        BinaryTreeNode leftTree = biTree.left;
        if (leftTree != null)
        {
            preOrderRe(leftTree);
        }
        BinaryTreeNode rightTree = biTree.right;
        if (rightTree != null)
        {
            preOrderRe(rightTree);
        }
    }

    public static void main(String[] args)
    {
        int[] preOrder = {1,2,4,7,3,5,6,8};
        int[] inOrder  = {4,7,2,1,5,3,8,6};

        BinaryTreeNode root = new Q7().constructNode(preOrder,inOrder);
        preOrderRe(root);
    }
}

class BinaryTreeNode
{
    int value;
    BinaryTreeNode left;
    BinaryTreeNode right;

    public BinaryTreeNode(int value)
    {
        this.value = value;
    }

    public BinaryTreeNode()
    {

    }
}