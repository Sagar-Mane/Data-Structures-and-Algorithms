package trees;

public class TreeNode {

	private int key;
	private TreeNode leftchild;
	private TreeNode rightchild;
	
	//parameterized constructor
	public TreeNode(int key, TreeNode leftchild, TreeNode rightchild){
		this.key=key;
		this.leftchild=leftchild;
		this.rightchild=rightchild;
	}
	public TreeNode(){}
	
	public void setKey(int key){
		this.key=key;
	}
	
	public int getKey(){
		return key;
	}
	
	public void setLeftChild(TreeNode leftchild){
		this.leftchild=leftchild;
	}
	
	public TreeNode getLeftChild(){
		return leftchild;
	}
	
	public void setRightChild(TreeNode rightchild){
		this.rightchild=rightchild;
	}
	public TreeNode getRightChild(){
		return rightchild;
	}
	
}
