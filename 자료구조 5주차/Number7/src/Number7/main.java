package Number7;

public class main {
	public static void main(String [] args) {
		CList<Integer> cl1 = new CList<Integer>();// ���Ḯ��Ʈ ��ü s ����
		System.out.println("[Task 1]");	// Task 1��
		cl1.insert(4);
		cl1.insert(3);		// 1-2-3-4 ����
		cl1.insert(2);
		cl1.insert(1);
		cl1.print();		// ���
		System.out.println();

		CList<Integer> cl2 = new CList<Integer>();// ���Ḯ��Ʈ ��ü s ����
		cl2.insert(4);
		cl2.insert(3);	// 1-2-3-4 ����
		cl2.insert(2);
		cl2.insert(1);
		cl2.print();
		System.out.println();
		
		// Task 2
		cl1.rotateLeft(1);		// ���� 1��ŭ ȸ��
		cl2.rotateRight(1);	
		
		System.out.println("[Task 3]");	// Task 3��
		cl1.print();			// ���� ȸ���� ��� ���
		System.out.println();
		cl2.print();	
	}
}
