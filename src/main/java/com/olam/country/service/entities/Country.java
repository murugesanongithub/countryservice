package com.olam.country.service.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Country {
	@Id
	private List<String> suburbs;

	@Column
	@NotNull
	private List<String> postcode;

	public List<String> getSuburbs() {
		return suburbs;
	}

	public void setSuburbs(List<String> suburbs) {
		this.suburbs = suburbs;
	}

	public List<String> getPostcode() {
		return postcode;
	}

	public void setPostcode(@NotNull List<String> postcode) {
		this.postcode = postcode;
	}
}
