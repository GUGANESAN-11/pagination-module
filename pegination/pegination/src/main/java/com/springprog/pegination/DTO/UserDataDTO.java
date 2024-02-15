package com.springprog.pegination.DTO;

import java.util.List;

import com.springprog.pegination.Common.PaginationMeta;
import com.springprog.pegination.Entity.Userdatadetails;

public class UserDataDTO {

	
    private List<Userdatadetails> userdata;
    private PaginationMeta userPaginationMeta;
    
    
	public List<Userdatadetails> getUserdata() {
		return userdata;
	}
	public void setUserdata(List<Userdatadetails> userdata) {
		this.userdata = userdata;
	}
	public PaginationMeta getUserPaginationMeta() {
		return userPaginationMeta;
	}
	public void setUserPaginationMeta(PaginationMeta userPaginationMeta) {
		this.userPaginationMeta = userPaginationMeta;
	}
    
    
    
    
}
