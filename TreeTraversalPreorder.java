import java.util.ArrayList;
import java.util.Stack;


public class TreeTraversalPreorder {

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
		
		NodesToVisit.add(root);
		
		while(!NodesToVisit.isEmpty())
		{
			TreeNode n = NodesToVisit.pop();
			
			if (n == null)
				continue;
						
			result.add(n.getValue());
			
			NodesToVisit.push(n.getRight());

			NodesToVisit.push(n.getLeft());
		}		
		return (result);
	}
}
