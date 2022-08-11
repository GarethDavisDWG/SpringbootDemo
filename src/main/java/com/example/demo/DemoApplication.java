package com.example.demo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	public static AddressBook myAddressBook = new AddressBook();


	@CrossOrigin("http://localhost:3000")
	@GetMapping("/customRoute")
	@ResponseBody
	public String myResponse(){
		return myAddressBook.toString();
	}

	@PutMapping("/change/{id}")
	@ResponseBody
	public void change(@PathVariable int id, @RequestParam String name, @RequestParam String email, @RequestParam String catchPhrase) {
		myAddressBook.changeContact(id,new Contact(name,email,catchPhrase));

	}

	@PutMapping("/add")
	@ResponseBody
	public void change(@RequestParam String name, @RequestParam String email, @RequestParam String catchPhrase) {
		myAddressBook.addContact(new Contact(name,email,catchPhrase));

	}


}

