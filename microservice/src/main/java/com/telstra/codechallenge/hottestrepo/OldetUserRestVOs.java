package com.telstra.codechallenge.hottestrepo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class OldetUserRestVOs {

	@JsonProperty("oldetUserRestVOs")
	OldetUserRestVOs[] oldetUserRestVOs;

	public void setOldetUserRestVOs(OldetUserRestVOs[] oldetUserRestVOs) {
		this.oldetUserRestVOs = oldetUserRestVOs;
	}

	public void getOldetUserRestVOs() {
		return;
	}
}
