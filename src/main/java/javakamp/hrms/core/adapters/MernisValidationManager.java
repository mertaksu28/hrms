package javakamp.hrms.core.adapters;

import java.time.LocalDate;

import javakamp.hrms.core.securities.FakeMernisHelper;

public class MernisValidationManager implements MernisValidationService {

	@Override
	public boolean validateByMernis(String identificationNo, String firstName, String lastName, LocalDate bithDate) {
		
		FakeMernisHelper fakeMernisHelper = new FakeMernisHelper();
		
		boolean result = true;
		
		try {
			result = fakeMernisHelper.validateByPersonal(identificationNo, firstName, lastName, bithDate);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
		
	}

}
