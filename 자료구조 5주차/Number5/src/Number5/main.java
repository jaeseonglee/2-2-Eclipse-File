package Number5;

public class main {
	public static void main(String [] args) {
		SList<Integer> sl = new SList<Integer>();	// ���� ����Ʈ ��ü t ����
		
		System.out.println("[Task 1]");	// Task 1��
		sl.insertFront(5);
		sl.insertFront(4);
		sl.insertFront(3);
		sl.insertFront(2);
		sl.insertFront(1);	// 1-2-3-4-5 ������ ����
		sl.print();			// ���
		System.out.println();
		System.out.println("[Task 2]");// Task 2��
		sl.reverse();		// ���������� ����
		sl.print();			// ���
	}
}
