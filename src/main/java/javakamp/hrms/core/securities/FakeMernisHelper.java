package javakamp.hrms.core.securities;

import java.time.LocalDate;

public class FakeMernisHelper {
	
	public boolean validateByPersonal(String identificationNo, String firstName, String lastName, LocalDate bithDate) {
		
		System.out.println(identificationNo + " " + " T.C. Kimlik numaralı" + " " + firstName + " " + lastName
				+ " kişi personel onaylandı");
		return true;
		
	}

}
