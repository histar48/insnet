package com.insutil.insnet.memer.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.google.gson.JsonObject;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "TN_QA_USER")
public class MemberVO {
	
	@Id
	@Column(name = "ID_USER", length=20, nullable=false)
	private String username;
	

	public JsonObject makeReturnToJson() {
		JsonObject jsonObject = new JsonObject();
		jsonObject.addProperty("username", username);
		
		return jsonObject;
	}
}
