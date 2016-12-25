package com.basicstruct.gaurav;

import java.util.*;

public class Node {
	Scanner in = new Scanner(System.in);
	public Integer key;
	public String value;
	public Node left, right, parent;
	

	public Node insert(int key, String value) {
		
		Node Nnode = new Node();
		Nnode.key = key;
		Nnode.value = value;
		return (Nnode);
		
		
	}

	public static void main(String[] args) {
		BinarySearchTree obj = new BinarySearchTree();
		System.out.println("Object Insertion in a BST with inorder traversal");
		obj.insert();
		System.out.println("Deleted 6 and printing inorder traversal");
		obj.delete(2);

	}

}
