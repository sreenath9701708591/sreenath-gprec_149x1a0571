import java.util.Date;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
		return students;
	}

	@Override
	public void setStudents(Student[] students) {
		if (students == null) throw new IllegalArgumentException("Invalid input");
		this.students = students;
	}

	@Override
	public Student getStudent(int index) {
		if(index < 0 || index >= students.length)  throw new IllegalArgumentException("Invalid input");
		return students[index];
	}

	@Override
	public void setStudent(Student student, int index) {
		if (student == null || index < 0 || index >= students.length) throw new IllegalArgumentException("Invalid input");
		students[index] = student;
	}

	@Override
	public void addFirst(Student student) {
		if (student == null) throw new IllegalArgumentException("Invalid input");
		Student[] t = new Student[students.length + 1];
		t[0] = student;
		for(int i=1; i<t.length; i++)
			t[i] = students[i-1];

		students = t;
	}

	@Override
	public void addLast(Student student) {
		if (student == null) throw new IllegalArgumentException("Invalid input");
		Student[] t = new Student[students.length + 1];
		for(int i=0; i<t.length-1; i++)
			t[i] = students[i];
		t[t.length-1] = student;

		students = t;		
	}

	@Override
	public void add(Student student, int index) {
		if (student == null || index < 0 || index >= students.length) throw new IllegalArgumentException("Invalid input");

		Student[] t = new Student[students.length + 1];
		for(int i=0; i<index; i++)
			t[i] = students[i];
		t[index] = student;
		for(int i=index, j=index+1; i<students.length; i++, j++)
			t[j] = students[i];

		students = t;
	}

	@Override
	public void remove(int index) {
		if (index < 0 || index >= students.length) throw new IllegalArgumentException("Invalid input");

	}

	@Override
	public void remove(Student student) {
		// Add your implementation here
	}

	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		return null;
	}
}
