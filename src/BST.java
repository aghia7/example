public class BST<K extends Comparable<K>, V> {
    private class Node {
        K key;
        V value;
        Node right, left;

        Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    private Node root;

    public BST() {
    }

    public void delete(K key) {
        root = delete(key, root);
    }

    private Node delete(K key, Node node) {
        if (node == null) {
            return null;
        }

        int cmp = key.compareTo(node.key);

        if (cmp > 0) {
            node.right = delete(key, node.right);
        } else if (cmp < 0) {
            node.left = delete(key, node.left);
        } else {

            if (node.left != null && node.right != null) {
                Node minNode = getMin(node.right);
                node.right = deleteMin(node.right);

                node.key = minNode.key;
                node.value = minNode.value;
            } else {
                // ?? ? ? ?? ?  ??  ? ?
            }


        }

        return node;
    }

    public Node getMin() {
        return getMin(root);
    }

    private Node getMin(Node node) {
        if (node.left == null) {
            return node;
        }

        return getMin(node.left);
    }

    public void deleteMin() {
        root = deleteMin(root);
    }

    private Node deleteMin(Node node) {
        if (node.left == null) {
            return node.right;
        }

        node.left = deleteMin(node.left);

        return node;
    }

    public void put(K key, V value) {
        Node newNode = new Node(key, value);
        root = put(newNode, root);
    }

    private Node put(Node newNode, Node currentNode) {
        if (currentNode == null) {
            return newNode;
        }
        int cmp = newNode.key.compareTo(currentNode.key);
        if (cmp > 0) {
            currentNode.right = put(newNode, currentNode.right);
        } else if (cmp < 0) {
            currentNode.left = put(newNode, currentNode.left);
        } else {
            currentNode.value = newNode.value;
        }

        return currentNode;
    }

    public boolean containsKey(K key) {
        return containsKey(key, root);
    }

    private boolean containsKey(K key, Node currentNode) {
        if (currentNode == null) {
            return false;
        }

        int cmp = key.compareTo(currentNode.key);
        if (cmp > 0) {
            return containsKey(key, currentNode.right);
        } else if (cmp < 0) {
            return containsKey(key, currentNode.left);
        } else {
            return true;
        }
    }


}
