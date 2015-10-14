package openair.objects;

import org.apache.axis.encoding.DeserializationContext;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.message.SOAPHandler;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;

public class OpenAirDeserializer extends BeanDeserializer {
	public OpenAirDeserializer(java.lang.Class javaType, javax.xml.namespace.QName xmlType, org.apache.axis.description.TypeDesc typeDesc)
	{
		super(javaType, xmlType, typeDesc);
	}

	public SOAPHandler onStartChild(String arg0, String arg1, String arg2, Attributes arg3, DeserializationContext arg4) throws SAXException
	{
		// TODO Auto-generated method stub
		try{
			return super.onStartChild(arg0, arg1, arg2,arg3, arg4);
		}catch (SAXException e){
			return null;
		}
	}
}
