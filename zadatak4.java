import java.util.Scanner;


public class zadatak4 {
public static void main(String[] args) {
	float a,b,c,d, i,j,pr1=0,pr2=0;
	boolean sjeku=false;
	Scanner unos=new Scanner(System.in);
	System.out.println("Unesite interval prvog skupa(a i b):");
	a=unos.nextFloat();
	b=unos.nextFloat();
	System.out.println("Unesite interval drugog skupa(c,d):");
	c=unos.nextFloat();
	d=unos.nextFloat();
	//boolean dosta=false;
	for(i=a;i<=b;i++){
		for(j=c;j<=d;j++){
			if(i==j){
				if((i==a)||(i==b)||(i==c)||(i==d)){
					pr1=i;
					sjeku=true;
				break;}
			}
			
		}
		if(sjeku)
			break;
	}
	if(sjeku){
	for(i=pr1;i<=b;i++){
		for(j=pr1;j<=d;j++){
			if(i==j) {
				if((i==a)||(i==b)||(i==c)||(i==d))
					pr2=i;
				break;
			}
		}
	}
	System.out.println("Presjek skupova je {"+(int)pr1+","+(int)pr2+"}");
	}
	else System.out.println("Skupovi se ne sijeku");
}
}
