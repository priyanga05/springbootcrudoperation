package com.leavemanagement.SpringBootCrud.repository;

import org.springframework.data.repository.CrudRepository;

import com.leavemanagement.SpringBootCrud.bean.Leave;
//mport com.leavemanagement.SpringBootCrud.bean.leave;

public interface LeaveRepository extends CrudRepository<Leave,Long> {
  Leave findById(long id);
  
  //String deleteById(long id);
}
