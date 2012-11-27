import java.util.ArrayList;

public class TreeTraversalBFS {
	
	public static void main(String[] args) 
	{
		System.out.println("Iterative:");
		BFSIterative(TreeNode.SampleTree1);
		
		// difficult to do recursion because BFS builds on the concept of a queue
		// so to use the call stack as a queue will be difficult
	}

	public static void BFSIterative(TreeNode root)
	{
		ArrayList<TreeNode> nodesToVisit = new ArrayList<TreeNode>();
		
		if (root == null)
		{
			return;
		}
		
		nodesToVisit.add(root);

		while (!nodesToVisit.isEmpty())
		{
			TreeNode n = nodesToVisit.remove(0);
						
			if(n == null)
			{
				System.out.print(" #");
				continue;
			}
			else
			{
				System.out.print(" " + n.getValue());
			}
			
			nodesToVisit.add(n.getLeft());
			
			nodesToVisit.add(n.getRight());
		}
	}
}


