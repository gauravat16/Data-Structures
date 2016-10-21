import java.util.ArrayList;
import java.util.Stack;
import java.util.TreeSet;

public class Graph {
	Node root = null;
	static ArrayList<Node> graph = new ArrayList<>();
	static ArrayList<Link> links = new ArrayList<>();

	static boolean addNode(String data, int weight, String afterThisVal) {
		Node node = null;
		if (graph.isEmpty()) {
			node = new Node(data);
			node.parent = null;
			graph.add(node);
			return true;
		} else {
			Node afterThis = findNode(afterThisVal);
			if (afterThis == null) {
				return false;
			}
			node = new Node(data);
			if (graph.contains(afterThis)) {
				node.parent = afterThis;
				graph.get(graph.indexOf(afterThis)).children.add(node);
				graph.get(graph.indexOf(afterThis)).weightperLink.add(weight);
				graph.add(node);

				return true;
			}
		}
		return false;
	}

	static void viewGraphDFS() {
		Node currNode = null;
		ArrayList<Node> children = null;
		Stack<Node> stack = new Stack<>();
		stack.push(graph.get(0));
		while (!stack.isEmpty()) {
			currNode = stack.pop();

			if (!stack.contains(currNode)) {
				children = currNode.children;
				for (Node child : children) {
					System.out.println(currNode.data
							+ "--"
							+ currNode.weightperLink.get(currNode.children
									.indexOf(child)) + "-->" + child.data);
					Link link = new Link(
							currNode.weightperLink.get(currNode.children
									.indexOf(child)));
					link.node1 = currNode;
					link.node2 = child;
					links.add(link);

					if (!stack.contains(child)) {
						stack.push(child);

					}
				}
			}

		}

	}

	static Node findNode(String data) {
		for (Node node : graph) {
			if (node.data.equals(data)) {
				return node;
			}

		}

		return null;
	}
	
	void findShortestPath(Node node){
		TreeSet<Link> priorityQueue = new TreeSet<>(links);
		priorityQueue.add(node);
		
		
	}

	public static void main(String[] args) {
		addNode("A", 2, null);
		addNode("B", 5, "A");
		addNode("D", 6, "B");
		addNode("C", 2, "A");
		addNode("C", 8, "B");
		viewGraphDFS();

	}
}
