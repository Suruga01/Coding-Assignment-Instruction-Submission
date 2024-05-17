package videoCurriculum;

public class MoreMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myArray=new int[3];
		myArray[0]=4;
		myArray[1]=5;
		myArray[2]=1;
		System.out.println(sumArray(myArray));
		double []Average=new double[3];
        Average[0]=5;
		Average[1]=7;
		Average[2]=8;
		System.out.println(calculateAverage(Average));
		String str = "Hello ";
		int count=5;
		System.out.println(multString(str, count));
		System.out.println("\n" + multString("Pato ", 3));

	}
	public static int sumArray(int[] numbers ) {
		int sum=0;
		for(int number : numbers) {
			sum+=number;
		}
		return sum; 
	}
	public static double calculateAverage(double[ ]numbers) {
		double average=0;
		for(double number: numbers) {
			average+=number;
		}
		return average;
	}
	public static String multString(String str, int num) {
		String result="";
		for(int i=0;i<num;i++) {
			result+= str;
		}
		return result;
	}
	

}
