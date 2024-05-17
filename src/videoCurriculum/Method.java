package videoCurriculum;



public abstract class Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String FirstName = "Alejandro";
		String LastName = "Gonzalez";
		String FullName = CreateFullName(FirstName, LastName);
		System.out.println(FullName);

	}
	public static String CreateFullName ( String x, String y) {
		String FullName = x+ " " +y;
		return FullName	;	
	}

}
