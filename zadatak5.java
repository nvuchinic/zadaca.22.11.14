import java.util.Scanner;


public class zadatak5 {
public static void main(String[] args) {
	int a,b;
	Scanner unos=new Scanner(System.in);
	System.out.println("Unesite dimenzije pravougla(a i b):");
	a=unos.nextInt();
	b=unos.nextInt();
	for(int i=1;i<=a;i++) {
		if((i==1)||(i==a)) {
			for(int j=1;j<=b;j++) {
				if((j==1)||(j==b))
				System.out.print("+");
				else System.out.print("-");}
			}
		else {
			System.out.print("|");
			for(int k=1;k<=b-2;k++)
			System.out.print(" ");
			System.out.print("|");
		}
		System.out.println();
		}
}
}
