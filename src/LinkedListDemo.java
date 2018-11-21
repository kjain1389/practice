
public class LinkedListDemo {
		Node head;
		Node tail;
		
		public LinkedListDemo(){
			this.head = new Node("head");
		}
		
		public Node head(){
		    return head;
		}
		
		public void add(Node node){
	        tail.next = node;
	        tail = node;
	    }

		
		public static class Node{
			private Node next;
			private String data;
			
			public Node(String data){
		        this.data = data;
		    }
			
			public Node getNext() {
				return next;
			}
			public void setNext(Node next) {
				this.next = next;
			}
			public String getData() {
				return data;
			}
			public void setData(String data) {
				this.data = data;
			}
			
		}
}
