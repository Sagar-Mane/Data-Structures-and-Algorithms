package trees;

public class Test {

	public static void main(String[] args) {

		TreeNode root=new TreeNode(20, null, null);
		BinarySearchTree b1=new BinarySearchTree(root);
		/*b1.insert(10);
		b1.insert(5);
		b1.insert(30);
		System.out.println(b1.isBalancedRecursive(root));*/
		int arr[]={10,20,30,40,50};
		
		BinarySearchTree b=new BinarySearchTree();
		TreeNode temp=b.arrayToBT(arr);
		b.preOrder(temp);
		

	}

}
