package Number7;

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

	public void print() {	// ���Ḯ��Ʈ�� ����ϴ� print �޼ҵ�
		Node result = last.getNext();	// last�� ������尡 ����Ʈ�� ù �׸��̹Ƿ� �������ش�
		for(int i=0; i< size; i++) {
			System.out.print(result.getItem()+"\t");
			result = result.getNext();
		}
	}
	
	public void rotateLeft(int n) {	// �������� n�� ȸ���ϴ� rotateLeft�޼ҵ� 
		Node temp = last;		// 0��ȸ���� �� �ֱ� ������ last�� �ʱ�ȭ ���ش�
		for(int i = 0; i < n; i++) {	// n�� ��ŭ ȸ���� ���� �ݺ��� ���
			temp = temp.getNext();		// ȯ�� ���Ḯ��Ʈ������ ������ ��尡 ó�� ��带 ����Ű�Ƿ� �ѹ��� �̵�
		}
		last = temp;		// temp�� �ٲ� ���� ����Ʈ��  last�� ����
	}
	
	public void rotateRight(int n) { // ���������� n�� ȸ���ϴ� rotateRight�޼ҵ�
		Node temp = last;			// 0��ȸ���� �� �ֱ� ������ last�� �ʱ�ȭ ���ش�
		for(int i = 0; i < n; i++) {	// n�� ȸ���ϱ� ���� �ݺ��� ���
			for(int j=0; j < size-1; j++) {	// ������ ȸ���� ��� ������ ��尡 ������ �� ��带 �����Ѿ��ϹǷ�
				temp = temp.getNext();		// size-1��ŭ �������� ȸ���ؼ� ��������� ���������� �ѹ� ȸ���ѰͰ� ���� �Ѵ�
			}
		}
		last = temp;		// temp�� �ٲ� ���� ����Ʈ�� last�� ����
	}
}