package ergasia;

public class SingleList {
	int size;
	Node head;
	
	SingleList(){
		this.size = 0;
		this.head = null;
	}
	SingleList(int size, Node head){
		this.size = size;
		this.head = head;
	}
	void makeEmpty() {
		head.next = null;
		size = 0;
		head.value = 0;
	}
	boolean isEmpty() {
		return size==0?true:false;
	}
	void insertLast(int val) {
		Node index = new Node(val, null);
		index = head;
		if(!isEmpty()) {
			while(index.next!=null)
				index = index.next;
			index.next = new Node(val, null);
		}
		else {
			head = new Node(val, null);
		}
		size++;
	}
	void instertAfter(Node n, int val) {
		Node temp = new Node(val, n.next);
		n.next = temp;
		size++;
	}
	void deleteFirstTwo() {
		if(size >2) {
			Node index = new Node();
			index = head;
			for(int i = 0; i<2; i++)
				index = index.next;
			head = index;
			size-=2;
		}
	}
	void printList() {
		Node index = new Node();
		index = head;
		for(int i = 0; i < size; i++) {
			System.out.print(index.value + "->");
			index = index.next;
		}
		System.out.println();
	}
	void insertAfterAnIndex(int index, int value) {
		Node pointer = new Node();
		pointer = head;
		for(int j = 0; j < index-1; j++)
			pointer = pointer.next;
		Node n = new Node(value, pointer.next);
		pointer.next = n;
		size++;
	}
	
	public static void main(String[] args) {
		SingleList myList = new SingleList();
		myList.insertLast(1);
		myList.insertLast(20);
		myList.insertLast(3);
		Node tmp = new Node();
		tmp = myList.head;
		for (int i =0; i < myList.size; i++){
			System.out.print(tmp.value);
			System.out.print("->");
			tmp = tmp.next;
		}
		myList.insertAfterAnIndex(2, 33);
		myList.printList();
		myList.deleteFirstTwo();
		myList.printList();
		myList.deleteFirstTwo();
		myList.printList();
		myList.deleteFirstTwo();
		myList.printList();
	}

}
