import java.util.Comparator;

public class StudentComparatorRank implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		Integer first = o1.getSum();
		Integer second = o2.getSum();
		if(first > second){
			return -1;
		}else if(first < second){
			return 1;
		}else {
			return 0;
		}
		
	}

}
