package ergasia;

public class Node {
	int value;
	Node next;
	
	Node(){
		this.value = 0;
		this.next = null;
	}
	Node(int value, Node next){
		this.value = value;
		this.next = next;
	}
}
