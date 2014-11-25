package zadaca;

import java.util.Scanner;

public class zadatak7 {
public static void main(String[] args) {
	int prvi=1,drugi=1,treci=0,n;
	System.out.println("Koji element fibonacijevog niza zelite (maksimalno 50-ti):");
Scanner unos=new Scanner(System.in);
n=unos.nextInt();
while((n>0)&&(n<51)){
	prvi=1;drugi=1;treci=0;
if(n<3)
	System.out.println("Prva dva elementa su 1");
for(int i=3;i<=n;i++){
	
	treci=prvi+drugi;
	prvi=drugi;
	drugi=treci;
}
System.out.println("To je broj "+treci);
System.out.println("Koji element fibonacijevog niza zelite (maksimalno 50-ti):");
n=unos.nextInt();
}
System.out.println("Greska!To je nedozvoljen unos");
unos.close();
}
}
