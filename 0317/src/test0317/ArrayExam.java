package test0317;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] array = new String[2];
		array[0] = "one";
		array[1] = "two";
		
		for(int i=0; i<array.length; i++) {
			System.err.println(array[i]);
		}
		
		ArrayList a1 = new ArrayList();
		a1.add("one");
		a1.add("two");
		a1.add("three");
		a1.add(1, "1");
		
		for(int i=0; i<a1.size(); i++) {
			System.out.println(a1.get(i));
		}
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(3);
		list.add(5);
		list.add(2);
		list.add(4);
		list.add(1);
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		ArrayList<String> colors = new ArrayList<>(Arrays.asList("Black","White", "Green", "Red"));
		
		for(int i=0; i<colors.size(); i++) {
			System.out.print(colors.get(i) + "  ");
		}
	}

}
