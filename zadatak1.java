/*Program koji ispisuje horoskopski znak na 
osnovu unesenog dana i mjeseca rodjenja*/

import java.util.Scanner;



public class zadatak1 {
public static void main(String[] args) {
	int d,m;
	System.out.println("Unesite dan i redni broj mjeseca rodjenja:");
	Scanner unos=new Scanner(System.in);
	d=unos.nextInt();
	m=unos.nextInt();
	unos.close();
	if(((m==3)&&(d>=19)&&(d<=31))||((m==4)&&(d<=19)))
		System.out.println("Vas znak je ovan");
	else if(((m==4)&&(d>=20)&&(d<=30))||((m==5)&&(d<=20)))
		System.out.println("Vas znak je bik");
	else if(((m==5)&&(d>=21)&&(d<=31))||((m==6)&&(d<=20)))
		System.out.println("Vas znak je blizanci");
	else if(((m==6)&&(d>=21)&&(d<=30))||((m==7)&&(d<=22)))
		System.out.println("Vas znak je rak");
	else if(((m==7)&&(d>=23)&&(d<=31))||((m==8)&&(d<=22)))
		System.out.println("Vas znak je lav");
	else if(((m==8)&&(d>=23)&&(d<=31))||((m==9)&&(d<=22)))
		System.out.println("Vas znak je djevica");
	else if(((m==9)&&(d>=23)&&(d<=30))||((m==10)&&(d<=22)))
		System.out.println("Vas znak je vaga");
	else if(((m==10)&&(d>=23)&&(d<=31))||((m==11)&&(d<=21)))
		System.out.println("Vas znak je skorpion");
	else if(((m==11)&&(d>=22)&&(d<=30))||((m==12)&(d<=21)))
		System.out.println("Vas znak je strijelac");
	else if(((m==12)&&(d>=22)&&(d<=31))||((m==1)&&(d<=19)))
		System.out.println("Vas znak je jarac");
	else if(((m==1)&&(d>=20))||((m==2)&&(d<=18)))
		System.out.println("Vas znak je vodenjak");
	else if (((m==2)&&(d>=19))||((m==3)&&(d<=20)))
		System.out.println("Vas znak je ribe");
	else System.out.println("Unijeli ste neodgovarajuce podatke");
}
}
