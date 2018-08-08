
//Amna Anjum

public class ListApp {

	public static void main(String[] args) {
		MyList list = new MyLinkedList();
		list.addAtBeginning("1");
		list.addAtBeginning("2");
		list.addAtBeginning("3");
		list.addAtBeginning("4");
		list.addAtBeginning("5");
		list.addAtBeginning("6");
		list.addAtBeginning("7");
		list.addAtBeginning("8");
		//removing at index 0 does not work
		//should remove eight but it removes seven
		
		list.insertAt(0, "0");
		System.out.println(list);
		
	}
	
//	private static void test(MyList list) {
//		list.addAtBeginning("C");
//		list.addAtBeginning("B");
//		list.addAtBeginning("A");
//		list.removeFromBeginning();
//		list.removeFromEnd();
//		list.addAtEnd("X");
//		list.addAtEnd("Y");
//		list.addAtEnd("Z");
//		list.removeFromEnd();
//		System.out.println(list);
//		System.out.println(list.size());
//		
//	}

}
