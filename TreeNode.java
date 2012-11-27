/*
 * Tree node class used by other examples
 * 
 */

public class TreeNode {

	private int value;
	private TreeNode left;
	private TreeNode right;
	
	// getters and setters
	public int getValue()
	{
		return this.value;
	}
	
	public void setValue(int value)
	{
		this.value = value;
	}

	public TreeNode getRight()
	{
		return this.right;
	}
	
	public void setRight(TreeNode n)
	{
		this.right = n;
	}

	public TreeNode getLeft()
	{
		return this.left;
	}
	
	public void setLeft(TreeNode n)
	{
		this.left = n;
	}
	
	// constructor
	public TreeNode(int value)
	{
		this.value = value;
		this.left = null;
		this.right = null;
	}
	
	public String toString()
	{
		return ("" + this.value);
	}	
	
	public static final TreeNode SampleTree1;
	static
	{
		SampleTree1 = new TreeNode(10);
		TreeNode l = new TreeNode(20);
		TreeNode r = new TreeNode(50);
		SampleTree1.setLeft(l);
		SampleTree1.setRight(r);
		l.setLeft(new TreeNode(5));
		r.setLeft(new TreeNode(35));
		r.setRight(new TreeNode(15));
	}
}
