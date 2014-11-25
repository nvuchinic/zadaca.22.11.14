import java.util.Scanner;


public class zadatak3 {
public static void main(String[] args) {
	float a,b,c;int x,f=0;
	Scanner unos=new Scanner(System.in);
	System.out.println("Unesite koeficijente a,b,c:");
	a=unos.nextFloat();
	b=unos.nextFloat();
	c=unos.nextFloat();
	if(((a>=-10)&&(a<=10))&&((b>=-10)&&(b<=10))&&((c>=-10)&&(c<=10))) {
		System.out.println("Unesite vrijednosti za x:");
		x=unos.nextInt();
		f=(int) (a*x*x+b*x+c);
		System.out.println("f("+x+")= "+f);
	}
	else System.out.println("Koeficijenti a,b,c, nisu u zadanom intervalu");
}
}
