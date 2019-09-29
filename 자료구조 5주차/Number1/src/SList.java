import java.util.NoSuchElementException;

public class SList <E> {	// �ܼ� ���� ����Ʈ�� ���ϴ� SList Ŭ����
	protected Node head;	// ���� ����Ʈ�� ù ��带 ����Ŵ
	private int size;		// ��� ��
	
	public SList() {		// ���� ����Ʈ ������
		head = null;		// �⺻ �����ڴ� ���� NULL���� 0���� �ʱ�ȭ ���ش�
		size = 0;
	}
	
	public int search(E target) {	// target�� Ž��
		Node p = head;				// ù ��带 ����Ű�� head�� �ʱ�ȭ
		for( int k = 0; k < size; k++) {// �ݺ����� ���� ù ������ ������
			if(target == p.getItem()) return k;	// target�� ���ٸ� ���� �������ش�
			p = p.getNext();		// ã�� ���ϸ� ���� ���� Ž��
		}
		return -1;		// Ž���� �����Ѱ�� -1 ����
	}
	
	public void insertFront(E newItem) {// ���Ḯ��Ʈ �Ǿտ� �� ��� ����
		head = new Node(newItem,head);	// head�� ����Ű�� ��带 �������ش�
		size++;		
	}
	
	public void insertAfter(E newItem, Node p) {	// ��� p�ٷ� ������ �� ��� ����
		p.setNext(new Node(newItem, p.getNext()));	// ��� p�� ����Ű�� ��带 �ٲ��ش�
		size++;
	}
	
	public void deleteFront() {	// ����Ʈ�� ù ��� ����
		if(size ==0) throw new NoSuchElementException();	// �׸���� 0����� ���ܹ߻�
		head = head.getNext();		// head�� ����Ű�� ���(ù ���)�� �� ���� ���� �������־�
		size--;						// GC�� ������ ù ��带 �����ذ���
	}
	
	public void deleteAfter(Node p) { //  p�� ����Ű�� ����� ���� ��带 ����
		if(p == null) throw new NoSuchElementException();
		Node t = p.getNext();	
		p.setNext(t.getNext());		// deleteFront �޼ҵ�ó�� �� ���� ���� �����Ѽ�
		t.setNext(null);			// ���� ����� ������ null�� ����Ű�� �����ش�
		size--;
	}
	
	public void print() {			// ����� ���� print�Լ�
		Node result = head;
		for(int i=0; i< size; i++) {// �ݺ����� ���� ù ������ ������ ������ش�
			System.out.print(result.getItem()+"\t");
			result = result.getNext();	
		}
	}
	
	public  int size() {return size;}	// ���� ��� ������ �����ϴ� size�޼ҵ�	 
}

