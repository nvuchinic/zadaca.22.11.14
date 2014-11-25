import java.util.Scanner;


public class zadatak7 {
public static void main(String[] args) {
	int br,sumD=0;
	Scanner unos=new Scanner(System.in);
	do {
		sumD=0;
		System.out.println("Unesite neki prirodan broj:");
		br=unos.nextInt();
		while  (br<0) {
			System.out.println("Niste unijeli prirodan broj. Pokusajte ponovo:");
		br=unos.nextInt();	
		}
		for(int i=1;i<=br;i++){
			if(br%i==0){
				sumD=sumD+i;
			}
		}
		System.out.println("Suma djelilaca je "+sumD);
		}
	while(br!=0);
}
}
