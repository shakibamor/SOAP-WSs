package jaxws;



import javax.xml.ws.Endpoint;

public class SOAPPublisher {

	public static void main(String[] args) {
		 Endpoint.publish("http://localhost:8888/wsexample/person", new PersonServiceImpl());  
	}

}