import java.util.NoSuchElementException;
public class CList <E> {//ȯ�� ���Ḯ��Ʈ CList Ŭ����
	private Node last;	// ����Ʈ�� ������ ���(�׸�)�� ����Ų��
	private int size;	// ����Ʈ�� �׸�(���) ��
	public CList() {	// ������
		last = null;
		size = 0;
	}
	
	public void insert(E newItem) {	// last�� ����Ű�� ����� ������ ����� ����
		Node newNode = new Node(newItem,null);	// �� ��� ����
		if(last == null) {						// ����Ʈ�� empty�϶�
			newNode.setNext(newNode);		// �� �׸��� ����Ʈ�� ù ���� ������
			last = newNode;
		}
		else {	
			newNode.setNext(last.getNext());//newNode�� ���� ��尡 last�� ����Ű�� ����� ������尡 �ǵ���
			last.setNext(newNode);	// last�� ����Ű�� ����� ���� ��װ� newNode�� �ǵ���
		}
		size++;
	}
	
	
	public Node delete() {// last�� ����Ű�� ����� ���� ��帣 ����
		if(isEmtpy()) throw new NoSuchElementException();
		Node x = last.getNext();	// x�� ����Ʈ�� ù ��带 ����Ŵ
		if(x == last) last = null;	// ����Ʈ�� 1���� ��常 �ִ� ���
		else {
			last.setNext(x.getNext());	//last�� ����Ű�� ����� ���� ��尡 x�� ���� ��尡 �ǵ���
			x.setNext(null);		// x�� next�� null�� �����.
		}
		size--;
		return x;
	}
	
	private boolean isEmtpy() {	// �׸��� ������ �˷��ִ� isEmpty �޼ҵ�
		if(size == 0) return true;
		else return false;
	}
	
	public int size() {	return size;}	// �׸���� �����ϴ� size�޼ҵ�

	public void print() {	// ���Ḯ��Ʈ�� ����ϴ� print �޼ҵ�
		Node result = last.getNext();	// last�� ������尡 ����Ʈ�� ù �׸��̹Ƿ� �������ش�
		for(int i=0; i< size; i++) {
			System.out.print(result.getItem()+"\t");
			result = result.getNext();
		}
	}
}
