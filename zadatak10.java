
package zadaca;

import java.util.Scanner;

public class zadatak10 {
public static void main(String[] args) {
	int pretF1=10;  //pretplata za firmu 1
	double cijenaPoSatuF1=0.50; //cijena usluge po satu firme 1
	double cijenaPoSatuF2=0.80;  //cijena usluge po satu firme 2
	int brSati;
	double ukupnoF1=0, ukupnoF2=0;
	System.out.println("Unesite broj sati;");
	Scanner unos=new Scanner(System.in);
	brSati=unos.nextInt();
	unos.close();
	ukupnoF1=10+brSati*cijenaPoSatuF1;
	ukupnoF2=brSati*cijenaPoSatuF2;
	if(ukupnoF1<ukupnoF2)
		System.out.println("Prva firma je isplativija");
	else if(ukupnoF2<ukupnoF1)
		System.out.println("Druga firma je isplativija");
	else 
		System.out.println("Cijene su iste");
}
}
