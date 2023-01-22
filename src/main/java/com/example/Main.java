package com.example;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;

public class Main {
	public static void main(String[] args) {
		final String body = "{\n"
				+ "  \"profile\": {\n"
				+ "    \"userData\": {\n"
				+ "      \"338282892\": [\n"
				+ "        {\n"
				+ "          \"userIdentifier\": \"98shdub777hsjjsuj23\",\n"
				+ "          \"detail\": \"Test User DEV\",\n"
				+ "          \"type\": \"customer\"\n"
				+ "        }\n"
				+ "      ]\n"
				+ "    }\n"
				+ "  }\n"
				+ "}";
		try {
			ObjectMapper mapper = new ObjectMapper();
			SimpleModule module = new SimpleModule();
			module.addDeserializer(UserData.class, new UserDataDeserializer());
			mapper.registerModule(module);
			UserProfileModel model = mapper.readValue(body, UserProfileModel.class);
			System.out.println(model.getProfile().getUserData().getUserDataContent());
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
