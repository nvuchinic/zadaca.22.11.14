import java.util.Scanner;


public class zadatak13 {
public static void main(String[] args) {
	int br,br2=0,c, i=1;
	Scanner unos=new Scanner(System.in);
	System.out.println("Unesite jedan broj:");
	br=unos.nextInt();
	while(br>0){
		c=br%10;
		if(c!=0){
			br2=br2+c*i;
			i=i*10;
			br=br/10;}
		else {
			br=br/10;
		}
	}
	System.out.println("Broj bez nula: "+br2);
}
}
