package openair.objects;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPException;

import org.apache.axis.message.SOAPHeaderElement;

import openair.wsdl.LoginParams;
import openair.wsdl.LoginResult;
import openair.wsdl.OAirServiceHandlerServiceLocator;
import openair.wsdl.OAirServiceSoapBindingStub;

/**
 * The purpose of this class is to maintain an OpenAir session. This class will handle authentication and
 * ensure that the operations on OpenAir data can proceed.
 * @author ttakahashi
 *
 */


public class CSOASession {
	private String sessionID;
	private OAirServiceHandlerServiceLocator oaservice;
	private OAirServiceSoapBindingStub stub;
	private final String OA_SERVICE_ENDPOINT = "https://www.openair.com/soap";
	private final String OA_SERVICE_URL = "http://www.openair.com/OAirService";
	
	/**
	 * Constructor using default OpenAir web service endpoint.
	 */
	public CSOASession()
	{
		this.oaservice = new OAirServiceHandlerServiceLocator();
		this.oaservice.setOAirServiceEndpointAddress(this.OA_SERVICE_ENDPOINT);
	}
	
	/**
	 * Constructor using custom OpenAir web service endpoint.
	 * @param endpoint	The endpoint URL. Example: https://www.openair.com/soap
	 */
	public CSOASession(String endpoint)
	{
		this.oaservice = new OAirServiceHandlerServiceLocator();
		this.oaservice.setOAirServiceEndpointAddress(endpoint);
	}
	
	/**
	 * Login to the OpenAir API service as a user. Various credentials are required to access the API service.
	 * 
	 * @param username	Username to login to OpenAir with.
	 * @param password	Password for the user to login to OpenAir.
	 * @param company	Company ID for the user.
	 * @param apiNamespace	Namespace for the API.
	 * @param apiKey	The API key obtained from OpenAir to make requests.
	 * @param clientName	The name of the client.
	 * @param version	The version of the client.
	 * @throws ServiceException	Thrown if unable to obtain an OpenAirService client.
	 * @throws RemoteException	Thrown if unable to login with provided credentials.
	 * @throws SOAPException	Thrown if unable to set sessionID into SOAPHeader.
	 */
	
	public void login(String username, String password, String company, String apiNamespace,
			String apiKey, String clientName, String version)
					throws ServiceException, RemoteException, SOAPException
	{
		//Throws ServiceException if unable to create service client
		stub = (OAirServiceSoapBindingStub) this.oaservice.getOAirService();
		
		//Set up login parameters to authenticate with OpenAir
		LoginParams loginParams = new LoginParams();
		loginParams.setUser(username);
		loginParams.setPassword(password);
		loginParams.setCompany(company);
		loginParams.setApi_namespace(apiNamespace);
		loginParams.setApi_key(apiKey);
		loginParams.setClient(clientName);
		loginParams.setVersion(version);
		
		//Throws RemoteException if login fails
		LoginResult loginResult = stub.login(loginParams);
		
		//Throws SOAPException if error setting child element
		SOAPHeaderElement header = new SOAPHeaderElement(this.OA_SERVICE_URL, "SessionHeader");
		SOAPElement node = header.addChildElement("sessionId");
		
		//Set session ID in header
		node.addTextNode(loginResult.getSessionId());
		stub.setHeader(header);
		
		this.sessionID = loginResult.getSessionId();
	}
	
	public String getSessionID(){return this.sessionID;}
	public OAirServiceSoapBindingStub getStub(){return this.stub;}
	
	
	
}
