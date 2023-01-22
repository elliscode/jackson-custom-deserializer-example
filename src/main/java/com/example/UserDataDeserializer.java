package com.example;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class UserDataDeserializer extends JsonDeserializer<UserData> {
	@Override
	public UserData deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JsonProcessingException {
		List<List<UserDataContent>> output = new ArrayList<>();
		ObjectMapper mapper = new ObjectMapper();
		JsonNode jsonNode = p.getCodec().readTree(p);
		Iterator<JsonNode> iterator = jsonNode.elements();
		while (iterator.hasNext()) {
			JsonNode value = iterator.next();
			System.out.println(value);
			List<UserDataContent> obj = mapper.convertValue(value, new TypeReference<List<UserDataContent>>() {
			});
			output.add(obj);
		}
		UserData returnVal = new UserData();
		returnVal.setUserDataContent(output);
		return returnVal;
	}
}
