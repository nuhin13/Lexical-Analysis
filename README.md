#Lexical Analysis
	Input: 
		
		   int a , b , c ; /* this is new */ 

		   if ( a < b )
			   a = a + b ;
		   else if ( a < c ) 
			   a  = a + c ;
		   else if ( b < c )
			   b = b + c ; 
		   else 
			   a = c ; 
		 
		   return 0 ;


		//this_is_new_.. 
		
	Output:
				int ---------------- is a Keyword
				a
				,
				b
				,
				c
				;
				/   This is under comment....   
				this ---------------- is a Keyword
				is
				new
				/   This is under comment....   
				if ---------------- is a Keyword
				(
				a
				<
				b
				)
				a
				=
				a
				+
				b
				;
				else ---------------- is a Keyword
				if ---------------- is a Keyword
				(
				a
				<
				c
				)
				a
				=
				a
				+
				c
				;
				else ---------------- is a Keyword
				if ---------------- is a Keyword
				(
				b
				<
				c
				)
				b
				=
				b
				+
				c
				;
				else ---------------- is a Keyword
				a
				=
				c
				;
				return ---------------- is a Keyword
				0
				;
				/   This is under comment....   /   This is under comment....   this_is_new_..
				null
