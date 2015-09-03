package openair.objects;

import generics.objects.CSConstants;

import java.rmi.RemoteException;

import openair.wsdl.Attribute;
import openair.wsdl.OaBase;
import openair.wsdl.OaBooking_request;
import openair.wsdl.OaTimesheet;
import openair.wsdl.ReadRequest;
import openair.wsdl.ReadResult;

public class CSOABooking {
	private CSOASession session;

	public CSOABooking(CSOASession session)
	{
		this.session = session;
	}

	public void retrieveBookings(String bookingID)
	{
		ReadRequest [] reads = new ReadRequest[CSConstants.OPENAIR_REQUEST_COUNT_LIMIT];
		reads[0] = new ReadRequest();
		reads[0].setType("Booking_request");
		reads[0].setMethod("equal to");

		OaBooking_request bookingRequest = new OaBooking_request();
		bookingRequest.setId(bookingID);
		
		reads[0].setObjects(new OaBase[]{bookingRequest});

		//Code to test multiple operations in a single request.
//		reads[1] = new ReadRequest();
//		reads[1].setType("Booking_request");
//		reads[1].setMethod("equal to");
//
//		OaBooking_request bookingRequest2 = new OaBooking_request();
//		bookingRequest2.setId("2915");
//		
//		reads[1].setObjects(new OaBase[]{bookingRequest2});
		//
		
		int limit = 1000;

		Attribute attr = new Attribute();
		attr.setName("limit");
		attr.setValue(String.format("%1$d", CSConstants.OPENAIR_RESPONSE_COUNT_LIMIT));
		reads[0].setAttributes(new Attribute[]{attr});

		System.out.println("Fetching booking requests....");

		ReadResult [] results = null;
		try {
			results = session.getStub().read(reads);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

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
