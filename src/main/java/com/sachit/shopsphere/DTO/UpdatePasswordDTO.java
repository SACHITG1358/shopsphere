package com.sachit.shopsphere.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class UpdatePasswordDTO {
	
	private String compIdEmail;
	private String oldPassword;
	private String newPassword;
}
