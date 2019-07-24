package com.insutil.insnet.memer.model;

import com.google.gson.JsonObject;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Member {

	private String username;

	public JsonObject makeReturnToJson() {
		JsonObject jsonObject = new JsonObject();
		jsonObject.addProperty("username", username);
		
		return jsonObject;
	}
}
