package com.datastructure;

public class MyBinaryNode <K extends Comparable<K>> {
    int key;
    MyBinaryNode<K> left;
    MyBinaryNode<K> right;

    public MyBinaryNode(int key) {
        this.key = key;
        this.left = null;
        this.right = null;
    }
}

