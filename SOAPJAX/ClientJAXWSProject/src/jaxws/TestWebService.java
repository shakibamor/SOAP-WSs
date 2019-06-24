package jaxws;
import java.util.Arrays;

public class TestWebService {

	public static void main(String[] args) {
		
		PersonServiceImplService serviceImpl = new PersonServiceImplService();
		
		PersonService service = serviceImpl.getPersonServiceImplPort();
		
		Person p1 = new Person(); p1.setName("Shakiba"); p1.setId(1); p1.setAge(30);
        Person p2 = new Person(); p2.setName("Mamad"); p2.setId(2); p2.setAge(30);
        
        //add person
        service.addPerson(p1);
       service.addPerson(p2);
        
      //get person
        System.out.println(service.getPerson(1));
         
        //get all persons
        System.out.println(Arrays.asList(service.getAllPersons()));
         
        
	}

}