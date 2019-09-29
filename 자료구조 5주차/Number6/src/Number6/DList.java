package Number6;

public class DList <E> {		// ���� ���Ḯ��Ʈ DList
	protected DNode head, tail;
	protected int size;
	public DList() {		// ������
		head = new DNode(null, null ,null);
		tail = new DNode(null, head, null);// ������ ���� head�� ����Ŵ
		head.setNext(tail);		// head�� ���� ��带 tail�� �����.
		size =0;
	}
	public void insertBefore(DNode p, E newItem) {
		DNode t = p.getPrevious();
		DNode newNode = new DNode(newItem,t,p);
		p.setPrevious(newNode);
		t.setNext(newNode);
		size++;
	}
	public void insertAfter(DNode p, E newItem) {// p�� ����Ű�� ��� �տ� ����
		DNode t = p.getNext();
		DNode newNode = new DNode(newItem, p, t);
		t.setPrevious(newNode); // ��带 ����Ű�� ������ ���� ���� ���� �ٲ��ش�
		p.setNext(newNode);
		size++;
	}

	public void print() { // ���߿��� ����Ʈ�� ����ϴ� print �޼ҵ�
		DNode result = head.getNext();
		for(int i=0; i< size; i++) {
			System.out.print(result.getItem()+"\t");
			result = result.getNext();
		}
		if(size == 0 ) {System.out.print("����Ʈ �������");}
		System.out.println();		
	}
	
	
	public int add(DList dl2) {	// �ΰ��� ����Ʈ�� ��ġ�� add �޼ҵ�
		int result = 0;	// ����� ������ result ����
		int ten;		// 10�� n������ ������ ten
		DNode temp = head.getNext();	// �ӽ� DNode temp;
		
		for(int i = size; i > 0 ; i--) { // �ݺ����� ���� �� ��ü�� �ִ� ������ ������ �ٲ� �����Ѵ�
			ten = 1;
			for(int j = 1; j < i; j++) { ten *= 10; }	// size��ŭ 10�� n������ ���ش�
			result = result + (int)temp.getItem() * ten;// 10�� n���� ��ŭ ���� ���ؼ� ����
			temp = temp.getNext();		// ���� ������ ������ ���� ��带 ����Ų��
		}
		
		temp = dl2.head.getNext();		// �Ű������� ���� ����Ű�� �ʱ�ȭ
		for(int i = dl2.size; i > 0; i--) {	// ���� ���� �ݺ����� ����
			ten = 1;
			for(int j = 1; j<i; j++) { ten *= 10; }
			result = result + (int)temp.getItem() * ten; 	// ���� �����ϰ�
			temp = temp.getNext();
		}
		return result;	 // ��� ���� ����� ������ ����� ��ȯ
	}
}