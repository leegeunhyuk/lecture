import java.util.Comparator;

public class StudentComparatorNumber implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		Integer first = o1.getSchoolNum();
		Integer second = o2.getSchoolNum();
		if(first > second){
			return -1;
		}else if(first < second){
			return 1;
		}else {
			return 0;
		}
	}

}
