package com.telstra.codechallenge.hottestrepo;

import java.net.URI;
import java.net.URISyntaxException;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class SpringBootHottestRepoRestService {

	private RestTemplate restTemplate;

	public SpringBootHottestRepoRestService(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}

	public String oldetUserRest(int outCount) {
		System.out.println("outCount**************" + outCount);
		URI baseUrl = null;
		try {
			baseUrl = new URI("https://api.github.com/search/users?sort=joined&order=desc&q=followers:0&jq=2");
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}
		return restTemplate.getForObject(baseUrl, String.class);
	}
}
