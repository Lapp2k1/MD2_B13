package BT9;

class Node {
    int value;
    Node left, right;

    public Node(int item) {
        value = item;
        left = right = null;
    }
}

class BinarySearchTree {
    Node root;

    BinarySearchTree() {
        root = null;
    }


    void insert(int value) {
        root = insertRec(root, value);
    }

    Node insertRec(Node root, int value) {
        if (root == null) {
            root = new Node(value);
            return root;
        }

        if (value < root.value) {
            root.left = insertRec(root.left, value);
        } else if (value > root.value) {
            root.right = insertRec(root.right, value);
        }

        return root;
    }


    boolean search(int value) {
        return searchRec(root, value);
    }

    boolean searchRec(Node root, int value) {

        if (root == null) {
            return false;
        }


        if (root.value == value) {
            return true;
        }


        if (value < root.value) {
            return searchRec(root.left, value);
        }


        return searchRec(root.right, value);
    }

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();

        // Chèn các phần tử vào cây BST
        bst.insert(50);
        bst.insert(30);
        bst.insert(20);
        bst.insert(40);
        bst.insert(70);
        bst.insert(60);
        bst.insert(80);

   
        int valueToSearch1 = 40;
        int valueToSearch2 = 90;

        System.out.println("Tìm kiếm " + valueToSearch1 + " trong cây: " + bst.search(valueToSearch1));
        System.out.println("Tìm kiếm " + valueToSearch2 + " trong cây: " + bst.search(valueToSearch2));
    }
}
