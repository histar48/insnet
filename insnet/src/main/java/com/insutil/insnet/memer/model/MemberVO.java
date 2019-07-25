package com.insutil.insnet.memer.model;

import com.google.gson.JsonObject;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class MemberVO {

	private String username;

	public JsonObject makeReturnToJson() {
		JsonObject jsonObject = new JsonObject();
		jsonObject.addProperty("username", username);
		
		return jsonObject;
	}
}
