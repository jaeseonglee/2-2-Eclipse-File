package Number5;

public class SList <E> {	// �ܼ� ���� ����Ʈ�� ���ϴ� SList Ŭ����
	protected Node head;	// ���� ����Ʈ�� ù ��带 ����Ŵ
	private int size;		// ��� ��
	
	public SList() {		// ���� ����Ʈ ������
		head = null;		// �⺻ �����ڴ� ���� NULL���� 0���� �ʱ�ȭ ���ش�
		size = 0;
	}
	
	public void insertFront(E newItem) {// ���Ḯ��Ʈ �Ǿտ� �� ��� ����
		head = new Node(newItem,head);	// head�� ����Ű�� ��带 �������ش�
		size++;		
	}
	public void print() {			// ����� ���� print�Լ�
		Node result = head;
		for(int i=0; i< size; i++) {// �ݺ����� ���� ù ������ ������ ������ش�
			System.out.print(result.getItem()+"\t");
			result = result.getNext();	
		}
	}
	
	public void reverse() {	// ����Ʈ�� ���������� �ٲٴ� reverse�Լ�
		Node result = null;	// ����� ������ result ����
		for(int i=0; i< size; i++) {// �ݺ����� ����
			result = new Node( head.getItem(), result);	// result �� ������ ���� ����
			head = head.getNext();	// �ݺ��Ҷ� ���� head�� ���� ���� �ʱ�ȭ 
		}
		head = result;	// ���������� ����� result�� head�� ����
	}
	
}
