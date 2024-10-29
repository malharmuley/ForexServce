package com.forexservice.ForexService.Service;

import java.util.List;

import com.forexservice.ForexService.Dto.UserBankDetailsDto;
import com.forexservice.ForexService.Entity.UserBankDetails;

public interface UserBankDetailsService {
	
public UserBankDetailsDto saveBankDetails(UserBankDetailsDto bankDto) ;
	
	
	public List<UserBankDetails> getAllBankDetails();

}
