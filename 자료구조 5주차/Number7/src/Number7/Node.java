/**	Q7 : CNode.java, CList.java, main.java
 *  �ۼ��� : 2019.09.30
 *  �ۼ��� : 20165153 ���缺
 * 	���α׷� ���� : ����Ʈ�� n�� rotate�ϴ� rotateLeft�޼ҵ�� rotateRight�޼ҵ带 ������ ���α׷�
 */
package Number7;
public class Node <E>{	// �ܼ����Ḯ��Ʈ�� NodeŬ������ �����ϴ�
	private E 		item;// ��ü�� ���� ����
	private Node<E>	next;	// ���� ��带 ����Ű�� ���۷���
	public Node(E newItem, Node<E> node) {
		item = newItem;
		next = node;
	}
	// �� ��������� ���� getter setter�޼ҵ� 
	public E		getItem() { return item; }
	public Node<E>	getNext() { return next; }
	public void		setItem(E newItem) 		{item = newItem;}
	public void 	setNext(Node<E> newNext){next = newNext;}
}