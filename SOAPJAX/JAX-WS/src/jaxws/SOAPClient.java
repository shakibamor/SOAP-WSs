package jaxws;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

public class SOAPClient {

	public static void main(String[] args) throws MalformedURLException {
		URL wsdlURL = new URL("http://localhost:8888/wsexample/person?wsdl");
		//check above URL in browser, you should see WSDL file
		
		//creating QName using targetNamespace and name
		QName qname = new QName("http://jaxws/", "PersonServiceImplService"); 
		
		Service service = Service.create(wsdlURL, qname);  
		
		//We need to pass interface and model beans to client
		PersonService ps = service.getPort(PersonService.class);
		
		Person p1 = new Person(); p1.setName("Shakiba"); p1.setId(1); p1.setAge(30);
		Person p2 = new Person(); p2.setName("Mamad"); p2.setId(2); p2.setAge(30);
		
		//add person
		ps.addPerson(p1);
		ps.addPerson(p2);
		
		//get all persons
		System.out.println(Arrays.asList(ps.getAllPersons()));

		
	}

}