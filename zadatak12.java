import java.util.Scanner;


public class zadatak12 {
public static void main(String[] args) {
	int br,cif,sum=0;
	Scanner unos=new Scanner(System.in);
	System.out.println("Unesite jedan broj:");
	br=unos.nextInt();
	while(br>0){
		cif=br%10;
		sum=sum+cif;
		br=br/10;
	}
	System.out.println("Suma cifara iznosi "+sum);
}
}
