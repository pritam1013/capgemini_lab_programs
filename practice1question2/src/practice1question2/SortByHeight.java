package practice1question2;

import java.util.Comparator;

public class SortByHeight implements Comparator<Student> {
	@Override
	public int compare(Student o1, Student o2) {
	// TODO Auto-generated method stub
	Student s1=(Student)o1;
	Student s2=(Student)o2;

	return (int) (s1.getHeight()-s2.getHeight());
	}


}
