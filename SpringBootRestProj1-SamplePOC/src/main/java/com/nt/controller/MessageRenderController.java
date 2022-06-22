package com.nt.controller;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // @Controller + (@ResponseBody on all handler methods)
@RequestMapping("/message") // Global Path purely optional
public class MessageRenderController {

	@GetMapping("/generate")
	public ResponseEntity<String> generateMessage() {

		// get the system date and time
		LocalDateTime dt = LocalDateTime.now();
		// get the current hour of the day
		int hour = dt.getHour();
		// b.logic
		String body = null;
		if (hour < 12)
			body = "Good Morning.....";
		else if (hour < 16)
			body = "Good Afternoon...";
		else if (hour < 20)
			body = "Good Evening...";
		else
			body = "Good Night....";
		// Response status object
		HttpStatus status = HttpStatus.OK;
		// prepares ResponseEntity Object having Response body and response status code
		ResponseEntity<String> rs = new ResponseEntity<String>(body, status);
		return rs;
	}

}
