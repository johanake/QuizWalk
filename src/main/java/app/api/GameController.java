package app.api;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ResponseEntity<Object> login(@RequestParam(value="gameId", defaultValue="gameId") String gameId, @RequestParam(value="userName", defaultValue="userName") String userName){
		ResponseEntity<Object> responseObject = new ResponseEntity<Object>(HttpStatus.OK);
		
		
		
		return responseObject;


	} 

	
	

}
