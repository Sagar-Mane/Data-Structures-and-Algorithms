package trees;

public class Test {

	public static void main(String[] args) {

		TreeNode root=new TreeNode(50, null, null);
		BinarySearchTree b1=new BinarySearchTree(root);
		b1.insert(20);
		b1.insert(70);
		b1.insert(30);
		b1.insert(60);
		b1.insert(80);
		b1.insert(90);
		b1.delete(30);
		b1.preOrder(root);
		
		b1.delete(20);
		b1.preOrder(root);
		b1.delete(70);
		
	}

}
