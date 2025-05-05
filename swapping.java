package project1;

public class swapping {
	public static void main(String[] args) {
	//using third variable
	int a=23;
	int b=31;
//	int c=a;
//	if(a!=b){
//		a=b;
//		b=c;
//		System.out.println("a = " +a +" b = "+ b);
//	}
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a = " +a +" b = "+ b);
}
}
