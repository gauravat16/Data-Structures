public class Link implements Comparable<Link> {
	int weight;
	Node node1;
	Node node2;

	public Link(int weightParam) {
		weight = weightParam;
	}

	@Override
	public int compareTo(Link obj) {
		return obj.weight > weight ? 1 : -1;
	}
}
