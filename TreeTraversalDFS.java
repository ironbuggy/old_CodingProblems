import java.util.*;

public class TreeTraversalDFS {

	public static void main(String[] args) {

		System.out.print("Iterative:");
		DFSIterative(TreeNode.SampleTree1);
		System.out.println("\n");
		System.out.print("Recursion:");
		DFSrecursion(TreeNode.SampleTree1);
	}
	
	public static void DFSrecursion(TreeNode root)
	{
		if (root == null)
		{
			System.out.print(" #");
			
			return;
		}
		
		System.out.print(" " + root.getValue());
		
		DFSrecursion(root.getLeft());
		DFSrecursion(root.getRight());
	}
	
	public static void DFSIterative(TreeNode root)
	{
		if (root == null)
			return;
		
		Stack<TreeNode> nodesToVisit = new Stack<TreeNode>();
		nodesToVisit.push(root);
		
		while(!nodesToVisit.isEmpty())
		{
			TreeNode n = nodesToVisit.pop();
			
			if (n == null)
			{
				System.out.print(" #");
				continue;
			}

			System.out.print(" " + n.getValue());
			nodesToVisit.push(n.getRight());
			nodesToVisit.push(n.getLeft());
		}
	}
}
