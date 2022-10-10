public class BinaryTree {
    Node root;

    // Traverse tree
   /* public void traverseTree(Node node) {
        if (node != null) {
            traverseTree(node.left);
            System.out.print(" " + node.key);
            traverseTree(node.right);
        }
*/


  //      }
    public int getNumberOfNodes(Node node){
        if(node == null){
            return 0;
        }
        return 1 + getNumberOfNodes(node.getLeft()) + getNumberOfNodes(node.getRight());

    }

public int getLeafNodes(Node node){


        if(node.getRight() == null || node.getLeft() == null){
            return 1;
        }
        return getLeafNodes(node.getRight()) + getLeafNodes(node.getLeft());
    }


}





