package Number6;

public class main {
	public static void main(String[] args) {
		
		System.out.println("[Task 1]");	// Task 1��
		DList<Integer> dl1 = new DList<Integer>();	// ��ü ����
		dl1.insertAfter(dl1.head, 1);	// 1-2-3 ����
		dl1.insertBefore(dl1.tail, 2);
		dl1.insertBefore(dl1.tail, 3);
		dl1.print();		// ���
		
		System.out.println("[Task 2]");	// Task 2��
		DList<Integer> dl2 = new DList<Integer>();	// ��ü ����
		dl2.insertAfter(dl2.head, 6);	//6-7-8-9 ����
		dl2.insertBefore(dl2.tail, 7);
		dl2.insertBefore(dl2.tail, 8);
		dl2.insertBefore(dl2.tail, 9);
		dl2.print();		// ���
		
		System.out.println("[Task 3]");	// Task 3��
		int add1 = dl1.add(dl2);		// �� ������ ������ ���� ���� ����
		int add2 = dl2.add(dl1);		// ����� ������ Ȯ��
		System.out.println("add1 ��� ��� : "+add1+"\nadd2 ��� ��� : " + add2);
	}
}