package practice1question2;

import java.util.ArrayList;
import java.util.Collections;

public class StudentsList {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		        ArrayList<Student> ar = new ArrayList<Student>();
		        ar.add(new Student("pritam", 11, 2.0));
		        ar.add(new Student("kanna", 18, 1.1));
		        ar.add(new Student("pk", 9, 6.2));
		 
		 
		        Collections.sort(ar, new SortByAge());
		 
		       System.out.println("Sorted by age");
		        for (int i=0; i<ar.size(); i++)
		            System.out.println(ar.get(i));
		 
		        Collections.sort(ar, new SortByName());
		 
		        System.out.println("Sorted by name");
		        for (int i=0; i<ar.size(); i++)
		            System.out.println(ar.get(i));
		        
		        Collections.sort(ar, new SortByHeight());
				 
		        System.out.println("Sorted by height");
		        for (int i=0; i<ar.size(); i++)
		            System.out.println(ar.get(i));
		}
}
