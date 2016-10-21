import java.util.ArrayList;

public class Node  {

	String data;
	ArrayList<Node> children = new ArrayList<>();
	ArrayList<Integer> weightperLink = new ArrayList<>();
	Node parent;

	public Node(String dataParam) {
		data = dataParam;
	}
	
	
}
