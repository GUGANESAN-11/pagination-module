package com.springprog.pegination.Repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.springprog.pegination.Entity.Userdatadetails;

@Repository
public interface UserRepository extends PagingAndSortingRepository<Userdatadetails,Integer> {

}
