package Number4;
/** Q4 : Node.java, SList.java, main.java
 *  �ۼ��� : 2019.09.29 (16hour��)
 *  �ۼ��� : 20165153 ���缺
 * 	���α׷� ���� : SList���� setAndOrderNodes ������ ���α׷�, ���� ����Ʈ�� �迭�� �־��ָ� ���� ������ �����
 * 				�迭�� ������������ �����Ͽ� ����ϴ� ���α׷� ���� �� ���� ����Ʈ�� ���� �ϳ��� ���� ����Ʈ�� ����ϴ� ���α׷�
 */

		// �ǽ� 1���� ������� �߱⶧���� Number4 ���Ͽ��� ��Ű���� ����Ͽ� �������ش�
public class Node <E>{		// Node Ŭ���� , �ǽ� 1���� ����
	private E 		item;	// ��ü�� ���� ����
	private Node<E>	next;	// ���� ��带 ����Ű�� ���۷���
	public Node(E newItem, Node<E> node) {	//������
		item = newItem;		// �Ű������� ���� ���� �������ش�
		next = node;
	}
	// �� ��������� ���� getter setter�޼ҵ� 
	public E		getItem() { return item; }
	public Node<E>	getNext() { return next; }
	public void		setItem(E newItem) 		{item = newItem;}
	public void 	setNext(Node<E> newNext){next = newNext;}
}