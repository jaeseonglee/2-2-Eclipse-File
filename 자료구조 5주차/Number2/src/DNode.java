/**	Q2 : DNode.java, DList.java, main.java
 *  �ۼ��� : 2019.09.26 ~ 09.29
 *  �ۼ��� : 20165153 ���缺
 * 	���α׷� ���� : ���߿��Ḯ��Ʈ, �����ڷῡ �ִ� DList�� ������ ���α׷�
 */
public class DNode <E> {		//  DNode Ŭ����
	private E		item;
	private DNode	previous;	// ������ ��带 ����Ű�� previous
	private DNode	next;		// ���� ��带 ����Ű�� next
	public DNode(E newItem, DNode p, DNode q) {	// ��� ������
		item 	 = newItem;
		previous = p;
		next 	 = q;
	}
	// �� ��� ������ gettet�� setter �޼ҵ�
	public E	 getItem()		{return item;}	
	public DNode getPrevious()	{return previous;}
	public DNode getNext()		{return next;}
	public void  setItem(E newItem)	  {item 	= newItem;}
	public void  setPrevious(DNode p) {previous = p;}
	public void  setNext(DNode q)	  {next 	= q;}
}