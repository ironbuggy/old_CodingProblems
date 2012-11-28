import java.util.*;


public class TreeTraversalInorder {

	public static void main(String[] args) 
	{
		System.out.println(Traverse(TreeNode.SampleTree1));
	}
	
	public static ArrayList<Integer> Traverse(TreeNode root) 
	{
		ArrayList<Integer> result = new ArrayList<Integer>();
		
		if (root == null)
			return (result);
		
		Stack<TreeNode> NodesToVisit = new Stack<TreeNode>();
		Stack<Boolean> NodeVisited = new Stack<Boolean>();
		
		NodesToVisit.add(root);
		NodeVisited.add(false);
		
		while(!NodesToVisit.isEmpty())
		{
			TreeNode n = NodesToVisit.pop();
			boolean visited = NodeVisited.pop();
			
			if (n == null)
				continue;
			
			if (visited)
			{
				result.add(n.getValue());
				continue;
			}
			
			NodesToVisit.push(n.getRight());
			NodeVisited.push(false);
			
			NodesToVisit.push(n);
			NodeVisited.push(true);
			
			NodesToVisit.push(n.getLeft());
			NodeVisited.push(false);
		}
		
		return (result);
	}
}
