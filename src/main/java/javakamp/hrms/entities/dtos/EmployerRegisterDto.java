package javakamp.hrms.entities.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployerRegisterDto {
	
	private String webAddress;
    private String phoneNumber;
    private String companyName;
    private String email;
    private String password;
    private String confirmPassword;

}
