package com.fpp.lesson10;


import java.util.Iterator;
import java.util.TreeMap;
import java.util.TreeSet;

// Demo code for the user implemenation of Binary search tree
public class MyBST {
	/** The tree root. */
	private BinaryNode root;
	public int size;

	public MyBST() {
		root = null;
	}

	/**
	 * Prints the values in the nodes of the tree in sorted order. Inorder Traversal
	 */
	public void printTree() {
		if (root == null)
			System.out.println("Empty tree");
		else
			printTree(root);
	}

	// InOrder Traversal to print the nodes in Ascending order
	private void printTree(BinaryNode t) {
		if (t != null) {
			printTree(t.left);
			System.out.print(t.element + ",");
			printTree(t.right);
		}
	}

	// Assume the data in the Node is an Integer.
	public void insert(Integer x) {
		if (root == null) {
			root = new BinaryNode(x);
			++size;
			return;
		} else {
			BinaryNode n = root;
			boolean inserted = false;
			while (!inserted)// true
			{
				if (x.compareTo(n.element) < 0) {
					// space found on the left
					if (n.left == null) {
						n.left = new BinaryNode(x, null, null);
						inserted = true;
					}
					// keep looking for a place to insert (a null)
					else {
						n = n.left;
					}
				} else if (x.compareTo(n.element) > 0) {
					// space found on the right
					if (n.right == null) {
						n.right = new BinaryNode(x, null, null);
						inserted = true;
					}
					// keep looking for a place to insert (a null)
					else {
						n = n.right;
					}
				}
				// if a node already exists
				else {
					inserted = true;
				}
			}
			++size;
		}
	}

	public int size() {
		return size;
	}

	public Integer getRoot() {
		if (isEmpty()) {
			return -1;
		}
		return root.element;
	}

	public void preOrder() {
		// implement
		preOrder(root);
	}

	private void preOrder(BinaryNode t) {
		// implement
		if (t != null) {
			System.out.print(t.element + ",");
			preOrder(t.left);
			preOrder(t.right);
		}
	}

	public void postOrder() {
		// implement
		postOrder(root);
	}

	private void postOrder(BinaryNode t) {
		// implement
		if (t != null) {
			postOrder(t.left);
			postOrder(t.right);
			System.out.print(t.element + ",");
		}
	}

	public boolean isEmpty() {
		if (root == null) {
			return true;
		}
		return false;
	}

	public Integer findMin() {
		return findMin(root);
	}

	private Integer findMin(BinaryNode min) {
		if (min == null) {
			return null;
		}
		while (min.left != null) {
			min = min.left;
		}
		return min.element;
	}

	public Integer findMax() {
		return findMax(root);
	}

	public Integer findMax(BinaryNode max) {
		if (max == null) {
			return null;
		}
		while (max.right != null) {
			max = max.right;
		}
		return max.element;
	}

	public boolean contains(Integer key) {
		BinaryNode temp = root;
		while (temp != null) {
			if (key == temp.element) {
				return true;
			} else if (key < temp.element) {
				temp = temp.left;
			} else {
				temp = temp.right;
			}
		}
		return false;
	}

	public Integer leafNodes() {
		return leafNodes(root);
	}

	private int leafNodes(BinaryNode t) {// Implement
		int count = 0;
		if (t != null) {
			if ((t.left == null) && (t.right == null)) {
				count++;
			} else {
				count += leafNodes(t.left) + leafNodes(t.right);
			}
		}
		return count;
	}

	private class BinaryNode {
		private Integer element;// The data in the node
		private BinaryNode left; // Left child
		private BinaryNode right; // Right child
		// Constructors

		BinaryNode(Integer theElement) {
			this(theElement, null, null);
		}

		BinaryNode(Integer element, BinaryNode left, BinaryNode right) {
			this.element = element;
			this.left = left;
			this.right = right;
		}
	}

	public static void main(String[] args) {
		MyBST mybst = new MyBST();
		int[] a = { 15, 12, 9, 56, 1, 16, 19, 22, 3, 100, 2, 25 };
		for (int j = 0; j < a.length; j++) {
			mybst.insert(a[j]);
		}
	
		mybst.insert(5);
		mybst.insert(3);
		
		System.out.println("Size of the Array: " + mybst.size());
		System.out.println("The Root: " + mybst.getRoot());
		mybst.printTree();
		System.out.println();
		mybst.preOrder();
		System.out.println();
		mybst.postOrder();
		System.out.println();
		System.out.println("Is it contain 9 ? " + mybst.contains(9));
		System.out.println("Is it contain 120 ? " + mybst.contains(120));
		System.out.println("Min Value: " + mybst.findMin());
		System.out.println("Max Value: " + mybst.findMax());
		System.out.println("Leaf Counts: " + mybst.leafNodes());
		TreeSet<Integer> ts = new TreeSet<Integer>();
		for (int j = 0; j < a.length; j++) {
			ts.add(a[j]);
			System.out.println("\nAfter inserting " + j + "th item " + a[j]);
			Iterator<Integer> it = ts.iterator();
			Integer nextItem = null;
			while (it.hasNext()) {
				nextItem = it.next();
				System.out.print(nextItem + " ");
			}
			System.out.println();
		}
		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		map.put(8, "Hello");
		map.put(10, "World!");
		map.put(11, "Welcome");
		map.remove(8);
		String str = map.get(11) + ", " + map.get(10);
		System.out.println(str);
	}
}
/*
OUTPUT
---------------------------------
Size of the Array: 14
The Root: 15
1,2,3,5,9,12,15,16,19,22,25,56,100,
15,12,9,1,3,2,5,56,16,19,22,25,100,
2,5,3,1,9,12,25,22,19,16,100,56,15,
Is it contain 9 ? true
Is it contain 120 ? false
Min Value: 1
Max Value: 100
Leaf Counts: 4

After inserting 0th item 15
15 

After inserting 1th item 12
12 15 

After inserting 2th item 9
9 12 15 

After inserting 3th item 56
9 12 15 56 

After inserting 4th item 1
1 9 12 15 56 

After inserting 5th item 16
1 9 12 15 16 56 

After inserting 6th item 19
1 9 12 15 16 19 56 

After inserting 7th item 22
1 9 12 15 16 19 22 56 

After inserting 8th item 3
1 3 9 12 15 16 19 22 56 

After inserting 9th item 100
1 3 9 12 15 16 19 22 56 100 

After inserting 10th item 2
1 2 3 9 12 15 16 19 22 56 100 

After inserting 11th item 25
1 2 3 9 12 15 16 19 22 25 56 100 
Welcome, World!


 */

