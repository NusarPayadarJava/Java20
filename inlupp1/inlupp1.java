import java.util.Scanner;  // Import the Scanner class
public class inlupp1 {

	        public static void main(String[] args) {
			
			int i=3;
			           while (i > 0 ) {		  
							
			
			Scanner newobj = new Scanner(System.in);  // Create a Scanner object
		    System.out.println("skriv lösenord:");         
		    int skrivdata = newobj.nextInt();  // Read user input
		    int password=1234;
		    
		    if (skrivdata == password ) 
		    {System.out.println("Rätt!   inloggad");i=3; break;} 
		    
		    else { System.out.println("fel"); i--; } 
		    if (i == 0 ) {System.out.println("account blocket!"); }  
		    if (i == 1 ) {System.out.println(" VARNING! sista försök!"); }   
		     
		                }
				
		
	        }

}
