package com.telstra.codechallenge.hottestrepo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class OldetUserRestVO {
	private String type;
	private Value value;

	@JsonIgnoreProperties(ignoreUnknown = true)
	@Data
	public class Value {
		private Long id;
		private String html_url;
		private String login;
	}
}
