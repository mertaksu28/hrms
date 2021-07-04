package javakamp.hrms.entities.concretes;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="cities")
public class Location {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
//	@Column(name="country_name")
//	private String countryName;
	
	@Column(name="city_name")
	private String cityName;
//	
//	@Column(name="region_name")
//	private String regionName;
//	
//	@Column(name="street_address")
//	private String streetAddress;
//	
//	@Column(name="postal_code")
//	private String postalCode;
//	
//	@Column(name="create_date")
//	@JsonIgnore
//	private LocalDate createDate;
//	
//	@Column(name="is_active", columnDefinition = "boolean default false") 
//	@JsonIgnore
//	private Boolean isActive;
//
}
