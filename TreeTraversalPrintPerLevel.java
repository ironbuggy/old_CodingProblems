import java.util.ArrayList;


public class TreeTraversalPrintPerLevel {

	public static void main(String[] args) 
	{
		BFSIterative(TreeNode.SampleTree1);
	}

	public static void BFSIterative(TreeNode root)
	{
		ArrayList<TreeNode> nodesToVisit = new ArrayList<TreeNode>();
		ArrayList<Integer> nodesDepth = new ArrayList<Integer>();
		
		if (root == null)
		{
			System.out.println("");
			return;
		}
		
		nodesToVisit.add(root);
		nodesDepth.add(0);
		
		int preDepth = -1;
		
		while (!nodesToVisit.isEmpty())
		{
			TreeNode n = nodesToVisit.remove(0);
			int depth = nodesDepth.remove(0);
			
			if (depth != preDepth)
			{
				System.out.println();
				preDepth = depth; 
			}
			
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
			nodesDepth.add(depth+1);
			
			nodesToVisit.add(n.getRight());
			nodesDepth.add(depth+1);
		}		
	}

}
