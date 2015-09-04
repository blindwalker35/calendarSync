package testing;

import generics.objects.CSConstants;

import java.io.Console;
import java.rmi.RemoteException;
import java.util.Scanner;

import javax.xml.rpc.ServiceException;
import javax.xml.soap.SOAPException;

import openair.calendar.OpenAirCalendar;
import openair.calendar.OpenAirCalendarFactory;
import openair.objects.CSOABooking;
import openair.objects.CSOASession;
import openair.wsdl.LoginResult;
import openair.wsdl.OaBase;
import openair.wsdl.OaBooking_request;
import openair.wsdl.ReadResult;

public class OpenAirDriver {
	private CalendarSyncProperties properties;
	
	public OpenAirDriver(CalendarSyncProperties properties)
	{
		this.properties = properties;
	}
	
	public void execute()
	{
		//Get user credentials before starting any testing
		OpenAirCalendarFactory oacf = new OpenAirCalendarFactory();
		OpenAirCalendar oac = oacf.getInstanceOfOpenAirCalendar(this.properties);
		
		oac.getBookingRequest("2911");
		oac.getBookingRequest("2915");
		
		System.out.println("Fetching booking requests....");
		
		ReadResult[] results = oac.submitReadRequest();
		OaBooking_request resBookingRequest;
		for(ReadResult result: results)
		{
			if(result.getObjects() != null)
			{
				System.out.println("Reading " + result.getObjects().length + " booking(s)");
				OaBase[] retObjects = result.getObjects();
				for(OaBase object: retObjects)
				{
					resBookingRequest = (OaBooking_request) object;
					System.out.println("Creation date: " + resBookingRequest.getCreated());
					System.out.println("Start date: "+resBookingRequest.getStartdate());
					System.out.println("End date: "+resBookingRequest.getEnddate());
					OaBase[] bookingAttrs = resBookingRequest.getAttributes();

					if(bookingAttrs != null)
					{
						for(OaBase attribute: bookingAttrs)
						{
							System.out.println("Value: " + attribute.toString());
							System.out.println("Class: " + attribute.getClass());
						}
					}
					
					System.out.println("Name: "+resBookingRequest.getName());
					System.out.println("Number: "+resBookingRequest.getNumber());
					System.out.println("Project ID: "+resBookingRequest.getProject_id());
					System.out.println("Project task ID: "+resBookingRequest.getProject_task_id());
					System.out.println("Description: "+resBookingRequest.getDescription());
					System.out.println("Customer ID: "+resBookingRequest.getCustomer_id());
					System.out.println("User ID: " + resBookingRequest.getUser_id()); //the user_id number of the resource booked on this request
				}
			}
		}
		System.out.println("Finished reading bookings...");
	}
	
	
	
}
