package trees;

public class Test {

	public static void main(String[] args) {

		TreeNode root=new TreeNode(20, null, null);
		BinarySearchTree b1=new BinarySearchTree(root);
		b1.insert(10);
		b1.insert(15);
		b1.insert(25);
		b1.insert(30);
		b1.insert(28);
		b1.insert(35);
		
		b1.levelOrderTraversal(root);
	}

}
