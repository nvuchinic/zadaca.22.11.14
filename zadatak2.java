/*Program koji ispisuje unesene brojeve po velicini,
te koliko je razlicitih brojeva uneseno*/
import java.util.Scanner;


public class zadatak2 {
public static void main(String[] args) {
	int br1,br2,br3,max=0,min=0,sr=0,brRB=0;
	Scanner unos=new Scanner(System.in);
	System.out.println("Unesite tri broja u intervalu 50 - 200:");
	br1=unos.nextInt();
	br2=unos.nextInt();
	br3=unos.nextInt();
//	unos.close();
	
	while(((br1>=50)&&(br1<=200))&&((br2>=50)&&(br2<=200))&&((br3>=50)&&(br3<=200))){
		if((br1>br2)&&(br1>br3)){
			if(br2>br3){
				min=br3;
				sr=br2;
				brRB=3;}
			else if(br3>br2){
				min=br2;
				sr=br3;
				brRB=3;}
			else {
				min=sr=br2;
				brRB=2;
			}
			max=br1;
		}
		else if((br2>br1)&&(br2>br3)){   //1,3,1
			if(br3>br1){
				sr=br3;
				min=br1;
				brRB=3;}
			else if(br3==br1){
				brRB=2;
				sr=br3;
				min=br1;} 
			max=br2;
		}
			
	else if(br3>br1){           //2,1,3
			if(br2>br1){
				sr=br2;
				min=br1;
				brRB=3;}
			else if(br2<br1){
				min=br2;
				sr=br1;
				brRB=3;	}
			else {
				min=br2;
				sr=br1;}
			max=br3;}
	else if((br1==br2)&&(br2==br3)){    //2,2,2
		brRB=1;
		min=max=sr=br1;
	}
	

		 System.out.println("Brojevi poredani po velicini: "+min+" ,"+sr+" ,"+max+" ,a ukupno razlicitih brojeva ima "+brRB+"\n\n");
		 System.out.println("Unesite tri broja u intervalu 50 - 200:");
			br1=unos.nextInt();
			br2=unos.nextInt();
			br3=unos.nextInt();

		 
	 }
	System.out.println("Brojevi nisu iz trazenog intervala");
	
	}
	
}

