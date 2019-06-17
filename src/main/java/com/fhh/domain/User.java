package com.fhh.domain;

import com.fhh.validation.constrains.ValidCardNumber;

import javax.validation.Valid;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;

/**
 * 功能描述：（）
 *
 * @author: biubiubiu小浩
 * @date: 2019-01-11 15:42
 */
@Valid
public class User {
	@Max(value = 10000)
	private long id;
	@NotNull(message = "")
	private String name;

	// 格式 fhh-00001
	@NotNull
	@ValidCardNumber
	private String cardNumber;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
}