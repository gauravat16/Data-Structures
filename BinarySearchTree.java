package com.basicstruct.gaurav;

import java.util.Scanner;

public class BinarySearchTree {
	public Node root = null;
	Scanner in = new Scanner(System.in);
	int[] data = { 15, 6, 3, 2, 4, 7, 13, 9, 18, 17, 20 };

	public void insert() {
		// Boolean state = true;
		for (int i = 0; i < data.length; i++) {
			Node obj = new Node();
			Node NewNode = obj.insert(data[i], "lol");
			Node reference = root;
			if (root == null) {
				root = NewNode;
				// System.out.println("success" + root.value);
			} else {
				if (reference.key > NewNode.key) {
					Node prev = searchInsert(NewNode, 1);
					// System.out.println(prev.key);
					if (prev.key > NewNode.key) {
						prev.left = NewNode;
						NewNode.parent = prev;
						// System.out.println("success node is small");
					} else {
						prev.right = NewNode;
						NewNode.parent = prev;
						// System.out.println("success node is small");
					}
				} else {
					Node prev = searchInsert(NewNode, 1);
					// System.out.println(NewNode.key);
					if (prev.key > NewNode.key) {
						prev.left = NewNode;
						NewNode.parent = prev;
						// System.out.println("success e.s" + prev.left.key);
					} else {
						prev.right = NewNode;
						NewNode.parent = prev;
						// System.out.println("success node is big" + prev.key
						// + "right" + prev.right.key);
					}

				}
			}

			// System.out.println("want to add more?");
			// state = in.nextBoolean();
		}
		Node ref = root;
		Display(ref);

	}

	public Node searchInsert(Node Node, int state) {

		if (root == null) {
			System.out.println("empty tree");
			return (null);
		} else {
			Node reference = root;
			Node prev = null;
			while (root != null) {
				if (root.key != null) {
					if (root.key > Node.key) {
						prev = root;
						// System.out.println("from search" + prev.key);
						root = root.left;
						// System.out.println("im execured");

					} else {
						prev = root;
						// System.out.println("from search" + prev.key + "ref-"
						// + reference.key);
						root = root.right;
					}
				}

			}
			root = reference;
			return (prev);
		}

	}

	public Node search(int key) {

		if (root == null) {
			System.out.println("empty tree");
			return (null);
		} else {
			Node reference = root;
			while (reference.key != key) {
				if (reference.key > key) {
					reference = reference.left;
				} else {
					reference = reference.right;
				}
			}
			return (reference);
		}

	}

	public Node MinMax(int state, Node Ref) {
		Node val = null;
		// Node Ref = search(key);
		if (state == 1) {
			while (Ref != null) {
				val = Ref;
				Ref = Ref.left;
			}
			// System.out.println(val.key);
			return val;
		} else {
			while (Ref != null) {
				val = Ref;
				Ref = Ref.right;
			}
			// System.out.println(val.key);
			return val;
		}
	}

	public void transplant(Node toBeremoved, Node theReplacement) {
		if (theReplacement != null) {
			if (toBeremoved.parent == null) {
				root = theReplacement;
			} else {
				if (toBeremoved == toBeremoved.parent.left) {
					theReplacement.parent = toBeremoved.parent;
					toBeremoved.parent.left = theReplacement;

				} else {
					theReplacement.parent = toBeremoved.parent;
					toBeremoved.parent.right = theReplacement;

				}

			}
		}

	}

	public void delete(int key) {
		Node toBedeleted = search(key);
		// System.out.println("search- "+toBedeleted.right.key);
		Node ref = MinMax(1, toBedeleted.right);
		// System.out.println("Minmax- "+ref.key);
		if (toBedeleted.left == null && toBedeleted.right == null) {
			if (toBedeleted.parent.left.key == toBedeleted.key) {
				toBedeleted.parent.left = null;
			} else {
				toBedeleted.parent.right = null;
			}

		} else {
			if (toBedeleted.left == null && toBedeleted.right != null) {
				transplant(toBedeleted, toBedeleted.right);
				System.out.println("yo2");
			} else {
				if (toBedeleted.right == null && toBedeleted.left != null) {
					transplant(toBedeleted, toBedeleted.left);
					System.out.println("yo3");
				} else {
					if (ref.parent != toBedeleted) {
						transplant(ref, ref.right);
						ref.right = toBedeleted.right;
						ref.right.parent = toBedeleted.right;
						System.out.println("yo4");
					}
					transplant(toBedeleted, ref);
					ref.left = toBedeleted.left;
					ref.left.parent = ref;
					System.out.println("yo5");

				}
			}
		}
		Display(root);
	}

	public void Display(Node node) {

		if (node != null) {
			Display(node.left);
			System.out.println(node.key);
			Display(node.right);

		}
	}

	public static void main(String[] args) {

	}

}
