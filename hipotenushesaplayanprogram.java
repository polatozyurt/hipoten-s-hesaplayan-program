package myjavaprograms;
import java.util.Scanner; ;


public class hipotenushesaplayanprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner something = new Scanner (System.in); 
		int dikkenar1, dikkenar2  ;
		double hypotenus ;
		
		System.out.print("1.dik kenar�n uzunlu�unu tam say� �eklinde giriniz: ");
		dikkenar1= something.nextInt();
		System.out.print("2.dik kenar�n uzunlu�unu tam say� �eklinde giriniz: ");
		dikkenar2= something.nextInt();
		
		hypotenus= Math.sqrt (dikkenar1*dikkenar1 + dikkenar2*dikkenar2);
		System.out.println("Hipoten�s: "+ hypotenus);
		System.out.print("Program END");

		
		
		
				
		
		
		
		
		

	}

}
