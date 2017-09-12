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
		// Add your implementation here
		return students;
	}

	@Override
	public void setStudents(Student[] students) {
		try {
		    if (students == null)
		        throw new IllegalArgumentException();
		}
		catch (IllegalArgumentException e) {}
		// Add your implementation here
	}

	@Override
	public Student getStudent(int index) {
		try {
			if (index < 0 || index >= students.length)
				throw new IllegalArgumentException();
		}
		catch (IllegalArgumentException e) {}
		// Add your implementation here
		return students[index];
	}

	@Override
	public void setStudent(Student student, int index) {
		try {
		    if (student == null)
		    	throw new IllegalArgumentException();
		    if (index < 0 || index >= students.length)
		    	throw new IllegalArgumentException();
		}
		catch (IllegalArgumentException e) {}
		students[index] = student;
		// Add your implementation here
	}

	@Override
	public void addFirst(Student student) {
		try {
		    if (student == null)
		    	throw new IllegalArgumentException();
		}
		catch (IllegalArgumentException e) {}
		int j = students.length;
		while (j >= 0) {
			students[j + 1] = students[j];
			j--;
		}
		students[j + 1] = student;
		// Add your implementation here
	}

	@Override
	public void addLast(Student student) {
		try {
		    if (student == null)
		    	throw new IllegalArgumentException();
		}
		catch (IllegalArgumentException e) {}
		students[students.length + 1] = student;
		// Add your implementation here
	}

	@Override
	public void add(Student student, int index) {
		try {
		    if (student == null)
		    	throw new IllegalArgumentException();
		    if (index < 0 || index >= students.length)
		    	throw new IllegalArgumentException();
		}
		catch (IllegalArgumentException e) {}
		int j = students.length;
		while (j >= index) {
			students[j + 1] = students[j];
			j--;
		}
		students[j + 1] = student;
		// Add your implementation here
	}

	@Override
	public void remove(int index) {
		try {
		    if (index < 0 || index >= students.length)
		    	throw new IllegalArgumentException();
		}
		catch (IllegalArgumentException e) {}
		while (index + 1 < students.length) {
			students[index] = students[index + 1];
			index++;
		}
		students[students.length - 1] = null;
		// Add your implementation here
	}

	@Override
	public void remove(Student student) {
		try {
		    if (student == null)
		    	throw new IllegalArgumentException();
		}
		catch (IllegalArgumentException e) {}
		int i;
		for (i = 0; i < students.length; i++) {
			if (students[i] == student)
				break;
		}
		while (i + 1 < students.length) {
			students[i] = students[i + 1];
			i++;
		}
		students[students.length - 1] = null;
		// Add your implementation here
	}

	@Override
	public void removeFromIndex(int index) {
		try {
		    if (index < 0 || index >= students.length)
		    	throw new IllegalArgumentException();
		}
		catch (IllegalArgumentException e) {}
		for (int i = index + 1; i < students.length; i++)
			students[i] = null;
		// Add your implementation here
	}

	@Override
	public void removeFromElement(Student student) {
		try {
		    if (student == null)
		    	throw new IllegalArgumentException();
		}
		catch (IllegalArgumentException e) {}
		int i;
		for (i = 0; i < students.length; i++) {
			if (students[i] == student)
				break;
		}
		i++;
		while (i < students.length)
			students[i] = null;
		// Add your implementation here
	}

	@Override
	public void removeToIndex(int index) {
		try {
		    if (index < 0 || index >= students.length)
		    	throw new IllegalArgumentException();
		}
		catch (IllegalArgumentException e) {}
		int i;
		for (i = 0; index < students.length; i++, index++)
			students[i] = students[index];
		for (;i < students.length; i++)
			students[i] = null;
		// Add your implementation here
	}

	@Override
	public void removeToElement(Student student) {
		try {
		    if (student == null)
		    	throw new IllegalArgumentException();
		}
		catch (IllegalArgumentException e) {}
		int index;
		for (index = 0; index < students.length; index++) {
			if (students[index] == student)
				break;
		}
		int i;
		for (i = 0; index < students.length; i++, index++)
			students[i] = students[index];
		for (;i < students.length; i++)
			students[i] = null;
		// Add your implementation here
	}

	@Override
	public void bubbleSort() {
		for (int i = 0; i < students.length; i++) {
			for (int j = 0; j < students.length - i - 1; j++) {
				int a = students[i].getId();
				int b = students[j].getId();
				if (a > b) { 
					int temp = a;
				    a = b;
				    b = temp;
				}
			}
		}
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
