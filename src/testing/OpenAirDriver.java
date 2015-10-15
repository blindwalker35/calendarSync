package testing;

import generics.objects.CSConstants;
import generics.objects.CSEvent;
import google.calendar.GoogleCalendar;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;

import openair.calendar.CSOAOPERATIONS;
import openair.calendar.OpenAirCalendar;
import openair.calendar.OpenAirCalendarFactory;
import openair.wsdl.OaBase;
import openair.wsdl.OaBooking;
import openair.wsdl.OaBooking_request;
import openair.wsdl.ReadResult;

public class OpenAirDriver {
	private CalendarSyncProperties properties;
	private final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

	public OpenAirDriver(CalendarSyncProperties properties)
	{
		this.properties = properties;
	}

	public void execute()
	{
		//Get user credentials before starting any testing
		OpenAirCalendarFactory oacf = new OpenAirCalendarFactory();
		OpenAirCalendar oac = oacf.getInstanceOfOpenAirCalendar(this.properties);

		//Ray = 57
		//Brian = 78
		//Nick T = 59 - I don't have access
		
		String testUID = "78";
		
		//testGetBookingsByUserID(oac,testUID);
		//testGetBookingRequestsByUserID(oac, testUID);
		//testGettingUsernameFromUserID(oac,testUID);
		testAbstractMethodGetEventsForBookingsByUID(oac, testUID);
	}

//	private void testGetBookingsByUserID(OpenAirCalendar oac, String uid)
//	{
//
//		oac.getBookingByUserID(uid);
//		System.out.println("Fetching bookings....");
//
//		ReadResult[] results = oac.submitReadRequest();
//		OaBooking resBooking;
//		for(ReadResult result: results)
//		{
//			if(result.getObjects() != null)
//			{
//				System.out.println("Reading " + result.getObjects().length + " booking(s)");
//				OaBase[] retObjects = result.getObjects();
//				for(OaBase object: retObjects)
//				{
//					resBooking = (OaBooking) object;
//					System.out.println("Creation date: " + resBooking.getCreated());
//					System.out.println("Start date: "+resBooking.getStartdate());
//					System.out.println("End date: "+resBooking.getEnddate());
//					System.out.println("Status:" + resBooking.getApproval_status());
//					System.out.println("ProjectAssignmentProfileID: " + resBooking.getProject_assignment_profileid());
//					System.out.println("ProjectID: " + resBooking.getProjectid());
//					OaBase[] bookingAttrs = resBooking.getAttributes();
//
//					if(bookingAttrs != null)
//					{
//						for(OaBase attribute: bookingAttrs)
//						{
//							System.out.println("Value: " + attribute.toString());
//							System.out.println("Class: " + attribute.getClass());
//						}
//					}
//
//					System.out.println("Notes: "+resBooking.getNotes());
//					System.out.println(""+resBooking.getSource_booking_id());
//					System.out.println("User ID: " + resBooking.getUserid());
//					System.out.println("Booking TypeID: "+resBooking.getBooking_typeid());
//				}
//			}
//		}
//		System.out.println("Finished reading bookings...");
//	}
//
//	
//	private void testGetBookingRequestsByUserID(OpenAirCalendar oac, String uid)
//	{
//
//		oac.getBookingRequestByUserID(uid);
//		System.out.println("Fetching booking requests....");
//
//		ReadResult[] results = oac.submitReadRequest();
//		OaBooking_request resBookingRequest;
//		for(ReadResult result: results)
//		{
//			if(result.getObjects() != null)
//			{
//				System.out.println("Reading " + result.getObjects().length + " booking(s)");
//				OaBase[] retObjects = result.getObjects();
//				for(OaBase object: retObjects)
//				{
//					resBookingRequest = (OaBooking_request) object;
//					System.out.println("Creation date: " + resBookingRequest.getCreated());
//					System.out.println("Start date: "+resBookingRequest.getStartdate());
//					System.out.println("End date: "+resBookingRequest.getEnddate());
//					System.out.println("Status:" + resBookingRequest.getApproval_status());
//					OaBase[] bookingAttrs = resBookingRequest.getAttributes();
//
//					if(bookingAttrs != null)
//					{
//						for(OaBase attribute: bookingAttrs)
//						{
//							System.out.println("Value: " + attribute.toString());
//							System.out.println("Class: " + attribute.getClass());
//						}
//					}
//
//					System.out.println("Name: "+resBookingRequest.getName());
//					System.out.println("Number: "+resBookingRequest.getNumber());
//					System.out.println("Project ID: "+resBookingRequest.getProject_id());
//					System.out.println("Project task ID: "+resBookingRequest.getProject_task_id());
//					System.out.println("Description: "+resBookingRequest.getDescription());
//					System.out.println("Customer ID: "+resBookingRequest.getCustomer_id());
//					System.out.println("User ID: " + resBookingRequest.getUser_id()); //the user_id number of the resource booked on this request
//				}
//			}
//		}
//		System.out.println("Finished reading booking requests...");
//	}
	
	private void testAbstractMethodGetEventsForBookingsByUID(OpenAirCalendar oac, String userID)
	{
		Map<String,String> requestParams = new HashMap<String, String>();
		requestParams.put(CSConstants.REQUEST_PARAM_START_DATE, "2015-09-15 0:0:0");
		requestParams.put(CSConstants.REQUEST_PARAM_END_DATE, "2015-10-14 23:59:59");
		requestParams.put(CSConstants.REQUEST_PARAM_OPERATION_TYPE, CSOAOPERATIONS.BOOKINGS_BY_UID.value());
		requestParams.put(CSConstants.REQUEST_PARAM_OPENAIR_USERID, userID);
		
		ArrayList<CSEvent> events = null;
		try {
			events = oac.getEvents(requestParams);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Reading events...");
		for(CSEvent event: events)
		{
			System.out.println("Subject: " + event.getSubject());
			System.out.println("Description: " + event.getDescription());
			System.out.println("Start Date: " + event.getStartDate());
			System.out.println("End Date: " + event.getEndDate());
			System.out.println("=================================");
		}
		System.out.println("Finished reading events...");
	}



}
