package openair.calendar;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.xml.rpc.ServiceException;
import javax.xml.soap.SOAPException;

import generics.exceptions.CSCalendarEventOverlapsException;
import generics.objects.CSCalendar;
import generics.objects.CSConstants;
import generics.objects.CSEvent;
import openair.objects.CSOASession;
import openair.wsdl.LoginResult;
import openair.wsdl.OAirServiceHandlerServiceLocator;
import testing.CalendarSyncProperties;

public class OpenAirCalendar extends CSCalendar{
	
	//Attributes required to make OpenAir API Calls
	private String username;
	private String password;
	private String company;
	private String apiNamespace;
	private String apiKey;
	private String clientName;
	private String clientVersion;
	
	//The properties file to load OpenAir credentials from
	private CalendarSyncProperties properties;
	
	//Creates the session object from openair from authentication
	private CSOASession csoaSession;
	
	public OpenAirCalendar(CalendarSyncProperties properties)
	{
		this.properties = properties;
		collectCredentials();
		/*possible to fail login if bad credentials...wouldn't really want to throw an exception in the constructor
		 *but also don't want the possibility of using this class without logging in first. 
		 **/
		login(); 
	}
	
	private void collectCredentials()
	{
		
		this.username = this.properties.getProperties().getProperty("username");
		this.password = this.properties.getProperties().getProperty("password");
		this.company = this.properties.getProperties().getProperty("company");
		this.apiNamespace = this.properties.getProperties().getProperty("apiNamespace");
		this.apiKey = this.properties.getProperties().getProperty("apiKey");
		this.clientName = this.properties.getProperties().getProperty("clientName");
		this.clientVersion = this.properties.getProperties().getProperty("clientVersion");
		
	}
	
	private void login()
	{
		//Attempt authentication
		CSOASession session = new CSOASession(CSConstants.OPENAIR_SANDBOX_ENDPOINT);
		LoginResult loginResult = null;
		try
		{
			session.login(this.username, this.password, this.company, this.apiNamespace, this.apiKey, this.clientName, this.clientVersion);
			this.csoaSession = session;
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
	}
	
	public CSOASession getSession(){return this.csoaSession;}
	
	public List<CSEvent> getBookingRequest()
	{
		
		return null;
	}
	

	@Override
	public ArrayList<CSEvent> getEvents(Map<String, String> requestParams) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setEvent(CSEvent event, Map<String, String> requestParams) {
		// TODO Auto-generated method stub
		
	}
	
}
