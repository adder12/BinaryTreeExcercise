public class Node {
    int key;
    Node left, right;

    public Node(int item) {
        key = item;
        left = right = null;
    }
    public Node getLeft(){
        return left;
    }
    public Node getRight(){
        return right;
    }
public void setLeft(Node node){

        this.left = node;
}
public void setRight(Node node){

        this.right = node;
}

}
