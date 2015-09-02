package testing;

import generics.objects.CSConstants;

import java.io.Console;
import java.rmi.RemoteException;
import java.util.Scanner;

import javax.xml.rpc.ServiceException;
import javax.xml.soap.SOAPException;

import openair.calendar.OpenAirCalendar;
import openair.objects.CSOABooking;
import openair.objects.CSOARequestOperation;
import openair.objects.CSOASession;
import openair.wsdl.LoginResult;

public class OpenAirDriver {
	private CalendarSyncProperties properties;
	
	public OpenAirDriver(CalendarSyncProperties properties)
	{
		this.properties = properties;
	}
	
	public void execute()
	{
		//Get user credentials before starting any testing
		OpenAirCalendar oac = new OpenAirCalendar(this.properties);
		
//		CSOARequestOperation csoaRequestOperation = new CSOARequestOperation(csoaSession);
//		csoaRequestOperation.testRequest();
		
		CSOABooking csoaBooking = new CSOABooking(oac.getSession());
		csoaBooking.retrieveBookings("2911");
	}
	
	
	
}
