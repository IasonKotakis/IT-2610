/**
 *  Single Linked list with node of generic type. 
 */
package a1;

public class LinkedList<E> {

   protected int numElements;
   protected Node<E> head;
   
	/* Constructor. */
	public LinkedList(){
       numElements=0;
		head= new Node <E> (null, null);
   }
	
	/* Returns the number of elements in the list. */
	public  int size(){
	   return numElements;
	}
	/* return a boolean value indicating whether the list is empty. */
	public boolean isEmpty(){
	   return numElements==0;
	}
	
	/* search for the first appearance of the the element in the list. */
	public void search(E element){
		Node<E> ref=head;
		int i=1;
		while (ref.getElement() !=null && ref!=null){
		   if (ref.getElement()==element){
		      System.out.println(element+" is found as the "+i+"th element in the list.");
		      return;
		   }
			i++;
			ref=ref.getNextNode();
		}
		System.out.println(element +" is not found in the list.");
		return;	
	}

	/* insert a node at the head of the list. */
	public void insertFirst(E element) throws ElementNullException{
		if(element ==null) throw new ElementNullException("The inserted element is null element. ");
	    Node<E> newNode= new Node<E>(head, element); //current head will be the next node. 
		head=newNode; // new Node is the new head of the list. 
		numElements++;
	}
	
	
	
	/*remove the first element in the list.  */
	public E removeFirst() throws EmptyLinkedListException{
	   if(isEmpty()) throw new EmptyLinkedListException("The linked list is empty.");
	   Node<E> temp;
		E elem;
		temp=head;
		elem=head.getElement();
		head=head.getNextNode();
		temp.setNextNode(null);
		numElements--;
		return elem;
	}

	/* print the content of the list. */
	public String toString(){
	   Node<E> ref=head;
	   String s;
	   s="[ ";
	   while(ref.getElement() !=null && ref!=null){
	      s+=ref.getElement()+ " ";
	      ref=ref.getNextNode();
	   }
		s=s+"]";
		return s;
	}	

	/* display the status info. of the list. */
	public void status(String op, Object element){
	   System.out.print("Operation: " + op);   // print this operation
       System.out.println(", Returns: " + element); // what was returned
       System.out.print("Linked List Status: size = " + size() + ", isEmpty = " + isEmpty());
       System.out.println(", Linked List Content: " + this);       // contents of the stack
	   System.out.println();
	}
}
