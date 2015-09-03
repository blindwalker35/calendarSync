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
import openair.objects.CSOABooking;
import openair.objects.CSOASession;
import openair.wsdl.LoginResult;
import openair.wsdl.OAirServiceHandlerServiceLocator;
import testing.CalendarSyncProperties;

/**
 * This class should never be instantiated by itself. All instances of this class should be provided through
 * the OpenAirCalendarFactory class.
 * 
 * @author ttakahashi
 *
 */

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
	
	/**
	 * Protected visibility so only the OpenAirCalendarFactory has access to this class.
	 * @param properties The CalendarSyncProperties object that contains all the properties to be laoded for this method.
	 */
	protected OpenAirCalendar(CalendarSyncProperties properties)
	{
		this.properties = properties;
		collectCredentials();
	}
	
	/**
	 * No real need for this method, just isolating code that extracts data from actual initialization.
	 */
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
	
	protected void login()
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
	
	/**
	 * Should remove this method as soon as all OpenAir operations are moved into this class
	 * @return
	 */
	public CSOASession getSession(){return this.csoaSession;}
	
	public List<CSEvent> getBookingRequest()
	{
		CSOABooking csoaBooking = new CSOABooking(this.csoaSession);
		csoaBooking.retrieveBookings("2911");
		return null;
	}
	

	@Override
	public ArrayList<CSEvent> getEvents(Map<String, String> requestParams) {
		String operationType = requestParams.get(CSConstants.REQUEST_PARAM_OPERATION_TYPE);
		return null;
	}

	@Override
	public void setEvent(CSEvent event, Map<String, String> requestParams) {
		// TODO Auto-generated method stub
		
	}
	
}
