package com.springprog.pegination.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;

import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import com.springprog.pegination.Common.APIResponse;
import com.springprog.pegination.Common.PaginationMeta;
import com.springprog.pegination.DTO.UserDataDTO;
import com.springprog.pegination.Entity.Userdatadetails;
import com.springprog.pegination.Repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userrepository;
	
	
	public APIResponse getUserDetails(Pageable pageable) {
		
		APIResponse apiresponse = new APIResponse();
		
		UserDataDTO userDataDTO = new UserDataDTO();
		
		Page<Userdatadetails> userdoc = userrepository.findAll(pageable);		
		java.util.List<Userdatadetails> UserData = userdoc.getContent();		
		PaginationMeta userPaginationMeta=PaginationMeta.createPagination(userdoc);
		
		
		userDataDTO.setUserdata(UserData);
		userDataDTO.setUserPaginationMeta(userPaginationMeta);
		
		apiresponse.setData(userDataDTO);
		
		return apiresponse;
	}

}
