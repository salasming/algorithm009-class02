import javax.xml.soap.Node;
import java.util.ArrayList;
import java.util.List;

public class SolutionTreePreOrder {

    List<Integer> res = new ArrayList<Integer>();

    public List<Integer> preorder(Node root) {
        inOrder(root);
        return res;
    }

    public void inOrder(Node root) {
        if (root == null) {
            return;
        }
        res.add(root.val);
        int s = root.children.size();
        for (int i = 0; i < s; i++) {
            inOrder(root.children.get(i));
        }
    }

    class Node {
        public int val;
        public List<Node> children;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }


}
