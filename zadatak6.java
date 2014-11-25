import java.util.Scanner;


public class zadatak6 {
public static void main(String[] args) {
	int pok,broj=0;
	int bingo=(int)Math.ceil(Math.random()*100);
	System.out.println(bingo);
	Scanner unos=new Scanner(System.in);
	System.out.println("Pokusajte pogoditi broj izmedju 1 i 100:");
	pok=unos.nextInt();
	while(pok!=bingo) {
		if(bingo>pok)
			System.out.println("Trazeni broj je veci od unesenog");
		else System.out.println("Trazeni broj je manji od unesenog");
		++broj;
		System.out.println("Pokusajte pogoditi broj izmedju 1 i 100:");
		pok=unos.nextInt();
		if(pok==-1)
			break;
	}
	++broj;
	System.out.println("Cestitam, pogodili ste broj iz "+broj+" pokusaja");
	}
}

