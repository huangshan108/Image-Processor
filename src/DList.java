public class DList {

	protected DListNode head;
	protected DListNode tail;
	protected long size;

	public DList() {
		head = null;
		tail = null;
		size = 0;
	}

	public DList(int[] a) {
		head = new DListNode();
		tail = head;
		head.item = a;
		size = 1;
	}

	public DList(int[] a, int[] b) {
		head = new DListNode();
		head.item = a;
		tail = new DListNode();
		tail.item = b;
		head.next = tail;
		tail.prev = head;
		size = 2;
	}

	public void insertFront(int[] fold) {
		DListNode d = new DListNode(fold);
		if (size == 0) {
			head = d;
			tail = d;
			d.prev = null;
			d.next = null;
		} else {
			d.next = head;
			head.prev = d;
			head = d;
			d.prev = null;
		}
		size++;
	}

	public void removeFront() {
		if (size == 0) {

		} else if (size == 1) {
			head = null;
			tail = null;
			size--;
		} else {
			head.next.prev = null;
			head = head.next;
			size--;
		}
	}

	public void insertBack(int[] fold) {
		DListNode d = new DListNode(fold);
		if (size == 0) {
			head = d;
			tail = d;
			d.prev = null;
			d.next = null;
		} else {
			d.prev = tail;
			tail.next = d;
			tail = d;
			d.next = null;
		}
		size++;
	}

	public void removeBack() {
		if (size == 0) {

		} else if (size == 1) {
			head = null;
			tail = null;
			size--;
		} else {
			tail.prev.next = null;
			tail = tail.prev;
			size--;
		}
	}

	public String toString() {
		String result = "[  ";
		DListNode current = head;
		while (current != null) {
			result = result + current.item + "  ";
			current = current.next;
		}
		return result + "]";
	}
}
