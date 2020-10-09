import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class inlupp4 {
	   public static String COMMA_DELIMITER = ",";

	 	public static void main(String[] args)   {
	 	
	 	List<String>  list = new ArrayList <> (); 
	 try 	(Scanner read=new Scanner(new File ("C:\\sample.csv"), "UTF-8")) { 
			while (read.hasNextLine() ) {
				list.add(read.nextLine());
			}

	 	}	
	 catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	 }	

	 	
	 	

	 for(String s: list) {
		 
		System.out.println(s);

	 }

	 		 	
	 
}	 	//main

}