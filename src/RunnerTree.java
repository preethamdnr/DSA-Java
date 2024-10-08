import com.preetham.tree.BinaryTree;

public class RunnerTree {
    public static void main (String[] args){
        BinaryTree obj=new BinaryTree();
        obj.insert(8);
        obj.insert(7);
        obj.insert(12);
        obj.insert(15);
        obj.insert(2);
        obj.insert(5);
        obj.inorder();
    }
}
