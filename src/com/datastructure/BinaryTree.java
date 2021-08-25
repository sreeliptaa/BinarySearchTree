package com.datastructure;

public class BinaryTree<K extends Comparable<K>> {
        MyBinaryNode<K> root;

        public void add(int Key) {
            MyBinaryNode<K> newNode = new MyBinaryNode<K>(Key);
            if (root == null) {
                root = newNode;
                return;
            } else {
                MyBinaryNode<K> current = root;
                MyBinaryNode<K> parent = null;
                while (true) {
                    parent = current;
                    // if key less than root assigning to left
                    if (Key < current.key) {
                        current = current.left;
                        if (current == null) {
                            parent.left = newNode;
                            return;
                        }
                    }
                    // Assigning key to right
                    else {
                        current = current.right;
                        if (current == null) {
                            parent.right = newNode;
                            return;
                        }
                    }
                }
            }
        }

        public void print(MyBinaryNode<K> node) {
            if (node == null) {
                System.out.println("Tree is empty");
            } else {
                if (node.left != null)
                    print(node.left);
                System.out.print(node.key + " ");
                if (node.right != null)
                    print(node.right);

            }
        }

}
