import java.util.NoSuchElementException;
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
	
	public void delete(DNode x) {	// p�� ����Ű�� ��� ����
		if( x == null ) throw new NoSuchElementException();
		if( size <= 0 )	throw new NoSuchElementException();
		DNode f = x.getPrevious();	// ��尡 ����Ű�� ������ ����
		DNode r = x.getNext();		// ������ ����
		f.setNext(r);		// �� ���� ���� ���������ν�  ���� ����
		r.setPrevious(f);
		size--;
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
}