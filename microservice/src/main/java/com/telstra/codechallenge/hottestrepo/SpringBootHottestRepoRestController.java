package com.telstra.codechallenge.hottestrepo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class SpringBootHottestRepoRestController {

	private SpringBootHottestRepoRestService springBootHottestRepoRestService;

	public SpringBootHottestRepoRestController(SpringBootHottestRepoRestService springBootHottestRepoRestService) {
		this.springBootHottestRepoRestService = springBootHottestRepoRestService;
	}

	@GetMapping("oldetUserRest/{outCount}")
	public String oldetUserRest(@PathVariable(value = "outCount") int outCount) {
		return springBootHottestRepoRestService.oldetUserRest(outCount);
	}

}
