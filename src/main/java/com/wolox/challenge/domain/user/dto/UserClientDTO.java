package com.wolox.challenge.domain.user.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserClientDTO implements Serializable {

	private static final long serialVersionUID = -2258956156789799012L;
	private Long id;
	private String name;
	private String username;
	private String email;
	private AddressClientDTO address;
	private String phone;
	private String website;
	private CompanyClientDTO company;

}
