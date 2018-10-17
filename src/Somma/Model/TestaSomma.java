package Somma.Model;
import java.util.Scanner;

public class TestaSomma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n1,n2;
		
		System.out.println("Inserisci il primo numero:");
		n1=sc.nextInt();
		
		System.out.println("Inserisci il secondo numero:");
		n2=sc.nextInt();
		
		Somma s=new Somma(n1,n2);
		
		System.out.println("La somma è:"+s.GetSomma());
		sc.close();
	}

}
