import java.util.ArrayList;


public class LexicalAnalyzer {
	
	// Keyword List 
	static String[] keytokens = {
			"if","else","for","while","do","int","float","double","long","auto","case","break","char",
			"const","continue","default","goto","long","extern","register","return","short","signed","sizeof","static","public","main","private",
			"struct","switch","typedef","union","unsigned","void","volatile","String",
			"System","this" ,"abstract" ,"boolean" ,"try" ,"catch" };
	
	
	
	// Token Identifier 
		public static ArrayList<String> TokenIdentifier (String s){
			
			ArrayList<String> Token = new ArrayList<>();
			String tokens1 = "";
	
			
			//String[] tokens = s.split(" ") ;
			 
			for(char c : s.toCharArray()){
				
				if (c!=' ' && c !='\n' && c!='\t' && c!='*')
		        {	
					tokens1+=c;
					
					if (c=='/'){
						
						tokens1 += "   This is under comment....   ";
						//tokens1="";
						
					}
		        }
				else if (tokens1 != "")
				{
					for(String key:keytokens){
						if(key.equals(tokens1))
						{
							tokens1 +=" ---------------- " + "is a Keyword";
						}
					}
				Token.add(tokens1);
				tokens1="";
				
				}
				
			}	

		return Token;
	}

	
	
	

}
