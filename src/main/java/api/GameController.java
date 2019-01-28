package api;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin(origins= {"*"})
@RestController
public class GameController {
	public GameController(){
		
	}
	
	@RequestMapping(value = "/test", method = RequestMethod.GET)
    public String index() {
        return "Greetings from Spring Boot!";
    }

	
	

}
