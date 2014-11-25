package zadaca;

import java.util.Scanner;

public class zadatak15 {
public static void main(String[] args) {
	double str1,str2,str3=0,veca,manja;
	Scanner unos=new Scanner(System.in);
	System.out.println("Unesite dva broja(za stranice trougla):");
	str1=unos.nextInt();
	str2=unos.nextInt();
	if(str1>str2){
		veca=str1;
		manja=str2;
	}
	else {
		veca =str2;
		manja=str1;
	}
	double temp=Math.sqrt(veca*veca-manja*manja);
	double temp2=Math.sqrt(str1*str1+str2*str2);
	if((temp>veca-manja)&&(temp<str1+str2))
		str3=temp;
	
	else if((temp2>veca-manja)&&(temp2<str1+str2))
		str3=temp2;
System.out.println("Treca stranica ima duzinu "+str3);	
}
}
