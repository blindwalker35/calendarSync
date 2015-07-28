package testing;

import java.io.Console;
import java.rmi.RemoteException;
import java.util.Scanner;

import javax.xml.rpc.ServiceException;
import javax.xml.soap.SOAPException;

import openair.objects.CSOARequestOperation;
import openair.objects.CSOASession;
import openair.wsdl.LoginResult;

public class OpenAirDriver {
	private String username;
	private String password;
	private String company;
	private String apiNamespace;
	private String apiKey;
	private String clientName;
	private String clientVersion;
	private CalendarSyncProperties properties;
	
	public OpenAirDriver(CalendarSyncProperties properties)
	{
		this.properties = properties;
	}
	
	public void collectCredentials()
	{
//		Scanner scan =new Scanner(System.in);
//		System.out.println("What is your OpenAir login?");
//		this.username=scan.nextLine();
//		Console console = System.console();
//		this.password= new String(console.readPassword("What is your OpenAir password?"));
//		scan.close();
		
		this.username = this.properties.getProperties().getProperty("username");
		this.password = this.properties.getProperties().getProperty("password");
		this.company = this.properties.getProperties().getProperty("company");
		this.apiNamespace = this.properties.getProperties().getProperty("apiNamespace");
		this.apiKey = this.properties.getProperties().getProperty("apiKey");
		this.clientName = this.properties.getProperties().getProperty("clientName");
		this.clientVersion = this.properties.getProperties().getProperty("clientVersion");
		
	}
	
	public void execute()
	{
		//Get user credentials before starting any testing
		collectCredentials();
		
		//Attempt authentication
		CSOASession csoaSession = new CSOASession("https://sandbox.openair.com/soap");
		LoginResult loginResult = null;
		try {
			csoaSession.login(this.username, this.password, this.company, this.apiNamespace, this.apiKey, this.clientName, this.clientVersion);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SOAPException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		CSOARequestOperation csoaRequestOperation = new CSOARequestOperation(csoaSession);
	}
	
	
	
}
