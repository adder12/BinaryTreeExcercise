public class Main {
    public static void main(String[] args){

        // create an object of BinaryTree
        BinaryTree tree = new BinaryTree();

        // create nodes of the tree
        tree.root = new Node(1);
        tree.root.setLeft(new Node(2));
        tree.root.setRight(new Node(3));
        tree.root.getLeft().setLeft(new Node(4));



        System.out.println("The number of nodes in this tree are " + tree.getNumberOfNodes(tree.root));
        System.out.println("The number of leaf nodes in this tree are " + tree.getLeafNodes(tree.root));


    }



    }



