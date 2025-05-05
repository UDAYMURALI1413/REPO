package project1;
import java.util.*;
public class prime_number {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int count=0;
		for(int i=1;i<=N;i++) {
			if(N%i==0)
			{
				count+=1;
				
			}
			else {
				count+=0;
			}
			
		}
		if(count==2) {
		System.out.println(N +" "+ "it's a prime number");
	}
		else {
			System.out.println(N+""+"not prime number");
		}
		sc.close();
	}
}

	
