class BinarySearchTree {

	private static class Node {
		int val;
		Node left;
		Node right;
		public Node(int value) {
			val = value;
			left = null;
			right = null;
		}
	}

	private Node root;

	public BinarySearchTree() {
		root = null;
	}

	public void add(int val) {
		root = addRecur(root, val);
	}

	private void addRecur(Node root, int val) {
		if(root==null) {
			Node temp = new Node(val);
			root = temp;
			return root;
		}

		if(root.val < val) {
			root = addRecur(root.left, val);
		}
		if(root.val > val) {
			root = addRecur(root.right, val);
		}
	}

}
