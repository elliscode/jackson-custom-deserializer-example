
package com.example;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.processing.Generated;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "UserDataContent" })
@Generated("jsonschema2pojo")
public class UserData {

	@JsonProperty("UserDataContent")
	private List<List<com.example.UserDataContent>> userDataContent = null;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("UserDataContent")
	public List<List<com.example.UserDataContent>> getUserDataContent() {
		return userDataContent;
	}

	@JsonProperty("UserDataContent")
	public void setUserDataContent(List<List<com.example.UserDataContent>> userDataContent) {
		this.userDataContent = userDataContent;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

}
