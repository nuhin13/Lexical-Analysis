import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


public class main {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader input=new BufferedReader(new FileReader("input.txt"));
		BufferedWriter output= new BufferedWriter(new FileWriter("output.txt"));
		
	
		String n = " ";
		String readLine = input.readLine();
		
		while (readLine != null) {
		    
		     readLine = input.readLine();
		    
		     n +=readLine+"\n";
		     
		    // output.write(n);
		    }
 
		input.close();
	        
		
		LexicalAnalyzer lg =  new LexicalAnalyzer();
		
		ArrayList<String> tokens = lg.TokenIdentifier(n);
		
			for(String tks:tokens)
			
			{
			     output.write(tks);
			     output.newLine();
			
			}
						
		output.close();
		System.out.println("Please look into the output.txt file");
	}

}
