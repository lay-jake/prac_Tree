public class Main {
    public static void main(String[] args) {
    BinarySearchTree tree = new BinarySearchTree();

    tree.insert(new Node(5));
    tree.insert(new Node(1));
    tree.insert(new Node(9));
    tree.insert(new Node(2));
    tree.insert(new Node(7));
    tree.insert(new Node(3));
    tree.insert(new Node(6));
    tree.insert(new Node(4));
    tree.insert(new Node(8));
    //display the tree - displays in order
//    tree.display();
//    //serach the data to see if its in there
//    System.out.println(tree.search(0));
//    System.out.println(tree.search(1));
//    System.out.println(tree.search(9));
//    System.out.println(tree.search(10));

    tree.remove(5);


    tree.display();
    }
}
