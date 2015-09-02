package openair.objects;

import java.rmi.RemoteException;

import openair.wsdl.Attribute;
import openair.wsdl.MakeURLRequest;
import openair.wsdl.MakeURLResult;
import openair.wsdl.OaBase;
import openair.wsdl.OaEnvelope;
import openair.wsdl.OaTimesheet;
import openair.wsdl.ReadRequest;
import openair.wsdl.ReadResult;

public class CSOARequestOperation {
	private CSOASession session;

	public CSOARequestOperation(CSOASession session)
	{
		this.session=session;
	}

	public void testRequest()
	{
		ReadRequest [] reads = new ReadRequest[1];
		reads[0] = new ReadRequest();
		reads[0].setType("Timesheet");
		reads[0].setMethod("equal to");

		OaTimesheet reqTimesheet = new OaTimesheet();
		reqTimesheet.setId("11668");
		reads[0].setObjects(new OaBase[]{reqTimesheet});

		int limit = 1000;
		int index = 0;

		Attribute attr = new Attribute();
		attr.setName("limit");
		attr.setValue(String.format("%1$d", limit));
		reads[0].setAttributes(new Attribute[]{attr});

		System.out.println("Fetching timesheet....");

		ReadResult [] results = null;
		try {
			results = this.session.getStub().read(reads);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		OaTimesheet retTimesheet;
		for(ReadResult result: results)
		{
			if(result.getObjects() != null)
			{
				System.out.println("Read " + result.getObjects().length + " timesheet");
				OaBase[] retObjects = result.getObjects();
				for(OaBase object: retObjects)
				{
					retTimesheet = (OaTimesheet) object;
					System.out.println("User id: " + retTimesheet.getUserid());
					System.out.println("Creation date: " + retTimesheet.getCreated());
					System.out.println("Start date: " + retTimesheet.getStarts());
				}
			}
		}
		System.out.println("Finished reading timesheets...");
	}
}
