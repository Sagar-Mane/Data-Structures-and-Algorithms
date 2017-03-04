package trees;

public class Test {

	public static void main(String[] args) {

		TreeNode root=new TreeNode(3, null, null);
		BinarySearchTree b1=new BinarySearchTree(root);
		b1.insert(2);
		b1.insert(5);
		/*b1.insert(5);
		b1.insert(4);
		b1.insert(6);
		b1.insert(7);*/
		System.out.println(b1.heightBinaryTree(root));
	}

}
