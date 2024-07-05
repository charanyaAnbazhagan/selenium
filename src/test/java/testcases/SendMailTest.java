package testcases;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import utils.AppUtils;

public class SendMailTest extends AppUtils{
@Parameters({"email","sub"})	
@Test
	public void SendMail(String MailId,String sub) {
		// TODO Auto-generated method stub
System.out.println("mail sent to:"+MailId+"with the subject:"+sub);
	}

}
