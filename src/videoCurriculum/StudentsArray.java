package videoCurriculum;

public class StudentsArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] students = new String[3];
		
		students[0] = "Alejandro";
		students[1] = "Alessandra";
		students[2] = "Yamilet";
		for (int i=0; i<students.length;i++) {
			System.out.println(students[i]);
		}
		System.out.println("\n");

		for(String student : students) {
			System.out.println(student);
		}
	}

}
