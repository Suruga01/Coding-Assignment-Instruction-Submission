package videoCurriculum;

public class equality {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a =new String ("Hello");//string es un object
		String b =new String ("Hello");//al usar new se crea una instancia uunica en lka memoria es por eso que a veces == no funciona
		System.out.println(a);
		System.out.println(b);
		System.out.println(a==b);// a veces cuando se usan objects los == no funcionan como se espera
		System.out.println("equals method: "+ a.equals(b)); //esta es una manera de comprobar la igualdad
		System.out.println("\n");
		
		int x=5;  //x & y salen del mismo espacio de memoria donde esta 5
		int y=5;  
		System.out.println(x);
		System.out.println(y);
		System.out.println(x==y);
		
		String c=new String("Hello");
		String d=c;
		System.out.println(c);
		System.out.println(d);
		System.out.println(c==d);

	}

}
