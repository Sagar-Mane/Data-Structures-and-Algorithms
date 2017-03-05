package trees;

import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree{

	TreeNode root;
	
	public BinarySearchTree(TreeNode root){
		this.root=root;
	}
	public BinarySearchTree(){}
	/**
	 * Iterative solution for inserting an element into bst
	 * @param data to be inserted
	 */
	public void insert(int key){
	
	
		TreeNode newNode=new TreeNode(key, null, null);
		TreeNode temp=root;
		
		boolean flag=true;
		while(flag){
			if(key < temp.getKey()){
				//goto left subtree
				if(temp.getLeftChild()!=null){
					temp=temp.getLeftChild();
					//continue;
				}
				else{
					temp.setLeftChild(newNode);
					flag=false;
				}
				
			}
			else if(key > temp.getKey()){
				//goto right subtree
				if(temp.getRightChild()!=null){
					temp=temp.getRightChild();
					//continue;
				}
				else{
					temp.setRightChild(newNode);
					flag=false;
				}
			}
			else if(key==temp.getKey()){
				System.out.println("Duplicate Detected");
				break;
			}
		}
		
	}
	
	/**
	 * Recursive PreOrder traversal of tree.
	 * @param root
	 */
	public void preOrder(TreeNode root){
		if(root!=null){
			System.out.println(root.getKey());
			preOrder(root.getLeftChild());
			preOrder(root.getRightChild());
		}
	}
	/**
	 * Recursive PostOrder traversal of tree.
	 * @param root
	 */
	public void postOrder(TreeNode root){
		if(root!=null){
			postOrder(root.getLeftChild());
			postOrder(root.getRightChild());
			System.out.println(root.getKey());
		}
	}
	/**
	 * Recursive inOrder traversal of tree.
	 * @param root
	 */
	public void inOrder(TreeNode root){
		if(root!=null){
			inOrder(root.getLeftChild());
			System.out.println(root.getKey());
			inOrder(root.getRightChild());
		}
	}
	
	/**
	 * Iterative solution for searching element into tree.
	 * @param root
	 * @param key
	 * @return true if element found
	 */
	public boolean search(TreeNode root,int key){
		
		while(root!=null){
		
			if(root.getKey()==key){
				System.out.println("Found");
				return true;
			}
			else if(key<root.getKey()){
				//goto left subtree
				//System.out.println("going for left subtree");
				root=root.getLeftChild();
			}
			else if(key>root.getKey()){
				//goto right subtree
				//System.out.println("going for right subtree");
				root=root.getRightChild();
				
			}
		}
		System.out.println("Not found");
		return false;
	}
	
	/**
	 * Deleting a node from existing tree.
	 * @param data of the node to be deleted.
	 */
	public void delete(int key){
		/*
		 * There are three conditions
		 * Node to be deleted is a leaf- Pretty straight forward just delete the node. 
		 * Node to be deleted has single child
		 * Node to be deleted has two children
		*/	
		TreeNode temp=root;
		TreeNode parent=root;
		int i=0;
		while(temp!=null){
			i++;
			
			if(key<temp.getKey()){
				System.out.println("Going for left subtree");
				parent=temp;
				temp=temp.getLeftChild();
				if(temp.getKey()==key)
				{
				
					if(temp.getLeftChild()==null&&temp.getRightChild()==null){
					//node to be deleted is a leaf.
					System.out.println("Node to be deleted is a leaf");
					if(temp.getKey()>parent.getKey()){
						parent.setRightChild(null);
					}
					else
						parent.setLeftChild(null);
					
						temp=null;
					}
				
					else if((temp.getLeftChild()==null&&temp.getRightChild()!=null)||(temp.getRightChild()==null&&temp.getLeftChild()!=null)){
					//node to be deleted has one child
					System.out.println("Node to be deleted has one child");
					
					if(temp.getKey()<parent.getKey()){
						//left child
						if(temp.getLeftChild()!=null)
						parent.setLeftChild(temp.getLeftChild());
						else
							parent.setLeftChild(temp.getRightChild());
					}
					else{
						//right child
						if(temp.getLeftChild()!=null)
							parent.setRightChild(temp.getLeftChild());
						else
							parent.setRightChild(temp.getRightChild());
					}
					temp=null;
					
					}
				
					else if(temp.getLeftChild()!=null&&temp.getRightChild()!=null){
						System.out.println("Node to be deleted has two children");
						deleteWithTwoChildren(key);
						temp=null;
					
					}
				}
				
				
			}
			else if(key>temp.getKey()){
				System.out.println("Going for right subtree");
				parent=temp;
				temp=temp.getRightChild();
				if(temp.getKey()==key)
				{
				
					if(temp.getLeftChild()==null&&temp.getRightChild()==null){
					//node to be deleted is a leaf.
					System.out.println("Node to be deleted is a leaf");
					if(temp.getKey()<parent.getKey()){
						parent.setLeftChild(null);
					}
					else
						parent.setRightChild(null);
						temp=null;
					}
				
					else if((temp.getLeftChild()==null&&temp.getRightChild()!=null)||(temp.getRightChild()==null&&temp.getLeftChild()!=null)){
					//node to be deleted has one child
					System.out.println("Node to be deleted has one child");
					
					if(temp.getKey()<parent.getKey()){
						//left child
						if(temp.getLeftChild()!=null)
						parent.setLeftChild(temp.getLeftChild());
						else
							parent.setLeftChild(temp.getRightChild());
					}
					else{
						//right child
						if(temp.getLeftChild()!=null)
							parent.setRightChild(temp.getLeftChild());
						else
							parent.setRightChild(temp.getRightChild());
						}
					
					temp=null;
					}
				
					else if(temp.getLeftChild()!=null&&temp.getRightChild()!=null){
						System.out.println("Node to be deleted has two children");
						deleteWithTwoChildren(key);
						temp=null;
					
					}
				}
				
				
				
			}
			
		}
	}
	/**
	 * Deleting node with two children
	 * @param key
	 */
	public void deleteWithTwoChildren(int key){
		System.out.println("Reporting from function deleteNode Which has two children");
		TreeNode temp=root;
		TreeNode parent=root;
		while(temp!=null){
			if(key<temp.getKey()){
				//go for left subtree
				parent=temp;
				temp=temp.getLeftChild();
				if(temp.getKey()==key){
					//element found
					System.out.println("element found in left subtree");
					temp=null;
				}
				
				
			}
			else if(key>temp.getKey()){
				//go for right subtree
				parent =temp;
				temp=temp.getRightChild();
				if(temp.getKey()==key){
					//element found
					System.out.println("element found in right subtree");
					temp=null;
				}
				
			}
			else if(key==temp.getKey()){
				//Root Node
			}
			
		}
		
	}
	/**
	 * Iterative solution to check if the tree is balanced or not.
	 * @param root
	 * @return true if balanced tree.
	 */
	public boolean isBalanced(TreeNode root){
	
		int left_depth=0;
		int right_depth=0;
		TreeNode temp=root;
		while(temp!=null){
			if(temp.getLeftChild()!=null){
				left_depth++;
				temp=temp.getLeftChild();
			}
			else if(temp.getLeftChild()==null){
				temp=null;
			}
			
		}
		temp=root;
		while(temp!=null){
			if(temp.getRightChild()!=null){
				right_depth++;
				temp=temp.getRightChild();
			}
			else if(temp.getRightChild()==null){
				temp=null;
			}
			
		}
		//System.out.println("max depth="+left_depth);
		//System.out.println("min depth="+right_depth);
		
		if(left_depth-right_depth==0||left_depth-right_depth==-1||left_depth-right_depth==1){
			return true;
		}
		else
		return false;
	}

	/**
	 * Recursive solution for calculating height of binary tree.
	 * @param root
	 * @return height of B.T.
	 */
	public int heightBinaryTree(TreeNode root){
		
		if(root==null){
			return -1;
		}
		else{
			int left=heightBinaryTree(root.getLeftChild())+1;
			int right=heightBinaryTree(root.getRightChild())+1;
			
			if(left>right)
				return left;
			else
				return right;
				
		}
		
		
	}
	/**
	 * Iterative solution to find level order traversal of binary tree.
	 * @param root
	 */
	public void levelOrderTraversal(TreeNode root){
		Queue<TreeNode> q=new LinkedList<>();
		if(root!=null){
			q.add(root);
		}
		
		while(!q.isEmpty()){
			TreeNode n=q.remove();
			System.out.println(n.getKey());
			if(n.getLeftChild()!=null){
				q.add(n.getLeftChild());
			}
			if(n.getRightChild()!=null){
				q.add(n.getRightChild());
			}
		}
		
		
	}
	
	/**
	 * Recursive solution to check if tree is balanced.
	 * @param root
	 * @return true if binary tree is balanced
	 */
	public boolean isBalancedRecursive(TreeNode root){
		
		if(root==null){
			return true;
		}
		else{
			int left=heightBinaryTree(root.getLeftChild());
			int right=heightBinaryTree(root.getRightChild());
			
			if((left-right==0||left-right==1||left-right==-1)&&isBalanced(root.getLeftChild())&&isBalanced(root.getRightChild())){
				return true;
			}
		}
		return false;
	}
	
	/*
	 * Used while creating binary tree from sorted array.
	 * It works recursively to insert left subarray into left sub tree and right subarray into right subtree.
	 */
	public TreeNode addToTree(int arr[],int start, int end){
		int middle=(start+end)/2;
		TreeNode n=new TreeNode(arr[middle], null, null);
		if(end<start){
			return null;
		}
		n.setLeftChild(addToTree(arr,start,middle-1));
		n.setRightChild(addToTree(arr, middle+1, end));
		return n;
	
	}
	
	/*
	 * Used to create binary tree from sorted array.
	 */
	public TreeNode arrayToBT(int arr[]){
		return addToTree(arr, 0, arr.length-1);
	}
	
}
