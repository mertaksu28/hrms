package javakamp.hrms.entities.concretes;

import java.time.LocalDate;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name="verification_codes")
public class VerificationCode {

	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY )
	@Column(name="id")
	private int id;

	
	private int userId;
	@Column(name="code")
	private String code;
	@Column(name="create_date")
	@JsonIgnore
	private LocalDate createDate;
	@Column(name="is_active", columnDefinition = "boolean default false") 
	@JsonIgnore
	private Boolean isActive;
	@Column(name="is_delete")
	@JsonIgnore
	private Boolean isDelete;
	@Column(name="confirmed_date")
	@JsonIgnore
	private LocalDate confirmedDate;
	@Column(name="expired_date")
	private LocalDate expiredDate;
	
	public VerificationCode(int userId, String code, LocalDate expiredDate) {
		super();
		this.userId = userId;
		this.code = code;
		this.expiredDate = expiredDate;
	}
	
	
}
