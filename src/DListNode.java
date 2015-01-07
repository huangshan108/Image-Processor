public class DListNode {

	public int[] item;
	public DListNode prev;
	public DListNode next;

	DListNode() {
		item = null;
		prev = null;
		next = null;
	}

	DListNode(int[] fold) {
		item = fold;
		prev = null;
		next = null;
	}
}
