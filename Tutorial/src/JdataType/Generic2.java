package JdataType;

import java.util.ArrayList;

public class Generic2 {
	public static <T extends Comparable<T>> void sort(ArrayList<T> list) {

	}

	public static <T extends Comparable<? super T>> void sortMethod2(
			ArrayList<T> list) {

	}
	
	public static void main(String [] args) {
		ArrayList<String> arrayList1 = new ArrayList<String>();
		sort(arrayList1);
		sortMethod2(arrayList1);
		
		ArrayList<? super String> arrayList2 = new ArrayList<String>();
		//sort(arrayList2); //Failed
		//sortMethod2(arrayList2); //Failed
		
		ArrayList<? extends String> arrayList3 = new ArrayList<String>();
		//sort(arrayList3); //Failed
		sortMethod2(arrayList3); //Ok
	}

}
