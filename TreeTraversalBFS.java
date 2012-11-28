import java.util.ArrayList;

public class TreeTraversalBFS {
	
	public static void main(String[] args) 
	{
		System.out.print(BFSIterative(TreeNode.SampleTree1));
		
		// difficult to do recursion since BFS builds on the concept of a queue
		// so to use the call stack as a queue will be difficult
	}

	public static ArrayList<Integer> BFSIterative(TreeNode root)
	{
		ArrayList<Integer> result = new ArrayList<Integer>();
		
		ArrayList<TreeNode> nodesToVisit = new ArrayList<TreeNode>();
		
		if (root == null)
		{
			return (result);
		}
		
		nodesToVisit.add(root);

		while (!nodesToVisit.isEmpty())
		{
			TreeNode n = nodesToVisit.remove(0);
						
			if(n == null)
			{
				continue;
			}
			else
			{
				result.add(n.getValue());
			}
			
			nodesToVisit.add(n.getLeft());
			
			nodesToVisit.add(n.getRight());
		}
		
		return(result);
	}
}


