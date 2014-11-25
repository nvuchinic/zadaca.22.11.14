import java.util.Scanner;


public class zadatak14 {
public static void main(String[] args) {
	int a,b,nD=0;
	Scanner unos=new Scanner(System.in);
	System.out.println("Unesite vrijednosti za stranice a i b:");
	a=unos.nextInt();
	b=unos.nextInt();
	while((a<1)||(b<1)){
		System.out.println(("a i b moraju biti pozitivni cijeli brojevi"));
		System.out.println("Unesite ponovo vrijednosti za stranice a i b:");
		a=unos.nextInt();
		b=unos.nextInt();
	}
	if(a-b<0)
		nD=-1*(a-b)+1;
	else
		nD=a-b+1;
	System.out.println("Najmanja duzina trece strane mora biti "+nD);
		
}
}
