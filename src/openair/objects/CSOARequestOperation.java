package openair.objects;

import java.rmi.RemoteException;

import openair.wsdl.MakeURLRequest;
import openair.wsdl.MakeURLResult;
import openair.wsdl.OaEnvelope;
import openair.wsdl.OaTimesheet;

public class CSOARequestOperation {
	private CSOASession session;
	
	public CSOARequestOperation(CSOASession session)
	{
		this.session=session;
	}
	
	public void testRequest()
	{
		MakeURLRequest make = new MakeURLRequest();
		make.setUid(this.session.getSessionID());
		make.setApp("ta");
		make.setPage("list-timesheets");
		
		OaTimesheet timesheet = new OaTimesheet();
		timesheet.setId("1");
		make.setArg(timesheet); 
		
		MakeURLResult[] mkresults = null;
		try {
			mkresults = this.session.getStub().makeURL(new MakeURLRequest[] {make});
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(MakeURLResult result: mkresults)
		{
			System.out.println("1");
		}
	}
}
