package com.himanshu.smsau;
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
import java.io.*;  
import java.util.Scanner; 
public class App 
{
    
    	

        public static void main(String[] args) throws FileNotFoundException {
        	Scanner sc = new Scanner(new File("demm.txt"));  
        	sc.useDelimiter(",");    
        	while (sc.hasNext())  
        	{  
        	
        	mess mm = new mess();
        	mm.message1(sc.next());
        	  
        	}   
        	sc.close(); 
        	
    }
}
class mess{
	public void message1(String s)
	{
		try{
		System.out.println(s);
		 String ACCOUNT_SID =
                 "";
           final String AUTH_TOKEN =
                 "";
         Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

         Message message = Message
                 .creator(new PhoneNumber(s), // to
                         new PhoneNumber("+18472304284"), // from
                         "Hello this is himanshu Singh emp id 5090").create();

        
     System.out.println( "Message sent" );
		}
		catch(Exception E)
		{
			System.out.println("Your number is not verified "
					+ "Please verify ur id by the admin");
		}
		
		}
}
