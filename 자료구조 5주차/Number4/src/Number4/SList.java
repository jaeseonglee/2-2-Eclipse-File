package Number4;			// Number4(�ǽ�4��) ��Ű��

public class SList <E> {	// �ܼ� ���� ����Ʈ SList Ŭ����
	protected Node head;	// ���� ����Ʈ�� ù ��带 ����Ŵ
	private int size;		// ��� ��
	
	public SList() {		// ���� ����Ʈ ������
		head = null;		// �⺻ �����ڴ� ���� NULL���� 0���� �ʱ�ȭ ���ش�
		size = 0;
	}
	
	public void setAndOrderNodes(int[] arr) {// ������ �迭�� �Ű������� �޴� setAndOrderNodes�޼ҵ�
		if(arr != null) {	
			head = null;	// ����Ʈ�� ����� ��� ������
			size = 0;		
		} else return ;		
		
		head = new Node(arr[0],head);// �迭�� ù��° �ε����� ���� ����
		size++;  			// ���  �� ����
		Node temp;			// �ӽ� ��� temp ����
	
		for(int i = 1; i < arr.length; i++) {// ��ø �ݺ����� ���� �迭�� ���� ��忡 ����
			temp = head;		// �� �ݺ����� temp�� head�� ����Ű���� �ʱ�ȭ
			
			for(int j = 1; j <= i; j++) {	// �迭�� ���Ұ�  ��忡 ����� ���ڿ� ���Ͽ� ������������ ���� ����
				if(arr[i] <= (int)head.getItem() ) {	// head�� �� ù��° ������ �۰ų� ������
					head = new Node(arr[i], head);	// �Ǿտ� �߰����ش� 
					size++;		// ��� �� ����
					break;		// ������ �ݺ����� ����������
				} else if ( j == i ) {	// ������ �ݺ����� ���������� �ݺ��Ѵٴ°� ����  �迭�� ������ ū ���� �����Ƿ�
					temp.setNext(new Node( arr[i],temp.getNext() ) );	// �������� �߰����ش�
					size++;		// ��� �� ����
					break;		// ������ �ݺ����� ����������
				} else  {	// ���� �� ������ ���� ���� ��尡 ����Ű�� ������ ū ���̶�� ex) arr[i] > (int)temp.getItem() 
					if(arr[i] <= (int)temp.getNext().getItem() ) {	// ���� ��尡 ���� ������ ������ 
						temp.setNext(new Node( arr[i] , temp.getNext() ) );	
								// ���� ��尡 ���� ��� ��� �迭�� ���簪�� ���� ��带 ����Ű���� ����  
						size++;	// ��� �� ����											
						break;	// ������ �ݺ����� ����������
					} else {
						temp = temp.getNext();	// ���� ��尡 ���� �����ٵ� ũ�ٸ� 
						continue;				// ������ �ݺ����� �ٽ� �����Ѵ�.
					}
				} 
			}	// ������ �ݺ��� ����
		}	// �ٱ����� �ݺ��� ����
	}		// �޼ҵ� ����
	

	public void print() {			// ����� ���� print�Լ�
		Node result = head;
		System.out.print("�ܼ� ���� ����Ʈ ��� : ");
		for(int i=0; i< size; i++) {// �ݺ����� ���� ù ������ ������ ������ش�
			System.out.print(result.getItem()+"\t");
			result = result.getNext();	
		}
		System.out.println();
	}
	
	public void join (SList slist2)  {		// �� ���� ����Ʈ �����ϴ� join �޼ҵ�
		int [] arr = new int[slist2.size+size];	// �� ���Ḯ��Ʈ�� ���̸�ŭ�� ũ��� �迭�� �ʱ�ȭ���ش� 
		for(int i=0; i<size; i++) {			// �ݺ����� ���� �� ���Ḯ��Ʈ�� ���� ������ �ϳ��� �迭�� �����Ѵ�
			arr[i] = (int)head.getItem();
			head = head.getNext();
		}
		for(int i= 0 + size; i< slist2.size +size; i++) {
			arr[i] = (int)slist2.head.getItem();
			slist2.head = slist2.head.getNext();
		}
		
		setAndOrderNodes(arr);	// setAndOrderNodes �޼ҵ带 �̿��ؼ� �� ���Ḯ��Ʈ�� ���� ������ �ϳ��� ���Ḯ��Ʈ�� �����Ѵ�. 
	}
}
