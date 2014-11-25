package zadaca;

//import java.util.Scanner;

public class zadatak11 {
public static void main(String[] args) {
	String str2="";
	//Scanner unos=new Scanner(System.in);
	System.out.println("Unesite recenicu");
	String str=TextIO.getln();
	System.out.println("Unesite jedno slovo:");
	char slovo=TextIO.getChar();
	int duz=str.length();
	for(int i=0;i<duz;i++){
		if(str.charAt(i)==slovo){
			
		}
		else {
			str2=str2+str.charAt(i);
		}
	}
	System.out.println(str2);
	
	

}
}
